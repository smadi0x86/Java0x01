/*
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.
    * This file works simultaneously with the "Car.java"
    
*/

/*
    Explaining ToString
    ======================
    ! toString() = A special method that is called when you try to print an object.
    ! It returns a string that "textually represents" the object, textually meaning that it is a string.
    ! You can use it without calling it, or you can call it explicitly.
    ! Its useful when you want to print an object, because it will print the object's properties instead of the object's address in memory.
    
*/

/*
    Explaining the code
    ======================
    ? 1 > This will print the object's address in memory, which is not very useful.
    ? 2 >
*/

//! ------------------------------------------------------ The Code ------------------------------------------------------ //

public class ToString {
    public static void learn(String[] args) {

        Car car = new Car();

        System.out.println(car); // ? 1
        System.out.println(car.toString()); // ? 2

    }
}
