

### 📘 `README.md`

```markdown
# 📚 Book Management System

A simple Java console-based application to manage books using JDBC and MySQL.

## 🛠️ Tech Stack

- Java (JDK 8+)
- JDBC (Java Database Connectivity)
- MySQL Database
- MySQL Connector/J (.jar)

---

## 📂 Project Structure

```

BookManager/
├── lib/
│   └── mysql-connector-j-9.3.0.jar  (excluded from repo)
├── Book.java
├── BookDAO.java
├── DBConnection.java
├── BookApp.java
├── .gitignore
└── README.md

````

---

## 🚀 How to Run

### 1️⃣ Prerequisites
- Java installed (check using `java -version`)
- MySQL installed and running
- Create a database named `bookdb` in MySQL

### 2️⃣ Setup MySQL

```sql
CREATE DATABASE bookdb;

USE bookdb;

CREATE TABLE books (
  id INT PRIMARY KEY AUTO_INCREMENT,
  title VARCHAR(100),
  author VARCHAR(100),
  price DOUBLE
);
````

### 3️⃣ Download MySQL Connector JAR

> 💡 This is required for JDBC to connect with MySQL

Download from:
👉 [https://dev.mysql.com/downloads/connector/j/](https://dev.mysql.com/downloads/connector/j/)

Place it in your `lib/` folder.

---

### 4️⃣ Compile and Run

If you're using terminal:

```bash
javac -cp .;lib/mysql-connector-j-9.3.0.jar *.java
java -cp .;lib/mysql-connector-j-9.3.0.jar BookApp
```

> On Mac/Linux, replace `;` with `:` in classpath

---

## 📄 Features

* Add new books
* View all books
* Search by author
* Delete books
* Update book info

---

## 🔐 Note

`.jar` and `.class` files are excluded from the repository using `.gitignore`. You must download the `.jar` file yourself and place it in the `lib/` folder.

---

## 🙋‍♀️ Author

👩 Nandhini Ponnaboina
GitHub: [@Nandhini-9524](https://github.com/Nandhini-9524)

---

## 🏷️ License

This project is open-source and free to use.

````

---

Let me know if you'd like a version customized with more features or screenshots. Once done, save this file as `README.md` in your project and commit it:

```bash
git add README.md
git commit -m "Add README for Book Management System"
git push origin main
````
