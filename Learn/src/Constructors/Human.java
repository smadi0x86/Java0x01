/*
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.
    ! This file Works simultaneously with "Constructors.java".
    ! Read "Java0x01/Learn/Material/CommonQuestions.txt" 18 - 31 and "Constructers.java", before procceding in this file.

    
*/

/*
    Explaining Human.java
    ======================
    ! This is a class that has 3 fields (variables) and a constructor.
    ! The variables must be outside the constructor to be accessible from other methods.
    
*/

/*
    Explaining the code
    ======================
    ? 1 > This is a constructor that takes 3 parameters and sets the values of the fields to the values of the parameters.
    ? 2 > "this" keyword is used to refer to the current object (in this case the object of the Human class).
    ? 3 > We create methods specific or this class

*/

public class Human {

    String name;
    int age;
    int height;

    Human(String name, int age, int height) { // ? 1
        this.name = name; // ? 2
        this.age = age;
        this.height = height;
    }

    void run() { // ? 3
        System.out.println(this.name + " is running");
    }

    void walk() {
        System.out.println(this.name + " is walking");
    }
}