# 📘 Week 1: Introduction to Object-Oriented Programming (OOP)

Welcome to **Week 1** of the *Object-Oriented Programming (OOP)* syllabus! This week lays the foundation for your OOP journey by helping you understand the core ideas behind the paradigm.

---

## 🎯 Objectives

By the end of this week, you should be able to:

- Understand what Object-Oriented Programming is.
- Differentiate between Procedural and OOP paradigms.
- Learn key terminologies like class, object, and method.
- Understand the importance and advantages of OOP in software development.

---

## 📖 Topics Covered

### ✅ 1. What is OOP?

**Object-Oriented Programming (OOP)** is a programming paradigm based on the concept of "objects", which can contain data and code that manipulates that data. It promotes code reuse, scalability, and maintainability.

> Example: A car is an object that has properties like color, brand, and model — and behaviors like drive() and brake().

---

### ✅ 2. Key OOP Terminologies

| Term       | Description |
|------------|-------------|
| **Class**  | Blueprint for creating objects. |
| **Object** | Instance of a class. |
| **Attribute** | Variable associated with an object. |
| **Method** | Function defined inside a class. |



---

## 🧱 Core Concepts

### 1. **Class**
- Blueprint for creating objects.
- Defines properties (fields) and behaviors (methods).

### 2. **Object**
- Instance of a class.
- Contains actual values for the properties defined in the class.

### 3. **Encapsulation**
- Bundling data and methods that operate on that data into a single unit (class).
- Provides controlled access to the internal state via access modifiers.

### 4. **Inheritance**
- Mechanism for creating new classes based on existing ones.
- Promotes code reuse and hierarchical relationships.

### 5. **Polymorphism**
- Ability for different classes to be treated as instances of the same class through a common interface.
- Achieved through method overloading and overriding.

### 6. **Abstraction**
- Hiding implementation details and showing only the essential features.
- Achieved using abstract classes and interfaces.

---

### ✅ 3. Procedural vs OOP

| Procedural Programming         | Object-Oriented Programming         |
|-------------------------------|-------------------------------------|
| Focuses on functions and logic | Focuses on objects and classes      |
| Less reusable code             | Highly reusable and maintainable   |
| Poor real-world modeling       | Real-world modeling through objects |
| Not secure the data can be accessed by other functions |More Secure - Access Specifiers protects the data.(public,private,protected and default).
---

### ✅ 4. Advantages of OOP

- ✅ Modular structure (code is divided into objects)
- ✅ Reusability (through inheritance)
- ✅ Scalability (easy to extend)
- ✅ Maintainability (encapsulation and abstraction)
- ✅ More Secure

---

## 🧪 Practice

### 🧑‍💻 Task: Real-World Examples

List 5 real-world entities and identify:

- Their attributes (properties)
- Their behaviors (methods)

**Example:**
```text
Entity: Bank Account
Attributes: accountNumber, balance, accountHolder
Methods: deposit(), withdraw(), checkBalance()
```
## 💡 Code Sample (Java)
```java
// A simple example to define a class and create an object

class Student {
    // Attributes
    String name;
    int age;

    // Method
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();   // Object created
        s1.name = "Alice";
        s1.age = 20;
        s1.displayInfo();
    }
}

```

## ✅ Summary
This week introduced the foundational ideas of Object-Oriented Programming. You now understand:

What OOP is and why it's useful

Core terms like class and object

How to model real-world entities in code