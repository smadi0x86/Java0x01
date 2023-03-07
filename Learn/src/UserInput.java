import java.util.Scanner; // ? This is how you import the Scanner class from the java.util package

public class UserInput {
    public static void learn(String[] args) throws Exception {
        // ! Scanner is a class that you can use to read input from the console:

        Scanner scanner = new Scanner(System.in); // ? This is how you create a scanner object that will read the input from the console

        System.out.println("What is your name?"); // ? this is how you print to the console
        String name = scanner.nextLine(); // ? this is how you read a line of input from the console

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        scanner.nextLine(); // ? This is to clear the buffer of the scanner object so that the next call to nextLine() will not return an empty string

        System.out.println("What is your favorite color?");
        String color = scanner.nextLine();

        System.out.println("Hello " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your favorite color is " + color + ".");

        scanner.close(); // ? This is how you close the scanner object
    }
}
