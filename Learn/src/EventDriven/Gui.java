/*
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.
    ! import javax.swing.JOptionPane; => This library is used to create a GUI window that will ask the user for input using JOptionPane class.

    
*/

/*
    Explaining
    ======================
    ! This is how you create a GUI window that will ask the user for input:
    ! An event driven program is a program that waits for an event to happen
    ! GUI is a type of event driven program that waits for the user to click a button
    ! JOptionPane is a class that is used to create a GUI window
    
*/

/*
    Explaining the code
    ======================
    ? 1 > We import the class
    ? 2 > We create a GUI window that will ask the user for input.
    ? 3 > We create a GUI window
    ? 4 > This is how to redirect user to input a number again if they did not input a number.
    ? 5 > Integer.parseInt() is a method that is used to convert a string to an integer
    
*/

import javax.swing.JOptionPane; // ? 1

public class Gui {
    public static void learn(String[] args) throws Exception {

        String name = JOptionPane.showInputDialog("What is your name?"); // ? 2

        JOptionPane.showMessageDialog(null, "Hello " + name); // ? 3

        try {
            int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?")); // ? 4 , 5
            JOptionPane.showMessageDialog(null, "You are " + age + " years old.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "You did not enter a number");
            learn(args);
        }
    }
}
