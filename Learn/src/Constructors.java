// * Works simultaneously with Human.java

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

public class Constructors {
    public static void learn(String[] args) throws Exception {
        // ! Constructors are special methods that are called when you create an object
        // of a class
        // ! They are used to initialize the object
        // ! They have the same name as the class
        // ! They don't have a return type
        // ! They are called automatically when you create an object of a class
        // ! They are useful for setting initial values for fields (variables) of the
        // class when you create an object

        // ? Example:

        Human human1 = new Human("John", 20, 180); // ? This is a constructor call from the Human class
        Human human2 = new Human("Jane", 18, 170); // ? This is a constructor call from the Human class

        System.out.println(human1.name); // ? This prints "John"
        System.out.println(human2.name); // ? This prints "Jane"

        human1.run(); // ? This prints "John is running"
        human2.walk(); // ? This prints "Jane is walking"
    }
}
