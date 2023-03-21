// * Works simultaneously with VariableScope.java

/*
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.
    ! Works simultaneously with "VariableScope.java".
    ! import java.util.Random; +> This is the random class that we will use to generate random numbers

    
*/

/*
    Explaining DiceRoller
    ======================
    ! This is a program that uses a random class that is pre built in by java, 
    ! Eventually gives a random number between any 2 numbers you give to by: random.nextInt(10) + 1 = random number betweem 1 to 10
    
*/

/*
    Explaining the code
    ======================
    ? 1 > We import the class
    ? 2 > This is global variable that we can access from anywhere in the class
*/

import java.util.Random; // ? 1

public class DiceRoller {

    Random random; // ? 2
    int number = 0;

    DiceRoller() {

        // ? If we put the variables here they won't be global variables and we won't be
        // able to access them from anywhere in the class.
        // * Try moving the int number = 0; to here and see what happens.
        random = new Random();
        roll();
    }

    void roll() {

        number = random.nextInt(10) + 1; // ? This is how we generate a random number between 1 and 10
    }
}
