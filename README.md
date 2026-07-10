# Students-Inside-System

# 🎓 Student Management System

A full-stack **Student Management System** built using **Spring Boot**, **Thymeleaf**, **Spring Security**, and **MySQL**. The application allows administrators to manage students, courses, and enrollments through a clean and responsive web interface.

![Java](https://img.shields.io/badge/Java-17+-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.x-brightgreen)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)
![Bootstrap](https://img.shields.io/badge/Bootstrap-5-purple)
![License](https://img.shields.io/badge/License-MIT-green)

---

## ✨ Features

- 🔐 Secure Login Authentication (Spring Security)
- 👨‍🎓 Student Management (Add, Update, Delete, View)
- 📚 Course Management
- 📝 Student Enrollment Management
- 📊 Dashboard with Statistics
- 🔍 Search & View Student Details
- 🎨 Responsive UI using Bootstrap 5
- 🗄️ MySQL Database Integration

---

## 🛠️ Tech Stack

### Backend
- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate

### Frontend
- Thymeleaf
- HTML5
- CSS3
- Bootstrap 5
- JavaScript

### Database
- MySQL

### Tools
- IntelliJ IDEA
- Maven
- Git
- GitHub

---

## 📂 Project Structure

```
src
 ├── main
 │   ├── java
 │   │   ├── config
 │   │   ├── controller
 │   │   ├── dto
 │   │   ├── exception
 │   │   ├── model
 │   │   ├── repository
 │   │   ├── service
 │   │   └── StudentmanagementApplication.java
 │   └── resources
 │       ├── static
 │       ├── templates
 │       └── application.properties
```

---

## 🚀 Getting Started

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/Deep-destiny/Student-system-management.git
```

---

### 2️⃣ Open the Project

Open the project using IntelliJ IDEA or any Java IDE.

---

### 3️⃣ Configure MySQL

Create a MySQL database.

```sql
CREATE DATABASE student_mgmt_db;
```

Update your `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_mgmt_db
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
```

---

### 4️⃣ Run the Application

Run

```
StudentmanagementApplication.java
```

The application will start on

```
http://localhost:8080
```

---

# 🔑 Demo Login

Username

```
admin
```

Password

```
admin@123
```

---

## 📸 Screenshots

> Add screenshots here.

### Login Page

<img width="640" height="682" alt="image" src="https://github.com/user-attachments/assets/85cfddd6-c4cc-449d-9d21-1f88a988b8e8" />


### Dashboard

<img width="1553" height="742" alt="image" src="https://github.com/user-attachments/assets/3eb34787-31ad-4e6b-bfa7-8ff87d55d5d3" />


### Students

<img width="1522" height="593" alt="image" src="https://github.com/user-attachments/assets/40e996e9-84ba-4728-9407-263299215388" />

### Courses

<img width="1468" height="803" alt="image" src="https://github.com/user-attachments/assets/95f2366b-8f09-4098-a39b-d134b34851c3" />


---

## 📌 Future Enhancements

- Role-Based Access Control
- Student Attendance Module
- Email Notifications
- PDF Report Generation
- REST API Support
- Docker Deployment

---

## 👨‍💻 Author

**Deepak Dhakad**

GitHub:
https://github.com/Deep-destiny

---

## ⭐ Support

If you found this project helpful, consider giving it a ⭐ on GitHub.
