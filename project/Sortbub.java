package project;

import java.util.LinkedList;

/**
 * The Sortbub class provides a method for performing bubble sort on a LinkedList of integers.
 */
public class Sortbub {

    /**
     * Initializes a new instance of the Sortbub class.
     */
    public Sortbub() {
    }

    /**
     * Sorts a LinkedList of integers using the bubble sort algorithm.
     *
     * @param unsorted The LinkedList of integers to be sorted.
     * @return A new LinkedList containing the sorted integers.
     */
    public LinkedList<Integer> bubbleSort(LinkedList<Integer> unsorted) {

        LinkedList<Integer> bubled = new LinkedList<>(unsorted);
        int n = bubled.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (bubled.get(j) > bubled.get(j + 1)) {

                    int temp = bubled.get(j);
                    bubled.set(j, bubled.get(j + 1));
                    bubled.set(j + 1, temp);

                }
            }
        }
        return bubled;
    }
}
