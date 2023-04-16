public class LinearSearch {

    public static int linearSearch(int[] array, int numbertolookFor) {
        // ! How does the linear search works?
        // * 1. Start at the beginning of the array.
        // * 2. If the value is equal to the number we are looking for, then we have found the number.
        // * 3. If the value is not in the array, then the number is not in the array.
        // * run time complexity is O(n)
        // * Disadvantage: It is slow.
        // * Advantages: It is simple and easy to implement, no need to sort the array.

        // ! This is the linear search pseudo code:
        // ? 1. Start at the beginning of the array.
        // ? 2. If the value is equal to the number we are looking for, then we have found the number.
        // ? 3. If the value is not in the array, then the number is not in the array.

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == numbertolookFor) {
                return i;
            }
        }
        return -1; // ? Act as number not found.
    }

    public static void main(String[] args) {
        int[] array = {11, 2, 1, 4, 12, 3, 7, 10, 9};
        int numberToLookFor = 6;
        int index = linearSearch(array, numberToLookFor);
        if ( index != -1)
        {
            System.out.println("Found " + numberToLookFor + " at index " + index);
        } else {
            System.out.println("Number not found");
        }
    }
}
