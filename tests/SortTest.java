package tests;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;

import project.Sortbub;
import project.Sortselec;

public class SortTest {
    
    @Test
    public void testBubbleSort() {
        Sortbub sorter = new Sortbub();
        LinkedList<Integer> unsorted = new LinkedList<>();
        unsorted.add(4);
        unsorted.add(2);
        unsorted.add(1);
        unsorted.add(3);
        
        LinkedList<Integer> sorted = sorter.bubbleSort(unsorted);
        
        assertEquals(1, sorted.get(0).intValue());
        assertEquals(2, sorted.get(1).intValue());
        assertEquals(3, sorted.get(2).intValue());
        assertEquals(4, sorted.get(3).intValue());
    }
    
    @Test
    public void testSelectionSort() {
        Sortselec sorter = new Sortselec();
        LinkedList<Integer> unsorted = new LinkedList<>();
        unsorted.add(4);
        unsorted.add(2);
        unsorted.add(1);
        unsorted.add(3);
        
        LinkedList<Integer> sorted = sorter.selectionSort(unsorted);
        
        assertEquals(1, sorted.get(0).intValue());
        assertEquals(2, sorted.get(1).intValue());
        assertEquals(3, sorted.get(2).intValue());
        assertEquals(4, sorted.get(3).intValue());
    }
}
