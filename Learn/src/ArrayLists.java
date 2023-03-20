/*
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.
    ! Read "Arrays.java" before procceeding in this file.

    
*/

/*
    Explaining ArrayLists
    ======================
    ! ArrayLists are resizable arrays that can be used to store a list of items.
    ! Elements can be added and removed from an ArrayList whenever you want (at run time).
    ! ArrayLists can only store reference types (objects).
    ! ArrayLists are indexed just like arrays.
    ! You cant change the size of list at runtime but you can add and remove elements from it.
    * import java.util.ArrayList; => This is how we import the ArrayList class from the java.util package to use ArrayLists object.
    
*/

/*
    Explaining the code
    ======================
    ? 1 > We import the ArrayList class.
    ? 2 > ArrayList<String> names = new ArrayList<String>(); => This how you create an ArrayList
    ? 3 > This is how we add an element to an ArrayList using the add() method.
    ? 4 > This is how we get an element from an ArrayList using the get() method.
    ? 5 > This is how we clear all the elements from an ArrayList using the clear() method.
    ? 6 > This is how we get the size of an ArrayList using the size() method.
    ? 7 > This is how we remove an element from an ArrayList using the remove().
    ? 8 > This is how we change an element in an ArrayList using the set() method.
    ? 9 > This is how we loop through an ArrayList using a for loop to print all the elements.
    
*/

import java.util.ArrayList; //? 1

public class ArrayLists {
    public static void learn(String[] args) throws Exception {

        ArrayList<String> names = new ArrayList<String>(); // ? 2

        names.add("John"); // ? 3
        names.add("Mary");
        names.add("Bob");
        names.add("saeed");

        System.out.println(names.get(0)); // ? 4

        names.clear(); // ? 5

        System.out.println(names.size()); // ? 6

        names.add("saeed");
        names.add("dahool");
        names.add("mustafa");
        names.add("saif");

        names.remove(1); // ? 7
                         // method
        names.set(1, "dahool"); // ? 8

        // ? This should print dahool, mustafa, saif
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i)); // ? 9
        }
    }
}
