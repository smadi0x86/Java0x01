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


package AccessModifiers.package2;
import AccessModifiers.package1.*;

public class Asubclass extends A {
    public static void learn(String[] args) {

        C c = new C();

        System.out.println(c.defaultMessage); // ? It's accessible because it's in the same package.

        System.out.println(c.publicMessage); // ? It's accessible because it's public which is visible to all classes.

        Asubclass asub = new Asubclass(); // ? We can access the protected variable from the parent class because we're in a subclass.
        System.out.println(asub.protectedMessage); // ? It's accessible because it's protected which is accessible in the same package and subclasses.
    }
}
