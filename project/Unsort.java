package project;

import java.util.LinkedList;
import java.util.Random;

/**
 * The Unsort class provides a method for generating a LinkedList of random integers.
 */
public class Unsort {
	
	/**
	 * Generates a LinkedList of random integers.
	 *
	 * @param quantity The number of random integers to generate.
	 * @return A LinkedList containing the generated random integers.
	 */
	public LinkedList<Integer> draw(int quantity) {
		LinkedList<Integer> randList = new LinkedList<Integer>();
		Random generator = new Random();
		
		for (int i = 0; i < quantity; i++) {
			randList.add(generator.nextInt(100));
		}
		
		return randList;
	}	
}
