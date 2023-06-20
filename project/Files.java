package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * The Files class provides methods for writing data to a file and reading data from a file.
 */
public class Files {

    /**
     * Writes the contents of three LinkedLists to a file named "results.txt".
     * The LinkedLists contain unsorted, bubbled, and selected integers respectively.
     *
     * @param unsorted The LinkedList containing unsorted integers.
     * @param bubbled  The LinkedList containing integers after bubble sorting.
     * @param selected The LinkedList containing integers after selection sorting.
     */
    public void writing(LinkedList<Integer> unsorted, LinkedList<Integer> bubbled, LinkedList<Integer> selected) {
        try {
            FileWriter writer = new FileWriter("results.txt");

            // Write unsorted integers
            for (Integer element : unsorted) {
                writer.write(element.toString() + " ");
            }
            writer.write(System.lineSeparator());

            // Write bubbled integers
            for (Integer element : bubbled) {
                writer.write(element.toString() + " ");
            }
            writer.write(System.lineSeparator());

            // Write selected integers
            for (Integer element : selected) {
                writer.write(element.toString() + " ");
            }

            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    /**
     * Reads a specific line from the file "results.txt".
     *
     * @param line The line number to read from (starting from 0).
     * @return The content of the specified line as a String.
     */
    public String reader(int line) {
        String text = null;
        try {
            File results = new File("results.txt");
            Scanner read = new Scanner(results);

            // Skip lines until the desired line is reached
            for (int i = 0; i < line; i++) {
                read.nextLine();
            }

            // Read the desired line
            text = read.nextLine();

            read.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return text;
    }
}
