/*
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.

*/

/*
    Explaining Objects
    ======================
    ! > Objects are instances of classes.
    ! > Objects are created using the "new" keyword.
    ! > Example: <classname> <objectname> = new <classname>();.
    ! > Objects are created in the heap memory and are referenced by a variable in
        ! the stack memory (the variable is a pointer to the object).
    ! > Objects are useful for storing attributes and methods (functions) in a single place.
    ! > Objects can only be created inside the main method or inside another method that is called from the main
        ! method or use the static keyword to create the object in the class itself.

*/

/*
    Explaining the code
    ======================
    * Creating a class:
    ? 1 > Create a class either in another Java file or in the same file.
    ? 2 > Create attributes in the class.
    ? 3 > Create methods in the class.

    * Inctantiating an object:
    ? 4 > To create an object out of a class you have to use the "new" keyword. => Car myCar = new Car();
    ? 5 > You can access the methods and attributes for the object using ".". => myCar.Manufacturer , myCar.accelerate()
    ? 6 > You can seperate attributes from methods as methods are followed by "()", while attributes don't

*/

//! ------------------------------------------------------ The Code ------------------------------------------------------ //

public class Objects {
    public static void learn(String[] args) throws Exception {

        Car myCar = new Car(); // ? 4

        // ? 5 , 6
        System.out.println("Manufacturer: " + myCar.Manufacturer);
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Year: " + myCar.year);

        // ? 5 , 6
        myCar.accelerate();
        System.out.println("Speed: " + myCar.speed);

        myCar.brake();
        System.out.println("Speed: " + myCar.speed);
    }

    // ? 1 > This is the Car class that we created an object from
    public static class Car {
        // ? 2 > Attributes
        String Manufacturer = "Toyota";
        String brand = "Camry";
        int year = 2019;
        int speed;

        // ? 3 > Methods
        public void accelerate() {
            System.out.println("Accelerating...");
            for (int i = 0; i < 120; i++) {
                speed += 1;
            }
        }

        public void brake() {
            if (speed == 120) {
                System.out.println("Warning: You are going too fast, automatic braking activated!");
                System.out.println("Braking...");
                for (int i = 0; i < 120; i++) {
                    speed -= 1;
                }

            }
        }
    }
}
