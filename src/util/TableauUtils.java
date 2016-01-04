package util;

import java.util.Arrays;
import java.util.Random;

public class TableauUtils {
	
	/**
	 * Initialize the array
	 * @param nbElements nb elements
	 */
	public static int [] initTab(int nbElements) {
		
		int [] tab = new int[nbElements];
		int max = nbElements;
		int min = 0;
		Random rand = new Random();
		
		for (int i=0; i<nbElements; i++) {
			tab [i] = rand.nextInt(max - min + 1) + min;
		}
		
		return tab;
	}
	
	/**
	 * Initialize the array
	 * @param tabNbElements nb elements
	 * @param min La valeur minimal du tableau
	 * @param max La valeur maximale du tableau
	 */
	public static int [] initTab(int tabNbElements, int min, int max) {
		
		int [] tab = new int[tabNbElements];
		Random rand = new Random();
		
		for (int i=0; i<tabNbElements; i++) {
			tab [i] = rand.nextInt(max - min + 1) + min;
		}
		
		return tab;
	}
	
	/**
	 * Get the array elements
	 * @return the array elements
	 */
	public static String affiche(int [] tab) {
		return Arrays.toString(tab);
	}
	
	/**
	 * Get max value of an array
	 */
	public static int setMax(int[] tab) {
		
		int highest = tab[0];
		
		for (int index = 1; index < tab.length; index ++) {
	        if (tab[index] > highest) {
	            highest = tab [index];
	        }
	    }
		
		return highest;
	}
}
