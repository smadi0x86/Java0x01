/*
                                    !! This File is yet to be documented !!
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.
                            
    
*/

/*
    Explaining
    ======================
    
*/

/*
    Explaining the code
    ======================
    
*/

//! ------------------------------------------------------ The Code ------------------------------------------------------ //


package Abstraction;

public class Abstraction {
    public static void learn(String[] args) {
        // ! Abstract classes cannot be used to create objects but they can have subclasses, which means that you can inherit from them.
        // ! Abstract methods are declared without an implementation, and they are implemented by the subclass.
        // ! Abstraction is secure because it hides the implementation details and only shows the functionality to the user.
        // ! We use the abstract keyword to create an abstract class or method as shown in "Airplane.java" file.
        // * This works simultaneously with "Airplane.java" and "Helicopter.java" files.

        Helicopter helicopter = new Helicopter();

        helicopter.go();
        // ? Let's pretend that we went to buy an airplane, we ask the sales person for a airplane, they will reply of what type of airplane we want, our question is generic (abstract) which is general, but the type of airplane is specific.
    }
}
