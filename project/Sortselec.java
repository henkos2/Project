package project;

import java.util.LinkedList;

/**
 * The Sortselec class provides a method for performing selection sort on a LinkedList of integers.
 */
public class Sortselec {

    /**
     * Initializes a new instance of the Sortselec class.
     */
    public Sortselec() {
    }

    /**
     * Sorts the given LinkedList of integers using the selection sort algorithm.
     *
     * @param unsorted The unsorted LinkedList of integers.
     * @return A new LinkedList containing the sorted integers.
     */
    public LinkedList<Integer> selectionSort(LinkedList<Integer> unsorted) {

        LinkedList<Integer> selected = new LinkedList<>(unsorted);

        int n = selected.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (selected.get(j) < selected.get(minIndex)) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = selected.get(i);
                selected.set(i, selected.get(minIndex));
                selected.set(minIndex, temp);
            }
        }
        return selected;
    }
}
