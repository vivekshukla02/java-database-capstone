# MySQL Database Schema Design

This document outlines the relational database architecture designed for the Smart Clinic Management System.

## Tables Schema

### 1. Doctor Table
| Field Name | Data Type | Constraints | Description |
| :--- | :--- | :--- | :--- |
| `id` | BIGINT | PRIMARY KEY, AUTO_INCREMENT | Unique Doctor ID |
| `name` | VARCHAR(255) | NOT NULL | Doctor's full name |
| `specialty` | VARCHAR(100) | NOT NULL | Medical specialty |
| `email` | VARCHAR(100) | UNIQUE, NOT NULL | Professional email |

### 2. Patient Table
| Field Name | Data Type | Constraints | Description |
| :--- | :--- | :--- | :--- |
| `id` | BIGINT | PRIMARY KEY, AUTO_INCREMENT | Unique Patient ID |
| `name` | VARCHAR(255) | NOT NULL | Patient's full name |
| `email` | VARCHAR(100) | UNIQUE, NOT NULL | Contact email for login |
| `phone_number` | VARCHAR(20) | NOT NULL | Contact number |

### 3. Appointment Table
| Field Name | Data Type | Constraints | Description |
| :--- | :--- | :--- | :--- |
| `id` | BIGINT | PRIMARY KEY, AUTO_INCREMENT | Unique Appointment ID |
| `appointment_time` | DATETIME | NOT NULL | Date and time of booking |
| `doctor_id` | BIGINT | FOREIGN KEY REFERENCES Doctor(id) | Linked Doctor |
| `patient_id` | BIGINT | FOREIGN KEY REFERENCES Patient(id) | Linked Patient |

### 4. Prescription Table
| Field Name | Data Type | Constraints | Description |
| :--- | :--- | :--- | :--- |
| `id` | BIGINT | PRIMARY KEY, AUTO_INCREMENT | Unique ID |
| `appointment_id` | BIGINT | FOREIGN KEY REFERENCES Appointment(id) | Linked Appointment |
| `diagnosis` | TEXT | NOT NULL | Medical diagnosis text |
| `medicines` | TEXT | NOT NULL | Prescribed medication list |
