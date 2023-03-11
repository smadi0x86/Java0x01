<h1 align="center">
  <br>
  <a href="https://github.com/smadi0x01/Java0x01"><img src="https://k.top4top.io/p_2626rtqyz1.gif" alt="programming.logo"></a>

### 👉 **Before getting started read [Studyplan](https://github.com/smadi0x01/Java0x01/blob/main/Learn/StudyPlan.txt) for guidance.**

+ [Getting Started ](#Getting-Started)
+ [Introduction](#Introduction)
+ [Object Orientation](#Object-Orientation)
+ [How is the code written?](#How-is-the-code-written)
+ [Important](#Important)
+ [Resources](#Resources)
+ [License](#License)
+ [Contributing](#Contributing)
+ [Acknowledgments](#Acknowledgments)

## Getting Started

- **Hello this is smadi, I'll be happy to help you with object oriented programming in java.**
- **I decided to try a new study technique called teach to learn, which means that I'll be teaching you the basics of object oriented programming in java and I'll be learning it at the same time.**
```
Note: I won't be explaining the basics of programming, I'll be explaining the basics of object oriented programming in java, I believe you got the basics of programming from the previous course which was C programming.
```

## Introduction

```
Firstly, Lets start with the basics of object oriented programming:
```
- **Object oriented programming is programming based on the concept of "objects".**

### So what is an object in simple words❔

- **An object is a real world structure that has some properties and can perform certain actions.**
```
Such as a car it has properties like color, model, year, etc. and can perform actions like drive, stop, etc.
```

## Object Orientation

```
So in object oriented programming we model/describe real world objects as classes and then create objects from these classes.
```
- **Lets define classes as templates and objects as instances of these templates, think of it as a form that you fill out to create a new object.**

- **Now lets talk about methods and attributes, methods are actions that an object can perform and attributes are properties of an object.**

### Difference between methods and attributes❔

- **Methods are functions that are defined inside a class.**
- **Attributes are variables that are defined inside a class.**
```
An example would be a car class that has a method called drive and an attribute called color.
```

## How is the code written

- **Until now we have talked about classes, objects, methods and attributes.**

- **So how is the code written? well, lets take a look at this example:**
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
- **This is a simple class that describes a car, it has 3 attributes and 1 method.**

- **Now lets create an object from this class:**
```java
Car car = new Car();
```
- **Now we have created an object from the Car class and we can access its attributes and methods:**
```java
car.color = "red";
car.model = "BMW";
car.year = 2018;
car.drive();
```

- **You saw the**
```java
Car car = new Car();
```
- **This is how we create an object from a class, the new keyword is reserved and is used to create an object from a class.**
- **You can also create multiple objects from the same class:**
```java
Car car1 = new Car();
Car car2 = new Car();
etc...
```

## Important

- **I'll be explaining the object oriented programming in two related files for every concept, I'll be uploading them in the next few days, so stay tuned.**

- **Also, after that we will be explaining methods for different data types and how to use them.**

- **Note: There will be .java files to show a real world example and there is a documentation with the same .java file but it ends with .txt that explains the code.**
```
For Example: Variables.java and Variables.txt will explain real world code and documentation of variables in java.
```

## Resources

- **I'll be adding some resources in the [references](https://github.com/smadi0x01/Java0x01/blob/main/Learn/references.txt) file:**

```
If you struggle with the java syntax you can visit this link: https://introcs.cs.princeton.edu/java/11cheatsheet/
```

## License

```
This project is licensed under the MIT License - see the LICENSE file for details.
```

## Contributing

- **Contributions are what make the open source community such an amazing place to be learn, inspire, and create.**
- **Any contributions you make are greatly appreciated.**

**1. Fork the Project**
**2. Create your Feature Branch** (`git checkout -b feature/AmazingFeature`)
**3. Commit your Changes** (`git commit -m 'Add some AmazingFeature'`)
**4. Push to the Branch** (`git push origin feature/AmazingFeature`)
**5. Open a Pull Request**

## Acknowledgments

```
Hat tip to anyone whose code was used 🎩
```
