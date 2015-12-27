package execution;

import java.util.Arrays;
import java.util.Random;

import algorithmes.TriParComptage;

public class EvaluationTriParComptage {
	
	private static int borneSuperieure;
	private static int tab[];
	
	public static void main(String[] args) {
		
		if (args.length >0 && Integer.parseInt(args[0]) > 0) {
			
			// récupération nb éléments la ligne des commandes
			int nbElementsTab = Integer.parseInt(args[0]);
			
			// initialisation du tableau
			EvaluationTriParComptage.initTab(nbElementsTab);
			EvaluationTriParComptage.setMax();
			
			// affichage tableau avant tri
			System.out.println("Nb éléments : " + nbElementsTab);
			System.out.println("Borne superieure : " + EvaluationTriParComptage.borneSuperieure);
			System.out.println("Tableau avant tri : " + EvaluationTriParComptage.affiche());
			
			// tri par comptage
			TriParComptage comptage = new TriParComptage(EvaluationTriParComptage.tab, EvaluationTriParComptage.borneSuperieure);
			comptage.trier();
			
			// affichage tableau après tri
			System.out.println("Tableau apès tri : " + EvaluationTriParComptage.affiche());
		} else {
			System.out.println("Merci de spécifier le nombre d'éléments du tableau à trier");
		}
	}
	
	/**
	 * Initialize the array
	 * @param nbElements nb elements
	 */
	private static void initTab(int nbElements) {
		
		EvaluationTriParComptage.tab = new int[nbElements];
		int max = 100;
		int min = 0;
		Random rand = new Random();
		
		for (int i=0; i<nbElements; i++) {
			EvaluationTriParComptage.tab [i] = rand.nextInt(max - min + 1) + min;
		}
	}
	
	/**
	 * Get the array elements
	 * @return the array elements
	 */
	public static String affiche() {
		return Arrays.toString(EvaluationTriParComptage.tab);
	}
	
	/**
	 * Get max value of an array
	 */
	private static void setMax() {
		
		int highest = EvaluationTriParComptage.tab[0];
		
		for (int index = 1; index < EvaluationTriParComptage.tab.length; index ++) {
	        if (EvaluationTriParComptage.tab[index] > highest) {
	            highest = EvaluationTriParComptage.tab [index];
	        }
	    }
		
		EvaluationTriParComptage.borneSuperieure = highest;
	}
}
