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

//! ------------------------------------------------------ The Code ------------------------------------------------------ //

public class MultiDimensionArray {
    public static void learn(String[] args) throws Exception {
        // ! A 2D array is an array of arrays:
        // ! It can be any data type such as int, double, String, etc.

        // ? I didn't decide how many rows and columns I wanted, I just leave the
        // brackets empty and let Java decide for me
        String[][] names = {
                { "Bob", "Sally", "John" },
                { "Mary", "Michael", "Joe" }
        };

        names[0][0] = "Bobby"; // ? This will change the value of the first element in the first array to
                               // "Bobby"
        System.out.println(names[0][0]); // ? This will print "Bobby"

        names[0][1] = "Sally Sue"; // ? This will change the value of the second element in the first array to
                                   // "Sally Sue"
        System.out.println(names[0][1]); // ? This will print "Sally Sue"

        names[1][0] = "Mary Jane"; // ? This will change the value of the first element in the second array to
                                   // "Mary Jane"
        System.out.println(names[1][0]); // ? This will print "Mary Jane"

        names[1][1] = "Michael Jackson"; // ? This will change the value of the second element in the second array to
                                         // "Michael Jackson"
        System.out.println(names[1][1]); // ? This will print "Michael Jackson"

        names[1][2] = "Joe Mama"; // ? This will change the value of the third element in the second array to "Joe
                                  // Mama"
        System.out.println(names[1][2]); // ? This will print "Joe Mama"
    }
}
