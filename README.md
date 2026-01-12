<div align="center">
  <img src="src/main/resources/images/projectLOgo.jpeg" alt="AMS Logo" width="200">
  <h1>Assignment Management System (AMS)</h1>
  <p><strong>Streamlining Education through Technology</strong></p>
  <p>A comprehensive desktop application for managing academic assignments, courses, and grading.</p>
  <p>Developed for <strong>Object Oriented Programming (Semester 2)</strong></p>

  <!-- Badges -->
  ![Java](https://img.shields.io/badge/Java-JDK%2022-ed8b00?style=flat&logo=openjdk&logoColor=white)
  ![Swing](https://img.shields.io/badge/GUI-Java%20Swing-orange?style=flat&logo=java)
  ![Maven](https://img.shields.io/badge/Build-Maven-C71A36?style=flat&logo=apachemaven&logoColor=white)
  ![Access](https://img.shields.io/badge/Database-MS%20Access-b7472a?style=flat&logo=microsoftaccess&logoColor=white)
  ![License](https://img.shields.io/badge/License-MIT-blue?style=flat)

</div>

---

## 📋 Table of Contents

- [Overview](#-overview)
- [Key Features](#-key-features)
- [Technology Stack](#-technology-stack)
- [Architecture](#-architecture)
- [Getting Started](#-getting-started)
- [Project Configuration](#-project-configuration)
- [Project Structure](#-project-structure)
- [Database Schema](#-database-schema)
- [Contributing](#-contributing)
- [License](#-license)

---

## 📖 Overview

**AMS (Assignment Management System)** is a robust desktop application designed to bridge the gap between students, teachers, and administrators. Built with a focus on Object-Oriented principles, it provides a centralized platform for course registration, assignment distribution, submission tracking, and grading.

This project was developed as a core coursework requirement for the **Object Oriented Programming** module (2nd Semester), demonstrating practical application of inheritance, encapsulation, polymorphism, and the MVC (Model-View-Controller) architectural pattern.

### Key Highlights

- **Role-Based Access Control** - Secure login for Admins, Teachers, and Students.
- **Dynamic Course Management** - flexible assignment and course allocation.
- **Integrated Grading System** - seamless feedback loop from teacher to student.
- **Portable Database** - Embedded MS Access database for easy deployment.
- **Modern Java Swing UI** - User-friendly forms and dashboards.

---

## ✨ Key Features

### 🎓 For Students
- **Dashboard**: personalized view of academic progress.
- **Course Registration**: Browse and self-register for available modules.
- **Assignment Hub**:
    - Download assignment briefs/resources.
    - Upload submissions (assignments) directly within the app.
    - View submission deadlines.
- **Gradebook**: View grades and feedback for completed work.

### 👩‍🏫 For Teachers
- **Course Administration**: Overview of taught courses.
- **Assignment Management**:
    - Create new assignments with descriptions and due dates.
    - Attach resource files for students.
- **Grading Portal**:
    - View list of student submissions.
    - Assign grades and feedback.
- **Student Tracking**: Monitor enrollment in your courses.

### �️ For Administrators
- **User Management**: Add, update, or remove Students and Teachers.
- **System Oversight**:
    - View all registered users.
    - Manage global course list.
    - Assign teachers to courses.

---

## 🛠 Technology Stack

### Core Technologies

| Technology | Version | Purpose |
| :--- | :--- | :--- |
| **Java JDK** | 22 | Core Language & Runtime |
| **Java Swing** | - | Graphical User Interface (GUI) |
| **Maven** | 3.x | Dependency Management & Build Tool |
| **MS Access** | 2010+ | Relational Database System |

### Libraries & Dependencies

| Library | Version | Description |
| :--- | :--- | :--- |
| **UCanAccess** | 5.0.1 | JDBC Driver for MS Access |
| **SLF4J** | 2.0.7 | Logging Facade |
| **Logback** | 1.4.11 | Logging Implementation |

---

## 🏗 Architecture

The project follows a layered architecture to separate concerns and ensure maintainability.

```mermaid
graph TD
    Client[GUI Layer (Swing Forms)] --> Mgmt[Management Layer (Facades)]
    Mgmt --> DAO[DAO Layer (Data Access Objects)]
    DAO --> DB[(MS Access Database)]

    subgraph "Application Logic"
    Mgmt
    end

    subgraph "Data Persistence"
    DAO
    end
```

*   **GUI Layer**: `GUIForms` package containing JFrame classes.
*   **Management Layer**: `ManagementClasses` package acting as a facade/controller between UI and Data.
*   **DAO Layer**: `DAO` package handling direct SQL operations.
*   **Entity Layer**: `EntityClasses` representing the data model (POJOs).

---

## 🚀 Getting Started

### Prerequisites

Ensure you have the following installed on your machine:

- **Java Development Kit (JDK) 22** (or compatible newer version)
- **Maven**
- **Git**

### Installation

1.  **Clone the Repository**
    ```bash
    git clone https://github.com/your-username/AMS.git
    cd AMS
    ```

2.  **Build the Project**
    ```bash
    mvn clean compile
    ```

3.  **Run the Application**
    ```bash
    mvn exec:java
    ```
    *Alternatively, run the `GUIForms.SignIn` class directly from your IDE.*

---

## ⚙️ Project Configuration

### Database Connection
The application uses an embedded **Microsoft Access** database (`AMS.accdb`) located in the project root.

Configuration is managed in `src/main/resources/application.properties`:
```properties
db.url=jdbc:ucanaccess://./AMS.accdb;newDatabaseVersion=V2010
```

> **Note**: A pre-configured `AMS.accdb` file is included in the repository, so the application runs out-of-the-box. If you wish to reset the data, you can recreate the database using the provided `database_schema.sql` script.

---

## 📂 Project Structure

```
AMS/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── DAO/               # SQL & Database Interaction
│   │   │   ├── Database/          # Connection Handler
│   │   │   ├── EntityClasses/     # Data Models (User, Course, etc.)
│   │   │   ├── GUIForms/          # User Interface Screens
│   │   │   ├── ManagementClasses/ # Business Logic
│   │   │   └── Security/          # Auth Utilities
│   │   └── resources/
│   │       ├── images/            # Icons and Logos
│   │       ├── application.properties
│   │       └── logback.xml
├── target/                        # Build Artifacts
├── AMS.accdb                      # Database File
├── database_schema.sql            # SQL Schema Definition
├── pom.xml                        # Project Dependencies
└── README.md                      # Documentation
```

---

## 🗄️ Database Schema

The database consists of 7 relational tables designed to minimize redundancy.

| Table | Description |
| :--- | :--- |
| **Users** | Base table for all user credentials (Admin, Teacher, Student). |
| **Student** | Extension of Users, specific to student attributes. |
| **Teachers** | Extension of Users, specific to teacher attributes. |
| **Courses** | Academic modules managed by teachers. |
| **Assignments** | Tasks created within a course. |
| **Submissions** | Student work uploaded for an assignment. |
| **StudentCourses** | Junction table for course enrollment. |

*See `database_schema.sql` for the full DDL.*

---

## 🤝 Contributing

Since this is an academic project, direct contributions to the `main` branch may be restricted. However, suggestions are welcome!

1.  Fork the repository.
2.  Create a feature branch (`git checkout -b feature/NewFeature`).
3.  Commit your changes.
4.  Push to the branch.
5.  Open a Pull Request.

---

## � License

This project is open-source and available under the [MIT License](LICENSE).

---

<div align="center">
  <p>Made with ❤️ using Java & Maven</p>
  <p>⭐ Star this repo if you find it helpful!</p>
</div>
