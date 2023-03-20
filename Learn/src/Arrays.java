/*
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.

    
*/

/*
    Explaining Arrays
    ======================
    ! An array is a data structure that stores elements of the same type such as int, double, String, etc.
    
*/

/*
    Explaining the code
    ======================
    ? 1 > This is an array of strings.
    ? 2 > This is how you change the value of an element in an array.
        * you can also use a "for loop" to change the values of the elements in array.
    ? 3 > This will change all the elements in the array to "dog".
        * The .length is a property of the array that tells you how many elements are 
            * in the array (3 in this case) instead of hard coding it
    ? 4 > You can replace the values of the elements in an array with new values.
    ? 5 > This is how to print all the array.
         
*/

public class Arrays {
    public static void learn(String[] args) throws Exception {

        String[] animals = { "lion", "tiger", "bear" }; // ? 1

        animals[0] = "lion"; // ? 2
        animals[1] = "tiger";
        animals[2] = "bear";

        for (int i = 0; i < animals.length; i++) { // ? 3
            animals[i] = "dog";
        }

        // ? 4
        animals[0] = "dog";
        animals[1] = "cat";
        animals[2] = "bird";

        System.out.println(animals[0]); // ? This will print out "dog"
        System.out.println(animals[1]); // ? This will print out "cat"
        System.out.println(animals[2]); // ? This will print out "bird"

        System.out.println("");

        // ? 5
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
    }
}
