package tests;

import org.junit.Test;

import project.Unsort;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;

public class UnsortTest {
    
    @Test
    public void testDraw() {
    	
        int quantity = 10;
        Unsort unsort = new Unsort();
        
        LinkedList<Integer> result = unsort.draw(quantity);
        
        assertNotNull(result);       
        assertEquals(quantity, result.size());
        
        for (Integer element : result) {
            assertTrue(element >= 0 && element <= 99);
        }
    }
}
