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

public class C {

    String defaultMessage = "This is a default message."; // ? Using the default access modifier which is only accessible in the same package.
    public String publicMessage = "This is a public message."; // ? Using the public access modifier which is accessible for all classes.
    protected String protectedMessage = "This is a protected message."; // ? Using the protected access modifier which is accessible in the same package and subclasses, aslong as this class is a subclass of any class that has the protected modifier.
    private String privateMessage = "This is a private message."; // ? Using the private access modifier which is only accessible within the declared class.
}
