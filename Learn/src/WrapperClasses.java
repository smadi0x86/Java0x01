/*
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.
    ! READ "smadi0x86/Java0x01/Learn/Material/WrapperClasses.txt" file before procceeding in this file.


*/

/*
    Explaining Wrapper Classes
    ======================
    ! Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
    ! Its useful for implementing collections (such as ArrayList) because the collections only store objects (not primitive data types).
    ! The first letter of the wrapper classes is capital, for example Integer, Double, Boolean, etc.
    ! Primitive data types examples: Integer, Double, Boolean, etc.
    ! Reference data types examples: int, double, boolean, etc.

*/

public class WrapperClasses {
    public static void learn(String[] args) throws Exception {

        Boolean autoBox = true; // ? This is auto boxing
        Character autoBox2 = 'a';
        Integer autoBox3 = 1;
        Double autoBox4 = 1.0;
        String autoBox5 = "Hello";

        if (autoBox == true) { // ? This is auto unboxing
            System.out.println("Auto unboxing, this is true");
        }

        if (autoBox2 == 'a') {
            System.out.println("Auto unboxing, this is a");
        }

        if (autoBox3 == 1) {
            System.out.println("Auto unboxing, this is 1");
        }

        if (autoBox4 == 1.0) {
            System.out.println("Auto unboxing, this is 1.0");
        }

        if (autoBox5 == "Hello") {
            System.out.println("Auto unboxing, this is Hello");
        }
    }
}
