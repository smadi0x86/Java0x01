+ [Getting Started ](#Getting-Started)
+ [Introduction](#Introduction)
+ [Object Orientation](#Object-Orientation)
+ [How is the code written?](#How-is-the-code-written?)

## Getting Started

- Hello this is smadi, I'll be happy to help you with object oriented programming in java.
- I decided to try a new study technique called teach to learn, which means that I'll be teaching you the basics of object oriented programming in java and I'll be learning it at the same time.
```
Note: I won't be explaining the basics of programming, I'll be explaining the basics of object oriented programming in java, I believe you got the basics of programming from the previous course which was C programming.
```

## Introduction
```
Firstly, Lets start with the basics of object oriented programming:
```
- Object oriented programming is programming based on the concept of "objects".

### So what is an object in simple words?
- An object is a real world structure that has some properties and can perform certain actions.
Such as a car it has properties like color, model, year, etc. and can perform actions like drive, stop, etc.

## Object Orientation
```
So in object oriented programming we model/describe real world objects as classes and then create objects from these classes.
```
- Lets define classes as templates and objects as instances of these templates, think of it as a form that you fill out to create a new object.

- Now lets talk about methods and attributes, methods are actions that an object can perform and attributes are properties of an object.

### Difference between methods and attributes:
- Methods are functions that are defined inside a class.
- Attributes are variables that are defined inside a class.
```
An example would be a car class that has a method called drive and an attribute called color.
```
## How is the code written?

- Until now we have talked about classes, objects, methods and attributes.

- So how is the code written? well, lets take a look at this example:
```java
class Car {
    String color;
    String model;
    int year;

    void drive() {
        System.out.println("Driving");
    }
}
```
- This is a simple class that describes a car, it has 3 attributes and 1 method.

- Now lets create an object from this class:
```java
Car car = new Car();
```
- Now we have created an object from the Car class and we can access its attributes and methods:
```java
car.color = "red";
car.model = "BMW";
car.year = 2018;
car.drive();
```