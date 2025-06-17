# 🧠 Java OOP Notes — Constructors, `super()`, `this()`, and Class Hierarchy

## 📘 Constructor

- A constructor is a special method used to **initialize objects**.
- It has the **same name** as the class and **no return type**.
- Called **automatically** when an object is created.

### 🔹 Types of Constructors

1. **Default Constructor** – No parameters.
2. **Parameterized Constructor** – Accepts arguments.
3. **Overloaded Constructor** – Multiple constructors with different parameters.

---

## 🧩 `super()` vs `this()` in Constructors

| Feature       | `super()`                            | `this()`                              |
|---------------|--------------------------------------|----------------------------------------|
| Purpose       | Calls **parent class constructor**   | Calls **another constructor in same class** |
| Auto-inserted | ✅ Yes (if not written manually)     | ❌ No (must be written manually)       |
| Position      | Must be the **first line** in constructor | Must be the **first line** in constructor |

### ✅ `super()` Example

```java
class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // optional, compiler adds it
        System.out.println("Dog constructor");
    }
}
```
### ✅ this() Example
```java
class Car {
    Car() {
        this("Default");  // calls another constructor
    }

    Car(String model) {
        System.out.println("Model: " + model);
    }
}
```
## 🧱 Every Class is a Subclass of Object
In Java, every class automatically extends java.lang.Object if no parent is specified.

That means:

```java

class MyClass {
    // Same as: class MyClass extends Object
}
```
### 🔍 Proof
```java
class MyClass {}

public class Test {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println(obj instanceof Object); // Output: true ✅
    }
}
```
### 📦 Common Methods Inherited from Object
**toString()**

**equals(Object obj)**

**hashCode()**

**getClass()**

**clone()**

## ✅ Summary
Constructor: Used to initialize objects when they're created.

***super()***: Calls parent class constructor. Added automatically by Java if omitted.

***this()***: Calls another constructor in the same class. Must be written manually.

**Object class:** The root of all Java classes. All classes inherit from it, directly or indirectly.


