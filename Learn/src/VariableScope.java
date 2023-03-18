// * Works simultaneously with DiceRoller.java

public class VariableScope {
    public static void learn(String[] args) throws Exception {
        // ! Local variables: decalred inside a method and can only be accessed from that method
        // ! Global variables: declared outside a method and can be accessed from anywhere in the class
        // ! I will use a dice roller class to demonstrate the difference between local and global variables


        // ? For example we will create an object of a dice roller class and call the roll method on it:

        DiceRoller diceRoller = new DiceRoller(); // ? This is how we create an object of a class
        System.out.println(diceRoller.number); // ? This is how we access a global variable from another class
    }
}

