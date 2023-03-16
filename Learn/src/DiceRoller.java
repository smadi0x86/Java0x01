import java.util.Random; // ? This is the random class that we will use to generate random numbers

public class DiceRoller {

    Random random; // ? This is global variable that we can access from anywhere in the class
    int number = 0;

    DiceRoller() {

        // ? If we put the variables here they won't be global variables and we won't be able to access them from anywhere in the class
        // * Try moving the int number = 0; to here and see what happens
        random = new Random();
        roll();
    }

    void roll() {

        number = random.nextInt(10) + 1; // ? This is how we generate a random number between 1 and 10
    }
}
