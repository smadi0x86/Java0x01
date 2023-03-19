/*
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.
    ! Please checkout ArrayLists.java before procceeding  in this file, because the basic concept of ArrayLists is explained there.
        
*/

/*
    Explaining Multidimensional Arraylists
    ======================
    ! 2D ArrayList - ArrayList of ArrayList
    ! It is useful when you want to store data in a table format
    
*/

/*
    Explaining the code
    ======================
    ? 1 > We create a 2d ArrayList like this. => ArrayList<ArrayList<String>> shoppingList = new ArrayList<>();.
    ? 2 > We can add to the ArrayList using the .add("Anything") method.
    ? 3 > We created a normal array list.
    ? 4 > We added a normal array list to the 2d ArrayList.
    ? 5 > We can use the .get(index) method to get the value of the index.

*/

import java.util.ArrayList;

public class MultiDimensionArrayList {
    public static void learn(String[] args) throws Exception {

        ArrayList<ArrayList<String>> shoppingList = new ArrayList<>(); // ? 2

        ArrayList<String> sweets = new ArrayList<>();

        sweets.add("Chocolate");
        sweets.add("Ice Cream"); // ? > 2
        sweets.add("Candy");

        ArrayList<String> diary = new ArrayList<>(); // ? 3

        diary.add("Milk");
        diary.add("Cheese");
        diary.add("Yogurt");

        shoppingList.add(sweets); // ? ArrayList<ArrayList<String>> shoppingList = new ArrayList<>()
        shoppingList.add(diary);

        System.out.println(shoppingList.get(0)); // ? [Chocolate, Ice Cream, Candy]
        System.out.println(shoppingList.get(1)); // ? [Milk, Cheese, Yogurt]
        System.out.println(shoppingList.get(0).get(1)); // ? Ice Cream
        System.out.println(shoppingList.get(1).get(2)); // ? Yogurt
    }
}
