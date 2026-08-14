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

Part Meaning

---

`Employee` Class
`emp1`, `emp2`, `emp3` Reference variables
`new Employee()` Creates the object

### Important Terminology

- `emp1`, `emp2`, `emp3` = **reference variables**
- `new Employee()` = **creates an object**

## Methods

1. A class can contain multiple methods.
2. Each method is separate.
3. One method cannot be written inside another method.
4. main() and display() are separate methods.

## Example Structure

Employee
├── Variables
│ ├── eid
│ ├── ename
│ ├── job
│ └── sal
│
├── display()
└── main()

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

Employee emp1 = new Employee();
Employee emp2 = new Employee();
