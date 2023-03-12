public class Objects {
    public static void learn(String[] args) throws Exception {
        // ! Objects are instances of classes
        // ! Objects are created using the "new" keyword
        // ! Example: <classname> <objectname> = new <classname>();
        // ! Objects are created in the heap memory and are referenced by a variable in the stack memory (the variable is a pointer to the object)
        // ! Objects is useful for storing attributes and methods (functions) in a single place
        // ! Objects can only be created inside the main method or inside another method that is called from the main method or use the static keyword to create the object in the class itself

        Car myCar = new Car(); // ? This is how we create an object of the Car class

        System.out.println("Manufacturer: " + myCar.Manufacturer);
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Year: " + myCar.year);

        myCar.accelerate();
        System.out.println("Accelerating...");
        System.out.println("Speed: " + myCar.speed);

        myCar.brake();
        System.out.println("Braking...");
        System.out.println("Speed: " + myCar.speed);
    }

    // ? This is the Car class that we created an object from
    public static class Car {
        // ? Attributes
        String Manufacturer = "Toyota";
        String brand = "Camry";
        int year = 2019;
        int speed;

        // ? Methods
        public void accelerate() {
            for (int i = 0; i < 120; i++) {
                speed += 1;
            }
        }

        public void brake() {
            if (speed == 120) {
                System.out.println("Warning: You are going too fast, automatic braking activated!");
                for (int i = 0; i < 120; i++) {
                    speed -= 1;
                }
            }
        }
    }
}
