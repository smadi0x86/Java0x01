/*
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.
    ! Please checkout Arrays.java before procceeding in this file, because the basic concept of arrays is explained there.
        
*/

/*
    Explaining Multidimensional Arraylists
    ======================
    ! A 2D array is an array of arrays
    ! It can be any data type such as int, double, String, etc.
    
*/

/*
    Explaining the code
    ======================
    ? 1 > I didn't set size for the array, Java will decide on it's own. you can do that by leaving the brackets empty. => String[][] names =
    ? 2 > Using the index you can change values within an array list
    ? 3 > You can print the value inside the array using the index. =>  System.out.println(array[i][j]);.

*/

//! ------------------------------------------------------ The Code ------------------------------------------------------ //

public class MultiDimensionArray {
    public static void learn(String[] args) throws Exception {

        String[][] names = {
                { "Bob", "Sally", "John" },
                { "Mary", "Michael", "Joe" }
        };

        names[0][0] = "Bobby"; // ? 2, This will change the value of the first element in the first array to
                               // "Bobby".
        System.out.println(names[0][0]); // ? 3 , This will print "Bobby"

        names[0][1] = "Sally Sue";
        System.out.println(names[0][1]);

        names[1][0] = "Mary Jane";

        System.out.println(names[1][0]);

        names[1][1] = "Michael Jackson";

        System.out.println(names[1][1]);

        names[1][2] = "Joe Mama";

        System.out.println(names[1][2]); // ? This will print "Joe Mama"
    }
}
