/*
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.

    
*/

/*
    Explaining Math Methods
    ======================
    ! Math is a class that has a bunch of methods that you can use to do math:
    
*/

/*
    Explaining the code
    ======================
    ? 1 > Math.max(x, y); => Returns the larger of the two numbers.
    ? 2 > Math.abs(y); => Returns the absolute value of a number.
    ? 3 > Math.sqrt(9); => Returns the square root of the number.
    ? 4 > Math.pow(2, 3); => Returns the first number to the power of the second number.
    ? 5 > Math.round(3.5); => Returns the number rounded to the nearest integer.
    ? 6 > Math.ceil(3.1); => Returns the number rounded up to the nearest integer.
    ? 7 > Math.floor(3.9); => Returns the number rounded down to the nearest integer.
    ? 8 > Math.random() * 100; => Returns a random number between 0 and 100.
    ? 9 > Math.PI; => Returns the value of pi.

    * In the code below we used Math Methods to find the hyptenuse of a triangle using the Pythagoran therom. 
    
*/

import java.util.Scanner;

public class MathMethods {
    public static void learn(String[] args) throws Exception {

        double x = 3.50;
        double y = -3.20;

        double result = Math.max(x, y); // ? 1
        double result1 = Math.abs(y); // ? 2

        double result2 = Math.sqrt(9); // ? 3
        double result3 = Math.pow(2, 3); // ? 4
        double result4 = Math.round(3.5); // ? 5
        double result5 = Math.ceil(3.1); // ? 6
        double result6 = Math.floor(3.9); // ? 7
        double result7 = Math.random() * 100; // ? 8
        double result8 = Math.PI; // ? 9

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);

        // ! Find the hypotenuse of a right triangle:

        Scanner input = new Scanner(System.in);

        double angle1, angle2, resultOfAngle;

        System.out.println("Enter the first angle: ");
        angle1 = input.nextDouble();

        System.out.println("Enter the second angle: ");
        angle2 = input.nextDouble();

        resultOfAngle = Math.sqrt(Math.pow(angle1, 2) + Math.pow(angle2, 2));

        System.out.println("The hypotenuse is: " + resultOfAngle);

        input.close();
    }
}
