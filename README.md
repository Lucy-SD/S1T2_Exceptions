
# 🎓 Java OOP Exercises – Exceptions

**👨‍💻 Author**: Lucy Castro  
**🧠 Learning Focus**: Object-Oriented Programming (OOP) in Java  
**🛠️ IDE**: IntelliJ IDEA  
**💡 Java SDK**: 21  

## 📄 Description
This repository contains structured Java OOP exercises focused on:
- Exception Handling – Learn to create, throw, and handle custom and built-in exceptions in Java.
- Input Validation – Ensure robust user input handling by managing different data types and potential errors.
- Class Design – Practice object-oriented programming (OOP) by defining classes with attributes and methods.
- Control Flow – Implement loops to repeatedly prompt users until valid input is provided.

### 💻 Technologies Used
- ☕ Java 21

- 🧠 IntelliJ IDEA

- 🗃️ Git & GitHub

### 📋 Requirements
- ✅ Java JDK 21
- ✅ IntelliJ IDEA
- ✅ Git
- ✅ Internet connection

### 🛠️ Installation

git clone https://github.com/Lucy-SD/S12_Exceptions

Open in IntelliJ: File > Open > [select folder]

Set SDK: File > Project Structure > Project SDK > JDK 21

### ▶️ Execution
Navigate to the desired exercise package

Open the corresponding Main class

Right-click → Run

### 🌐 Deployment
For educational purposes only.

### 🤝 Contributions
- ⭐ Star the repo

- 🪄 Fork it

- 🛠️ Submit issues

### 🎯 Learning Goals
Exception Handling

Input Validation

Class Design

Control Flow

Thanks for visiting! 🚀




The exercises are organized by level and demonstrate progressive mastery of key OOP concepts.

---

## 📚 Exercise Catalog

## 📂 Level 1: Custom Exception & Class Design

<details>
<summary><b>Exercise 1: Product Sale with Empty Sale Exception</b></summary>

### 📝 Description  
Create a `Product` class (with `name` and `price`) and a `Sale` class (with a product list and total price). The `Sale` class must:  
- Throw a custom `VendaBuidaException` if `calculateTotal()` is called with no products.  
- Sum product prices if the list is not empty.  
- Handle `IndexOutOfBoundsException` explicitly.

## 📂 Level 2 Exercises

### 📋 Description
Create an `Input` class that safely handles user input with comprehensive exception handling using `Scanner`.

## 🎯 Requirements
- Instantiate a `Scanner` object
- Create static methods to read different data types
- Handle exceptions and retry until valid input is received
- Show appropriate error messages (e.g., "Format Error")

## 📝 Methods to Implement

### Handling InputMismatchException
``java
public static byte readByte(String message);
public static int readInt(String message);
public static float readFloat(String message); 
public static double readDouble(String message);
