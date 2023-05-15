package Algorithms;

public class MergeSort {

    public static void main(String[] args) {

        // ! Merge Sort is a Divide and Conquer algorithm.
        // ! It divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves.
        // ! Time complexity is O(n log n)
        // * Disadvantages: It is hard to implement.
        // * Advantages: It is more efficient than Bubble Sort and Selection Sort.

        int[] array = { 3, 20, 15, 4, 2, 1, 32 };

        mergesort(array);

        // ? for i in array print i to show the array sorted.
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void mergesort(int[] array) {

        // ? If the array has 1 or 0 elements, then it is already sorted.
        if (array.length < 2) {
            return;
        }

        // ? Find the middle index of the array.
        int middle = array.length / 2;

        // ? Create a left array.
        int[] left = new int[middle];

        // ? Create a right array.
        int[] right;

        // ? If the array has an even number of elements, then the left and right array will have the same number of elements.
        if (array.length % 2 == 0) {
            right = new int[middle];
        } else {
            // ? If the array has an odd number of elements, then the right array will have one more element than the left array.
            right = new int[middle + 1];
        }

        // ? Copy the left half of the original array into the left array.
        for (int i = 0; i < middle; i++) {
            left[i] = array[i];
        }

        // ? Copy the right half of the original array into the right array.
        for (int i = 0; i < right.length; i++) {
            right[i] = array[middle + i];
        }

        // ? Sort the left array.
        mergesort(left);

        // ? Sort the right array.
        mergesort(right);

        // ? Merge the left and right arrays into the original array.
        merge(left, right, array);
    }
}