public class StringMethods {
    public static void learn(String[] args) throws Exception {
        // ! String Methods are methods that you can call on a string to do something:

        String name = "smadi";

        boolean result = name.equalsIgnoreCase("smadi"); // ? check if name is equal to smadi, ignore case sensitivity
        System.out.println(result);

        int resultLength = name.length(); // ? return the length of the string
        System.out.println(resultLength);

        char resultChar = name.charAt(0); // ? return the character at the index 0
        System.out.println(resultChar);

        int resultIndex = name.indexOf("m"); // ? return the index of the character m
        System.out.println(resultIndex);

        boolean resultbool = name.isEmpty(); // ? check if the string is empty
        System.out.println(resultbool);

        String resultUpper = name.toUpperCase(); // ? convert the string to upper case
        System.out.println(resultUpper);

        String resultLower = name.toLowerCase(); // ? convert the string to lower case
        System.out.println(resultLower);

        String resultReplace = name.replace("m", "M"); // ? replace the character m with M
        System.out.println(resultReplace);
    }
}
