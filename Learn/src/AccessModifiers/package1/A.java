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


package AccessModifiers.package1;
import AccessModifiers.package2.*;

public class A {
    protected String protectedMessage = "This is a protected message."; // ? Using the protected access modifier which is accessible in the same package and subclasses.
    public static void learn(String[] args) {

        C c = new C();

       // System.out.println(c.defaultMessage); // ? It's not accessible because it's in a different package because we used the default access modifier.

        System.out.println(c.publicMessage); // ? It's accessible because it's in a different package but it's public which is visible to all classes.

        B b = new B();
      // System.out.println(b.privateMessage); // ? It's not accessible because it's private which is only accessible within the declared class.
    }
}
