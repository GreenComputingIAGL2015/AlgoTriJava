package execution;

import java.util.Arrays;
import java.util.Random;

import algorithmes.TriParComptage;

public class Evaluation {
	
	private static int borneSuperieure;
	private static int tab[];
	
	public static void main(String[] args) {
		
		if (args.length >0 && Integer.parseInt(args[0]) > 0) {
			
			// récupération nb éléments la ligne des commandes
			int nbElements = Integer.parseInt(args[0]);
			
			// initialisation du tableau
			Evaluation.initTab(nbElements);
			Evaluation.setMax();
			
			// affichage tableau avant tri
			System.out.println("Nb éléments : " + nbElements);
			System.out.println("BorneSuperieure : " + borneSuperieure);
			System.out.println("Tableau avant tri : " + Evaluation.affiche());
			
			// tri par comptage
			TriParComptage comptage = new TriParComptage(Evaluation.tab, Evaluation.borneSuperieure);
			comptage.trier();
			
			// affichage tableau après tri
			System.out.println("Tableau après tri : " + Evaluation.affiche());
		}
	}
	
	/**
	 * Initialize the array
	 * @param nbElements nb elements
	 */
	private static void initTab(int nbElements) {
		
		Evaluation.tab = new int[nbElements];
		int max = 100;
		int min = 0;
		Random rand = new Random();
		
		for (int i=0; i<nbElements; i++) {
			Evaluation.tab [i] = rand.nextInt(max - min + 1) + min;
		}
	}
	
	/**
	 * Get the array elements
	 * @return the array elements
	 */
	public static String affiche() {
		return Arrays.toString(Evaluation.tab);
	}
	
	/**
	 * Get max value of an array
	 */
	private static void setMax() {
		
		int highest = Evaluation.tab[0];
		
		for (int index = 1; index < Evaluation.tab.length; index ++) {
	        if (Evaluation.tab[index] > highest) {
	            highest = Evaluation.tab [index];
	        }
	    }
		
		Evaluation.borneSuperieure = highest;
	}
}
