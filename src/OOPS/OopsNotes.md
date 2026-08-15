# Object-Oriented Programming

## Main OOP Concepts

1.  Class
2.  Object
3.  Polymorphism
4.  Encapsulation
5.  Inheritance
6.  Data Abstraction

---

## Class

**Class = collection of attributes and behavior.**

Examples:

```text
Animal   → Cat, Dog, Elephant, Horse
Student  → Kim, David, Scott
Employee → John, Smith, Mary
```

A class acts as a **blueprint** for creating objects.

### Class Characteristics

1.  Collection of variables and methods
2.  Logical entity / blueprint
3.  Does not occupy memory for an object instance

### Define a Class

```java
class Employee {
    // variables
    // methods
}
```

---

## Object

**Object = instance of a class.**

### Object Characteristics

1.  Object is an instance of a class
2.  Object is a physical entity
3.  Object occupies memory
4.  Multiple objects can be created from one class

### Define / Create Objects

```java
Employee emp1 = new Employee();
Employee emp2 = new Employee();
Employee emp3 = new Employee();
```

Here:

| Part                   | Meaning             |
| ---------------------- | ------------------- |
| `Employee`             | Class               |
| `emp1`, `emp2`, `emp3` | Reference variables |
| `new Employee()`       | Creates the object  |

### Important Terminology

- `emp1`, `emp2`, `emp3` = **reference variables**
- `new Employee()` = **creates an object**

## Methods

1. A class can contain multiple methods.
2. Each method is separate.
3. One method cannot be written inside another method.
4. main() and display() are separate methods.

## Example

```java
void display() {
System.out.println(eid);
System.out.println(ename);
System.out.println(job);
System.out.println(sal);
}
```

In this example, objects are created inside main():

```java
Employee emp1 = new Employee();
Employee emp2 = new Employee();
```

# Methods and Constructors

## Methods

A method is a block of code defined inside a class to perform a specific task.

Methods provide **code reusability** and can be invoked through an object.

### Method Characteristics

- Method name can be any valid name.
- A method may or may not return a value.
- If a method does not return a value, use `void`.
- A method can take parameters/arguments.
- Methods are called/invoked explicitlythrough object.
- Methods are used to implement logic.

### Types of Methods

1. No parameters, no return value
2. No parameters, with return value
3. With parameters, no return value
4. With parameters, with return value

---

## Assigning Data to Class Variables

There are three ways covered in the video:

1. Direct access using the object reference variable
2. Using a user-defined method
3. Using a constructor

---

## Constructors

A constructor is a special class member used to initialize data when an object is created.

### Constructor Characteristics

- Constructor name must match the class name.
- Constructor never returns a value (not even `void`).
- We don't specify `void`.
- Constructor can take parameters/arguments.
- Constructor is invoked automatically when an object is created.
- Constructor is used for initializing the values of variables.

### Types of Constructors

1. Default Constructor
2. Parameterized Constructor

---

## Methods vs Constructors

|                 | Method                           | Constructor               |
| --------------- | -------------------------------- | ------------------------- |
| **Purpose**     | Perform / implement logic        | Initialize object data    |
| **When used**   | When explicitly called           | When object is created    |
| **Calling**     | Called explicitly                | Invoked automatically     |
| **Name**        | Can have any valid name          | Must match the class name |
| **Return type** | Can have a return type or `void` | No return type            |
| **Parameters**  | Can have parameters              | Can have parameters       |

### Simple way to remember

**Constructor → Initialize the object**

**Method → Perform an action / implement logic**
