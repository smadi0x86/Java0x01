package Inheritance;

public class Inheritance {
    public static void learn(String[] args) {
        // ! Inheritance is a mechanism in which one class acquires the attributes and methods of another class.
        // * This works simultaneously with "Vehicle.java", "Bicycle.java" and "ElectricCar.java" files.
        // ? So I want the "Bicycle" class and "ElectricCar" class to inherit the attributes and methods of the "Vehicle" class.
        // ! In order to do that, I need to use the "extends" keyword after the class name as shown in the "Bicycle.java" and  "ElectricCar.java" files.
        // * So now the "Bicycle" and "ElectricCar" classes are subclasses or child classes of the "Vehicle" class.

        ElectricCar car = new ElectricCar();

        car.go(); // we can use the "go" method from the "Vehicle" class because the "ElectricCar" class inherits it.

        Bicycle bike = new Bicycle();

        bike.stop();

        System.out.println(car.wheels); // This is unique to the "ElectricCar" class only.
        System.out.println(bike.wheels); // This is unique to the "Bicycle" class only.
    }
}