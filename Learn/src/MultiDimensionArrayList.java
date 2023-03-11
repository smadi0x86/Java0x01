import java.util.ArrayList;

public class MultiDimensionArrayList {
    public static void learn(String[] args) throws Exception {
        // ! 2D ArrayList - ArrayList of ArrayList
        // ! It is useful when you want to store data in a table format

        ArrayList<ArrayList<String>> shoppingList = new ArrayList<>(); // ? 2D ArrayList

        ArrayList<String> sweets = new ArrayList<>();

        sweets.add("Chocolate");
        sweets.add("Ice Cream");
        sweets.add("Candy");

        ArrayList<String> diary = new ArrayList<>(); // ? normal ArrayList

        diary.add("Milk");
        diary.add("Cheese");
        diary.add("Yogurt");

        shoppingList.add(sweets); // ? We can add the ArrayList to the ArrayList
        shoppingList.add(diary);

        System.out.println(shoppingList.get(0)); // ? [Chocolate, Ice Cream, Candy]
        System.out.println(shoppingList.get(1)); // ? [Milk, Cheese, Yogurt]
        System.out.println(shoppingList.get(0).get(1)); // ? Ice Cream
        System.out.println(shoppingList.get(1).get(2)); // ? Yogurt
    }
}
