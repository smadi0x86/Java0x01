public class Arrays {
    public static void learn(String[] args) throws Exception {
        // ! Array is a data structure that stores elements of the same type such as int, double, String, etc.

        String[] animals = { "lion", "tiger", "bear" }; // ? This is an array of strings

        animals[0] = "lion"; // ? This is how you change the value of an element in an array
        animals[1] = "tiger";
        animals[2] = "bear";

        // ? you can also use a for loop to change the values of the elements in array
        // ? The .length is a property of the array that tells you how many elements are in the array (3 in this case) instead of hard coding it

        for (int i = 0; i < animals.length; i++) {
            animals[i] = "dog"; // ? This will change all the elements in the array to "dog"
        }

        // ? you can replace the values of the elements in an array with new values
        // ? lets change them

        animals[0] = "dog";
        animals[1] = "cat";
        animals[2] = "bird";

        System.out.println(animals[0]); // ? This will print out "dog"
        System.out.println(animals[1]); // ? This will print out "cat"
        System.out.println(animals[2]); // ? This will print out "bird"

        System.out.println(""); // ? This is just to make a new line

        // ? This is how to print all the array
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
    }
}
