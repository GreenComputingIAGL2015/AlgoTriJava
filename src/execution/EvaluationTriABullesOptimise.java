package execution;

import java.util.Scanner;

import algorithmes.TriABullesOptimise;
import util.TableauUtils;

public class EvaluationTriABullesOptimise {
	
	private static int tab[];
	
	public static void main(String[] args) {
		
		// recuperation nb elements la ligne des commandes
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Nombre d'éléments du tableau :");
		int nbElementsTab = keyboard.nextInt();
		keyboard.close();
		
		// initialisation du tableau
		EvaluationTriABullesOptimise.tab = TableauUtils.initTab(nbElementsTab);
		
		// affichage tableau avant tri
		System.out.println("Nb elements : " + nbElementsTab);
		System.out.println("Tableau avant tri : " + TableauUtils.affiche(EvaluationTriABullesOptimise.tab));
		
		// tri par comptage
		TriABullesOptimise bulles = new TriABullesOptimise(EvaluationTriABullesOptimise.tab);
		bulles.trier();
		
		// affichage tableau apres tri
		System.out.println("Tableau apes tri : " + TableauUtils.affiche(EvaluationTriABullesOptimise.tab));
	}
}
