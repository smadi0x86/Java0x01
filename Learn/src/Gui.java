import javax.swing.JOptionPane; // ? This library is used to create a GUI window that will ask the user for input

public class Gui {
    public static void learn(String[] args) {
        // ! This is how you create a GUI window that will ask the user for input:
        // ! An event driven program is a program that waits for an event to happen
        // ! GUI is a type of event driven program that waits for the user to click a button
        // ! JOptionPane is a class that is used to create a GUI window

        String name = JOptionPane.showInputDialog("What is your name?"); // ? This will create a GUI window that will ask the user for input

        JOptionPane.showMessageDialog(null, "Hello " + name); // ? This will create a GUI window

        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?")); // ? Integer.parseInt() is a method that is used to convert a string to an integer

        JOptionPane.showMessageDialog(null, "You are " + age + " years old.");
    }
}
