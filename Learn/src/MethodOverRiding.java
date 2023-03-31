public class MethodOverRiding {
    public static void learn(String[] args) {
    // ! Method overriding is declaring a method in a subclass that is already present in the parent class.
    // ! It is done so that a child class can give its own implementation to a method.
    // ! It's simply using the same method but with a different implementation for the needs of the child class.
    // * This works simultaneously with "Animal.java" and "Dog.java" files.

        Dog dog = new Dog();

        dog.speak();
    }
}
