/*
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.

    
*/

/*
    Explaining For Each Loop
    ======================
    ! It is used to iterate through the elements of an array.
    ! Difference between "For Each" and "For Loop" is that "For Each" doesn't require the index of the array to be accessed.

*/

/*
    Explaining the code
    ======================
    ? 1 > The ":" means "in" and the variable "fruits" is the name of the variable that will hold the value of the current element.
    ? 2 > We can also use the For Each loop to iterate through the elements of an ArrayList

    * Refer to "ArrayList.java" to know more about ArrayLists.

*/

import java.util.ArrayList;

public class ForEach {
    public static void learn(String[] args) throws Exception {

        String[] fruits = { "Apple", "Banana", "Orange" };

        // ? 1
        for (String i : fruits) {
            System.out.println(i);
        }

        // ? 2
        ArrayList<String> sweets = new ArrayList<>();

        sweets.add("Chocolate");
        sweets.add("Ice Cream");
        sweets.add("Candy");

        for (String i : sweets) {
            System.out.println(i);
        }
    }
}
