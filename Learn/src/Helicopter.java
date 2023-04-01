public class Helicopter extends Airplane {
    // * This works simultaneously with "Airplane.java" and "Abstraction.java" files.
    // ! This is a subclass of the abstract class "Airplane.java".
    // ! We use extends keyword to inherit from the abstract class and then we implement the abstract method.

    void go() {
        System.out.println("Helicopter is flying");
    }
}
