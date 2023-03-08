import java.util.Scanner;

public class MathMethods {
    public static void learn(String[] args) throws Exception {
        // ! Math is a class that has a bunch of methods that you can use to do math:

        double x = 3.50;
        double y = -3.20;

        double result = Math.max(x, y); // ? returns the larger of the two numbers
        double result1 = Math.abs(y); // ? return number without the negative sign

        double result2 = Math.sqrt(9); // ? returns the square root of the number
        double result3 = Math.pow(2, 3); // ? returns the first number to the power of the second number
        double result4 = Math.round(3.5); // ? returns the number rounded to the nearest integer
        double result5 = Math.ceil(3.1); // ? returns the number rounded up to the nearest integer
        double result6 = Math.floor(3.9); // ? returns the number rounded down to the nearest integer
        double result7 = Math.random() * 100; // ? returns a random number between 0 and 100
        double result8 = Math.PI; // ? returns the value of pi

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

        resultOfAngle = Math.sqrt(Math.pow(angle1, 2) + Math.pow(angle2, 2)); // ? Pythagorean theorem

        System.out.println("The hypotenuse is: " + resultOfAngle);

        input.close();
    }
}
