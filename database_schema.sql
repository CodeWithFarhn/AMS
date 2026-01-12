-- Database Schema for Assignment Management System (AMS)
-- Compatible with MS Access / SQL syntax

-- 1. Users Table
CREATE TABLE Users (
    userId AUTOINCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    role VARCHAR(50)
);

-- 2. Teachers Table
CREATE TABLE Teachers (
    teachId AUTOINCREMENT PRIMARY KEY,
    userId INT,
    FOREIGN KEY (userId) REFERENCES Users(userId)
);

-- 3. Students Table
CREATE TABLE Students (
    stdId AUTOINCREMENT PRIMARY KEY,
    userId INT,
    FOREIGN KEY (userId) REFERENCES Users(userId)
);

-- 4. Courses Table
CREATE TABLE Courses (
    courseId AUTOINCREMENT PRIMARY KEY,
    courseName VARCHAR(255),
    teachId INT,
    FOREIGN KEY (teachId) REFERENCES Teachers(teachId)
);

-- 5. StudentCourses Table (Junction Table)
CREATE TABLE StudentCourses (
    id AUTOINCREMENT PRIMARY KEY,
    stdId INT,
    courseId INT,
    FOREIGN KEY (stdId) REFERENCES Students(stdId),
    FOREIGN KEY (courseId) REFERENCES Courses(courseId)
);

-- 6. Assignments Table
CREATE TABLE Assignments (
    assId AUTOINCREMENT PRIMARY KEY,
    title VARCHAR(255),
    description MEMO, -- 'MEMO' for long text in Access, 'TEXT' in others
    duedate VARCHAR(100), -- Storing as string based on usage
    filepath VARCHAR(255),
    courseId INT,
    FOREIGN KEY (courseId) REFERENCES Courses(courseId)
);

-- 7. Submissions Table
CREATE TABLE Submissions (
    subId AUTOINCREMENT PRIMARY KEY,
    assId INT,
    stdId INT,
    subDate VARCHAR(100),
    subfilepath VARCHAR(255),
    grade VARCHAR(50),
    FOREIGN KEY (assId) REFERENCES Assignments(assId),
    FOREIGN KEY (stdId) REFERENCES Students(stdId)
);
