/*
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.
    * Works simultaneously with "DiceRoller.java".

*/

/*
    Explaining Variable Scope
    ======================
    ! Local variables: decalred inside a method and can only be accessed from that method.
    ! Global variables: declared outside a method and can be accessed from anywhere in the class.
    ! I will use a dice roller class to demonstrate the difference between local and global variables.

*/

/*
    Explaining the code
    ======================
    ? 1 > This is how we create an object of a class.
    ? 2 > This is how we access a global variable from another class.

*/

//! ------------------------------------------------------ The Code ------------------------------------------------------ //

public class VariableScope {
    public static void learn(String[] args) throws Exception {

        // ? For example we will create an object of a dice roller class and call the
        // roll method on it:

        DiceRoller diceRoller = new DiceRoller(); // ? 1
        System.out.println(diceRoller.number); // ? 2
    }
}
