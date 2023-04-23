package Algorithms;

public class BubbleSort {
    // ! Buble sort is a sorting algorithm that compares 2 adjacent elements and swaps them if they are not in the correct order.
    // ! The algorithm repeats this process until the array is sorted.
    // ! Time complexity is O(n^2)
    // * Disadvantages: It is slow, it is not efficient.
    // * Advantages: It is easy to implement.

    // ! Bubble sort pseudo code:
    // ? 1. Start at the beginning of the array and swap the first 2 elements if the first is greater than the second.
    // ? 2. Go to the next pair, and so on, continuously making sweeps of the array until sorted.
    // ? 3. If at the end of the array, the elements are in order, then the array is sorted.
    // ? 4. Repeat step 1.

    public static void main(String[] args) {

        int[] array = { 3, 20, 15, 4, 2, 1, 32 };

        bubblesort(array);

        // ? for i in array print i to show the array sorted.
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void bubblesort(int[] array) {

        // ? The outer loop is used to iterate through the array.
        // ? array.length - 1 is used to reduce the number of comparisons in each pass.
        for (int i = 0; i < array.length - 1; i++) {
            // ? The inner loop is used to compare the adjacent elements and swap them if they are not in the correct order.
            // ? array.length - i - 1 is used to reduce the number of comparisons in each pass.
            for (int j = 0; j < array.length - i - 1; j++) {
                // ? If the first element is greater than the second element, then swap them.
                // ! array[j] is the first element, array[j + 1] is the second element.
                if (array[j] > array[j + 1]) {

                    int temp = array[j]; // ? Store the first element in a temporary variable.
                    array[j] = array[j + 1]; // ? Replace the first element with the second element, array[j + 1] is the second element.
                    array[j + 1] = temp; // ? Replace the second element with the temporary variable (first element).
                }
            }
        }
    }
}
