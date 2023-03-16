/*
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.

*/

/*
    Explaining printf
    ======================
    ! 1 > Printf is a method that allows you to print a formatted string.
    ! 2 > It is useful when you want to print a string with a variable in it and format it.
    ! 3 > It is similar to the C language printf method.

*/

/*
    Explaining the code
    ======================
    * Using printf:
    ? You need two arguments: format + variable/value/object.
    ? % [flags] [width] [.precision] [conversion-character]
    ? The precision is the number of digits to the right of the decimal point
    ? The conversion-character is the type of data that you are printing

    * Placeholders:
    ? 1 > %n is a new line character.
    ? 2 > %b is for booleans.
    ? 3 > %c is for characters.
    ? 4 > %d is for integers.
    ? 5 > %f is for doubles.
    ? 6 > %.1f is for doubles with 1 decimal place. by changing the number you can change the number of places.
    ? 7 > %+f is for doubles with a plus sign.
    ? 8 > %s is for strings.
    ? 9 > %10s is for strings with a width of 10 characters.

    * Flags:
    ? => - left justify.
    ? => + include a sign.
    ? => 0 pad with zeros.
    ? => , use locale-specific grouping separators.
    ? => () enclose negative numbers in parentheses.

*/

//! ------------------------------------------------------ The Code ------------------------------------------------------ //

public class Printf {
    public static void learn(String[] args) throws Exception {

        boolean myBool = true;
        char myChar = 'A';
        int myInt = 100;
        double myDouble = -3.14;
        String myString = "Hello";

        // ? 1 > %n is a new line character
        System.out.printf("Boolean: %b %n", myBool); // ? 2
        System.out.printf("Character: %c %n", myChar); // ? 3
        System.out.printf("Integer: %d %n", myInt); // ? 4
        System.out.printf("Double: %.1f %n", myDouble); // ? 5 , 6
        System.out.printf("Double: %+f %n", myDouble); // ? 5 , 7
        System.out.printf("String: %10s %n", myString); // ? 9

    }
}
