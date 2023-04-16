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

package AccessModifiers;

public class AccessModifiers {
    public static void learn(String[] args) {
    // ! Access modifiers are used to set the accessibility of classes, attributes, methods, and constructors.
    // ! We can use the access modifiers to restrict the access to certain parts of the code.
    // ! There are 4 types of access modifiers:
    // ? Public: The code is accessible for all classes.
    // ? Private: The code is only accessible within the declared class.
    // ? Protected: The code is accessible in the same package and subclasses.
    // ? Default: The code is only accessible in the same package. This is used when you don't specify a modifier.
    // * This works simultaneously with "package1\A.java" and "package2\B.java, C.java and Asubclass.java" files.

        AccessModifiers.package1.A.learn(args);
        AccessModifiers.package2.Asubclass.learn(args);
    }
}
