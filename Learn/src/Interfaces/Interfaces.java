public class Interfaces {
    public static void main(String[] args) {
        // ! Interfaces are used to achieve abstraction in Java
        // ! Interfaces are similar to Inheritance, but they do not have constructors
        // ! Interfaces cannot be instantiated, meaning you cannot create an object of an interface
        // ! Interfaces are implemented by classes using the implements keyword in Java
        // ! Interfaces are better than Inheritance because they do not have the problem of multiple inheritance

        Sheep sheep = new Sheep(); // Object of sheep class
        Lion lion = new Lion(); // Object of lion class
        Panda panda = new Panda(); // Object of panda class

        sheep.escape();
        lion.hunt();

        panda.hunt();
        panda.escape();

    }
}
