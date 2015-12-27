package execution;

import java.util.Arrays;
import java.util.Random;

import algorithmes.TriFusion;

public class EvaluationTriFusion {
	
	private static int tab[];
	
	public static void main(String[] args) {		
		
		if (args.length >0 && Integer.parseInt(args[0]) > 0) {
			
			// récupération nb éléments la ligne des commandes
			int nbElementsTab = Integer.parseInt(args[0]);
			
			// initialisation du tableau
			EvaluationTriFusion.initTab(nbElementsTab);
			
			// affichage tableau avant tri
			System.out.println("Nombre d'éléments du tableau : " + nbElementsTab);
			System.out.println("Tableau avant tri : " + EvaluationTriFusion.affiche());
			
			// tri par comptage
			TriFusion fusion = new TriFusion();
			fusion.trier(EvaluationTriFusion.tab, nbElementsTab);
			
			// affichage tableau après tri
			System.out.println("Tableau apès tri : " + EvaluationTriFusion.affiche());
		} else {
			System.out.println("Merci de spécifier le nombre d'éléments du tableau à trier");
		}
	}
	
	/**
	 * Initialize the array
	 * @param nbElements nb elements
	 */
	private static void initTab(int nbElements) {
		
		EvaluationTriFusion.tab = new int[nbElements];
		int max = 100;
		int min = 0;
		Random rand = new Random();
		
		for (int i=0; i<nbElements; i++) {
			EvaluationTriFusion.tab [i] = rand.nextInt(max - min + 1) + min;
		}
	}
	
	/**
	 * Get the array elements
	 * @return the array elements
	 */
	public static String affiche() {
		return Arrays.toString(EvaluationTriFusion.tab);
	}
}
