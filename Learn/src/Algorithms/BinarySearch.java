<<<<<<< HEAD:Learn/src/Algorithms/BinarySearch.java
package Algorithms;
=======
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

>>>>>>> f11365a7c1179b3739fe2c94746c497952eadfad:Learn/src/BinarySearch.java

public class BinarySearch {

    public static int binarySearch(int[] array, int numbertolookFor) {
        // ! How does the binary search works?
        // * 1. Start at the middle of the array.
        // * 2. If the value is less than the number we are looking for, then the number is in the upper half of the array.
        // * 3. If the value is greater than the number we are looking for, then the number is in the lower half of the array.
        // * 4. If the value is equal to the number we are looking for, then we have found the number.
        // * 5. If the value is not in the array, then the number is not in the array.
        // * run time complexity is O(log n)
        // * Disadvantage: It needs a sorted array, it is more complex than the linear search.
        // * Advantages: It is faster than the linear search.

        // ! Binary Search pseudo code:
        // ? 1. Start at the middle of the array.
        // ? 2. If the value is less than the number we are looking for, then the number is in the upper half of the array.
        // ? 3. If the value is greater than the number we are looking for, then the number is in the lower half of the array.
        // ? 4. If the value is equal to the number we are looking for, then we have found the number.
        // ? 5. If the value is not in the array, then the number is not in the array.

        int low = 0; // This is the first index of the array.
        int high = array.length - 1; // This is the last index of the array, -1 because arrays start at 0.

        // While the number is in the array.
        while (low <= high) {
            int middle = (low + high) / 2; // Start at the middle of the array.
            int value = array[middle]; // The value of the middle of the array.

            System.out.println("Middle: " + value);

            if (value < numbertolookFor) {
                low = middle + 1; // If the value is less than the number we are looking for, then the number is in the upper half of the array.
            } else if (value > numbertolookFor) {
                high = middle - 1; // If the value is greater than the number we are looking for, then the number is in the lower half of the array.
            } else {
                return middle; // If the value is equal to the number we are looking for, then we have found the number.
            }
        }
        return -1; // ? Act as number not found.
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int numberToLookFor = 8;
        int index = binarySearch(array, numberToLookFor);
        System.out.println("Found " + numberToLookFor + " at index " + index);
    }
}
