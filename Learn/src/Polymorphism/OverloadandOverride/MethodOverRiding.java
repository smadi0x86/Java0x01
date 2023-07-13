/*
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.
    * This works simultaneously with "Animal.java" and "Dog.java" files.

*/

/*
    Explaining Method Overriding
    ======================
    ! Method overriding is declaring a method in a subclass that is already present in the parent class.
    ! It is done so that a child class can give its own implementation to a method.
    ! It's simply using the same method but with a different implementation for the needs of the child class.

*/

/*
    Explaining the code
    ======================

*/

//! ------------------------------------------------------ The Code ------------------------------------------------------ //

public class MethodOverRiding {
    public static void learn(String[] args) {

        Dog dog = new Dog();

        dog.speak();

        Animal animal = new Animal();

        animal.speak();
    }
}
