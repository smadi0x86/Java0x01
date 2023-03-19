/*
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.

    
*/

/*
    Explaining
    ======================
    !!!!! This file is yet to be documented !!!!!
    
*/

/*
    Explaining the code
    ======================
    
*/

public class WrapperClasses {
    public static void learn(String[] args) throws Exception {
        // ! Wrapper classes are used to convert primitive data types to objects and
        // vice versa
        // ! Its useful when you want to use objects instead of primitive data types,
        // this provides useful methods that can be used with the objects
        // ! For example int to Integer and Integer to int
        // ! The first letter of the wrapper classes is capital, for example Integer,
        // Double, Boolean, etc.
        /*
         * ! Primitive Data Types Wrapper Classes
         * byte Byte
         * short Short
         * int Integer
         * long Long
         * float Float
         * double Double
         * char Character
         * boolean Boolean
         */

        // ? They can be used with collections, for example ArrayList
        // ? For example ArrayList<Integer> numbers = new ArrayList<Integer>(); This
        // will create an ArrayList that can only store integers
        // ? ArrayList<String> names = new ArrayList<String>(); This will create an
        // ArrayList that can only store strings
        // ? numbers.add(1); // ? This will add an integer to the ArrayList
        // ? names.add("John"); // ? This will add a string to the ArrayList

        // ? Auto boxing and unboxing is a feature of Java that allows us to convert
        // primitive data types to objects and vice versa

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
