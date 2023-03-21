/*
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.
    ! READ "smadi0x86/Java0x01/Learn/Material/WrapperClasses.txt" file before procceeding in this file.

    
*/

/*
    Explaining Wrapper Classes
    ======================
    ! Wrapper classes are used to convert primitive data types to objects and vice versa.
    ! Its useful when you want to use objects instead of primitive data types, this provides useful methods that can be used with the objects.
    ! For example int to Integer and Integer to int.
    ! The first letter of the wrapper classes is capital, for example Integer, Double, Boolean, etc.
    
*/

/*
    Explaining the code
    ======================
    ? 1 > For example ArrayList<Integer> numbers = new ArrayList<Integer>(); => This will create an ArrayList that can only store integers.
    ? 2 > ArrayList<String> names = new ArrayList<String>(); => This will create an ArrayList that can only store strings.
    ? 3 > numbers.add(1); => This will add an integer to the ArrayList.
    ? 4 > names.add("John"); => This will add a string to the ArrayList.
    
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
