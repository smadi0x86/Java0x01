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

import java.util.ArrayList;

public class ForEach {
    public static void learn(String[] args) throws Exception {
        // ! For Each Loop
        // ! It is used to iterate through the elements of an array
        // ! Difference between For Each and For Loop is that For Each doesn't require
        // the index of the array to be accessed
        // ! Less code, more readable but less flexible which means that we can't use it
        // to modify the array

        String[] fruits = { "Apple", "Banana", "Orange" };

        // ? The ":" means "in" and the variable fruit is the name of the variable that
        // will hold the value of the current element
        for (String i : fruits) {
            System.out.println(i);
        }

        // ? We can also use the For Each loop to iterate through the elements of an
        // ArrayList
        ArrayList<String> sweets = new ArrayList<>();

        sweets.add("Chocolate");
        sweets.add("Ice Cream");
        sweets.add("Candy");

        for (String i : sweets) {
            System.out.println(i);
        }
    }
}
