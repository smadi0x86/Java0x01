public class Printf {
    public static void learn(String[] args) throws Exception {
        // ! Printf is a method that allows you to print a formatted string
        // ! It is useful when you want to print a string with a variable in it and format it
        // ! It is similar to the C language printf method
        // ! You need two arguments: format + variable/value/object
        // ! % [flags] [width] [.precision] [conversion-character]
        // ! The width is the minimum number of characters that will be printed
        // ! The precision is the number of digits to the right of the decimal point
        // ! The conversion-character is the type of data that you are printing


        boolean myBool = true;
        char myChar = 'A';
        int myInt = 100;
        double myDouble = -3.14;
        String myString = "Hello";

        // ? %n is a new line character
        System.out.printf("Boolean: %b %n", myBool); // ? %b is for booleans
        System.out.printf("Character: %c %n", myChar); // ? %c is for characters
        System.out.printf("Integer: %d %n", myInt); // ? %d is for integers
        System.out.printf("Double: %.1f %n", myDouble); // ? %.1f is for doubles with 1 decimal place
        System.out.printf("Double: %+f %n", myDouble); // ? %+f is for doubles with a plus sign
        System.out.printf("String: %10s %n", myString); // ? %10s is for strings with a width of 10 characters

        // ? Flags:
        // ! - left justify
        // ! + include a sign
        // ! 0 pad with zeros
        // ! , use locale-specific grouping separators
        // ! ( enclose negative numbers in parentheses
    }
}
