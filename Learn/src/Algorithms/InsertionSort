public class InsertionSort
{
    public static void main(String[] args) {

        // ! Insertion Sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
        // ! Time complexity is O(n^2)
        // * Disadvantages: It is inefficient on large lists.
        // * Advantages: It is efficient for (quite) small data sets, much like other quadratic sorting algorithms.

        int[] array = { 3, 20, 15, 4, 2, 1, 32 };

        insertionsort(array);

        // ? for i in array print i to show the array sorted.
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void insertionsort(int[] array) {

        // ? Loop through the array.
        for (int i = 0; i < array.length; i++) {

            // ? Create a variable to store the current element.
            int current = array[i];

            // ? Create a variable to store the previous index.
            int previous = i - 1;

            // ? While the previous index is greater than or equal to 0 and the previous element is greater than the current element.
            while (previous >= 0 && array[previous] > current) {

                // ? Set the current element to the previous element.
                array[previous + 1] = array[previous];

                // ? Decrement the previous index.
                previous--;
            }

            // ? Set the previous element to the current element.
            array[previous + 1] = current;
        }
    }
}