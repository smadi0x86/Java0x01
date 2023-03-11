import java.util.ArrayList; // ? This is how we import the ArrayList class from the java.util package to use ArrayLists object

public class ArrayLists {
    public static void learn(String[] args) throws Exception {
        // ! ArrayLists are resizable arrays that can be used to store a list of items
        // ! Elements can be added and removed from an ArrayList whenever you want ( at run time)
        // ! ArrayLists can only store reference types (objects)
        // ! ArrayLists are indexed just like arrays
        // ! You cant change the size of list at runtime but you can add and remove elements from it

        ArrayList<String> names = new ArrayList<String>();

        names.add("John"); // ? This is how we add an element to an ArrayList using the add() method
        names.add("Mary");
        names.add("Bob");
        names.add("saeed");

        System.out.println(names.get(0)); // ? This is how we get an element from an ArrayList using the get() method

        names.clear(); // ? This is how we clear all the elements from an ArrayList using the clear() method

        System.out.println(names.size()); // ? This is how we get the size of an ArrayList using the size() method

        names.add("saeed");
        names.add("dahool");
        names.add("mustafa");
        names.add("saif");

        names.remove(1); // ? This is how we remove an element from an ArrayList using the remove() method
        names.set (1, "dahool"); // ? This is how we change an element in an ArrayList using the set() method

        // ? This should print dahool, mustafa, saif
        for(int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i)); // ? This is how we loop through an ArrayList using a for loop to print all the elements
        }
    }
}
