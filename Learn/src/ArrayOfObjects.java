/*
                                    !! This File is yet to be documented !!
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.
                            
    
*/

/*
    Explaining
    ======================
    
*/

/*
    Explaining the code
    ======================
    
*/

//! ------------------------------------------------------ The Code ------------------------------------------------------ //


public class ArrayOfObjects {
    public static void learn(String[] args) {
        // ! Array of objects is an array that contains objects.
        // ! You can create an array of objects by using the class name followed by square brackets.
        // ! You can also create an array of objects by using the class name followed by square brackets and then using the new keyword followed by the class name and then square brackets.
        // * This works simultaneously with the "Food.java"

        Food refrigerator[] = new Food[3]; // ? Food in a refrigerator is an array of objects.

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Burger");
        Food food3 = new Food("Hotdog");

        // ? we want to store these foods in the refrigerator array:

        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;
        // or:
       // * Food refrigerator[] = {food1, food2, food3};

        System.out.println(refrigerator[0].name); // ? If we remove the .name part, it will print the object's address in memory.
    }
}
