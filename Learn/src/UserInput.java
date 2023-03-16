/*
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.
    ! Scanner is a class that you can use to read input from the console.
    ! You must import "java.util.Scanner" to read user input.
    ! The scanner in Java is a class, so you have to make an object to read user input.
*/

/*
    Explaining the code
    ======================
    * import java.util.Scanner; :
    ? This is how you import the Scanner class from the java.util package to use Scanner object.

    * Reading user input:
    ? 1 > We have to create a scanner object that will read the input from the console => Scanner scanner = new Scanner(System.in);.
    ? 2 > You'll have create a varisble to store the user input.
    ? 3 > You'll have to to use the "next" method for the scanner object to read the user input. => String name = scanner.nextLine();.
    ? 4 > The data type of the variable must natch the type of the method.
    ? 5 > close the scanner object. => scanner.close();.

    * The "next" method:
    ? For each data type there is a next method. => nextInt , nextLong..... .
    ? The data type of the variable must match the method. => int x = scanner.nextInt , long x = scanner.nextLong.
    ? For the "String" data type there are two methods:
        ! next(): Reads only one word. It stops reading when a space is entered. 
        ! nextLine(): Reads spaces with words. It stops reading ONLY when an "Enter" is entered. 
*/

//! ------------------------------------------------------ The Code ------------------------------------------------------ //

import java.util.Scanner; // ? This is how you import the Scanner class from the java.util package to use Scanner object

public class UserInput {
    public static void learn(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in); // ? 1

        System.out.println("What is your name?");
        String name = scanner.nextLine(); // ? 2 , 3 , 4

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        scanner.nextLine(); // ? This is to clear the buffer of the scanner object so that the next call to
                            // nextLine() will not return an empty string

        System.out.println("What is your favorite color?");
        String color = scanner.nextLine();

        System.out.println("Hello " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your favorite color is " + color + ".");

        scanner.close(); // ? 5
    }
}
