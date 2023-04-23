/*
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.
    ! String Methods are methods that you can call on a string to perform a transformation on it.
    
*/

/*
    Explaining the code
    ======================
    * String Methods are methods that you can call on a string to perform a transformation on it. These are the methods:
    ? 1 > String.equalsIgnoreCase("another string") => Checks if the String is equal to another string ignoring case sensitivity.
    ? 2 > String.length() => Returns the length of the string.
    ? 3 > String.charAt(0) => Returns the character at any index. In this case it is index 0.
    ? 4 > String.indexOf("") => Return the index of the a certain chracter in the string.
    ? 5 > String.isEmpty() => Checks if the string is empty.
    ? 6 > String.toUpperCase() => Converts the string to upper case.
    ? 7 > String.toLowerCase() => Convert the string to lower case.
    ? 8 > String.replace("target", "replacement") => Replaces a character with another in the string.

    * Below is an impelmentation for all of these methods.

*/

//! ------------------------------------------------------ The Code ------------------------------------------------------ //

public class StringMethods {
    public static void learn(String[] args) throws Exception {

        String name = "smadi";

        boolean result = name.equalsIgnoreCase("smadi"); // ? 1
        System.out.println(result);

        int resultLength = name.length(); // ? 2
        System.out.println(resultLength);

        char resultChar = name.charAt(0); // ? 3
        System.out.println(resultChar);

        int resultIndex = name.indexOf("m"); // ? 4
        System.out.println(resultIndex);

        boolean resultbool = name.isEmpty(); // ? 5
        System.out.println(resultbool);

        String resultUpper = name.toUpperCase(); // ? 6
        System.out.println(resultUpper);

        String resultLower = name.toLowerCase(); // ? 7
        System.out.println(resultLower);

        String resultReplace = name.replace("m", "M"); // ? 8 replace the character m with M
        System.out.println(resultReplace);
    }
}
