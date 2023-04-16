package Encapsulation;

public class Encapsulation {
    public static void learn(String[] args) {
        // ? Encapsulation is attributes of a class that will be hidden or private.
        // ? They can only be accessed only through methods called ( getters and setters ).
        // ? You should make attributes private if you dont have a good reason to make them public/protected.

        Car car = new car("BMW", "Black", 2019); // ? This will work because the attributes are public.

        System.out.println(car.model); // ? This will throw an error because model is private.

        System.out.println(car.getModel()); // ? This will work because we are using the getter.
        System.out.println(car.getColor()); // ? This will work because we are using the getter.
        System.out.println(car.getYear()); // ? This will work because we are using the getter.

        Car.year = 2020; // ? This will throw an error because year is private.
        Car.setYear(2020); // ? This will work because we are using the setter.

        System.out.println(car.getYear()); // ? This will work and print the value from 2019 to 2020.
    }
}