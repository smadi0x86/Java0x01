/*
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.
    
*/

/*
    Explaining Linera Search
    ======================
    * This is how Linear search works:
        ? 1 > Start at the first index of the array. --> array[0]
        ? 2 > If the value is equal to the number we are looking for, then we have found the number.
        ? 3 > If the value isn't found we move the next index until we find the number.
        ? 4 > If the value is not in the array, then the number is not in the array.
    * run time complexity is O(n)
    * Disadvantage:
       ? > It is slow.
    * Advantages: 
        ? > It is simple and easy to implement
        ? > No need to sort the array.
    
*/

/*
    Explaining the code
    ======================
    ? 1 > Create and fill an array
    ? 2 > Start a loop to compare the value in the index with wanted value.
    ? 3 > if the number is found terminate the loop.
    ? 4 > if the number isn't founs it means that the number isn't in the array. obviously :)
     
*/

//! ------------------------------------------------------ The Code ------------------------------------------------------ //


public class LinearSearch {

    public static int linearSearch(int[] array, int numbertolookFor) {

        for (int i = 0; i < array.length; i++) // ? 2
        {
            if (array[i] == numbertolookFor) {
                return i; // ? 3
            }
        }
        return -1; // ? 4
    }

    public static void main(String[] args) {
        int[] array = {11, 2, 1, 4, 12, 3, 7, 10, 9}; // ? 1
        int numberToLookFor = 6;
        int index = linearSearch(array, numberToLookFor);
        if ( index != -1)
        {
            System.out.println("Found " + numberToLookFor + " at index " + index); // ? 3
        } else {
            System.out.println("Number not found"); // ? 4
        }
    }
}
