/*
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.
    ! Learn is a method that takes an array of strings as an argument and returns nothing it can be any name you want.
    ! We suggest that you read "variables.txt" from the "Documentations" folder before procceding in this file.
*/

/*
    Explaining the code
    ======================
    * Primitive data types variables:
    ? int : stores integer values.
    ? double : stores decimal values.
    ? boolean : Stores a true or false value.
    ? char : Stores a single character

    * Reference data type:
    ? String : Stores text values.
*/

// ------------------------------------------------------ The Code ------------------------------------------------------ //
public class Variables {
    public static void learn(String[] args) throws Exception {
        // ! Primitive data types variables:

        int x = 1337;
        System.out.println(x);

        double y = 13.37;
        System.out.println(y);

        boolean z = false;
        System.out.println(z);

        char symbol = '@';
        System.out.println(symbol);

        // ! This is a reference data type:

        String name = "leet";
        System.out.println(name);

        System.out.println("Hello " + name + "!");
    }

}
