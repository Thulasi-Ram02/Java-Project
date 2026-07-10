CREATE DATABASE IF NOT EXISTS studentdb;

USE studentdb;

CREATE TABLE IF NOT EXISTS students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    age INT NOT NULL,
    course VARCHAR(50) NOT NULL
);

INSERT INTO students(name, age, course)
VALUES
('Rahul', 20, 'Java'),
('Priya', 21, 'Python'),
('Arjun', 22, 'SQL');
