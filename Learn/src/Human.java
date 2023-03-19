// * Works simultaneously with Constructors.java

/*
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.

    
*/

/*
    Explaining
    ======================
    !!!!! This file is yet to be documented !!!!!
    
*/

/*
    Explaining the code
    ======================
    
*/

public class Human {
    // ! This is a class that has 3 fields (variables) and a constructor
    // ! The variables must be outside the constructor to be accessible from other
    // methods

    String name;
    int age;
    int height;

    Human(String name, int age, int height) {
        // ? This is a constructor that takes 3 parameters and sets the values of the
        // fields to the values of the parameters
        // ? "this" keyword is used to refer to the current object (in this case the
        // object of the Human class)
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void run() {
        System.out.println(this.name + " is running");
    }

    void walk() {
        System.out.println(this.name + " is walking");
    }
}