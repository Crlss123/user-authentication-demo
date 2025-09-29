# JWT Authentication and Registration with Spring Boot & Spring Security

This project is a **JWT (JSON Web Token) based authentication and registration system** built with **Spring Boot**, **Spring Security**, and **PostgreSQL** as the database. It is designed to be a **modular and reusable implementation** that can be easily integrated into other Spring Boot projects requiring secure user authentication and authorization.

---

## ✨ Features

- **User Registration** – Securely register new users with encrypted passwords.
- **User Authentication** – Generate JWT tokens upon successful login.
- **JWT Authorization** – Protect endpoints with role-based access control.
- **Token Validation** – Validate JWT tokens for incoming requests.
- **Stateless Authentication** – No need for server-side sessions.
- **Easily Extensible** – Ready to be adapted to different project domains.

---

## 🛠️ Technologies Used

- **Java 25**  
- **Spring Boot**
- **Spring Web**
- **Spring Security**  
- **JWT (io.jsonwebtoken / jjwt)**  
- **Maven** 
- **PostgreSQL**

---

## 🔒 Security Notes
- Passwords are stored securely using **BCrypt hashing**
- JWT token are **signed** and **validated** using a given secret key in **Base64**.
- **Stateles** system, that does not depend on HTTP sessions.
