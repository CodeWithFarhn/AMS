package Security;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class PasswordUtil {

    private static final int ITERATIONS = 10000;
    private static final int KEY_LENGTH = 256;
    private static final String ALGORITHM = "PBKDF2WithHmacSHA256";
    private static final String SALT_SEPARATOR = ":";

    // Returns a salted hash of the password
    public static String hashPassword(String password) {
        char[] passwordChars = password.toCharArray();
        byte[] salt = getSalt();

        byte[] hash = hash(passwordChars, salt);

        // Return format: salt:hash (Base64 encoded)
        return Base64.getEncoder().encodeToString(salt) + SALT_SEPARATOR + Base64.getEncoder().encodeToString(hash);
    }

    // Verifies the password against the stored hash
    public static boolean verifyPassword(String password, String storedHash) {
        if (storedHash == null || !storedHash.contains(SALT_SEPARATOR)) {
            return false; // Invalid hash format (maybe plaintext?)
        }

        String[] parts = storedHash.split(SALT_SEPARATOR);
        byte[] salt = Base64.getDecoder().decode(parts[0]);
        byte[] hash = Base64.getDecoder().decode(parts[1]);

        byte[] testHash = hash(password.toCharArray(), salt);

        return Arrays.equals(hash, testHash);
    }

    private static byte[] getSalt() {
        SecureRandom sr = new SecureRandom();
        byte[] salt = new byte[16];
        sr.nextBytes(salt);
        return salt;
    }

    private static byte[] hash(char[] password, byte[] salt) {
        PBEKeySpec spec = new PBEKeySpec(password, salt, ITERATIONS, KEY_LENGTH);
        Arrays.fill(password, Character.MIN_VALUE); // Clear password from memory
        try {
            SecretKeyFactory skf = SecretKeyFactory.getInstance(ALGORITHM);
            return skf.generateSecret(spec).getEncoded();
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new AssertionError("Error while hashing a password: " + e.getMessage(), e);
        } finally {
            spec.clearPassword();
        }
    }
}
