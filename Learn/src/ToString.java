public class ToString {
    public static void learn(String[] args) {

        // ! toString() = A special method that is called when you try to print an object.
        // ! It returns a string that "textually represents" the object, textually meaning that it is a string.
        // ! Can be used both implicitly and explicitly, which means that you can use it without calling it, or you can call it explicitly.
        // ! Its useful when you want to print an object, because it will print the object's properties instead of the object's address in memory.
        // * It works simultaneously with the "Car.java"

        Car car = new Car();

        System.out.println(car); // ? This will print the object's address in memory, which is not very useful.
        // or this:
        System.out.println(car.toString()); // ? This will print the object's address in memory, which is not very useful.

    }
}
