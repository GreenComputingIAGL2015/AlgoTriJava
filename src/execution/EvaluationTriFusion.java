package execution;

import java.util.Scanner;

import algorithmes.TriFusion;
import util.TableauUtils;

public class EvaluationTriFusion {
	
	private static int tab[];
	
	public static void main(String[] args) {		
		
		// recuperation nb elements la ligne des commandes
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Nombre d'éléments du tableau :");
		int nbElementsTab = keyboard.nextInt();
		keyboard.close();
		
		// initialisation du tableau
		EvaluationTriFusion.tab = TableauUtils.initTab(nbElementsTab);
		
		// affichage tableau avant tri
		System.out.println("Nombre d'elements du tableau : " + nbElementsTab);
		System.out.println("Tableau avant tri : " + TableauUtils.affiche(EvaluationTriFusion.tab));
		
		// tri par comptage
		TriFusion fusion = new TriFusion(EvaluationTriFusion.tab);
		fusion.trier();
		
		// affichage tableau apres tri
		System.out.println("Tableau apes tri : " + TableauUtils.affiche(EvaluationTriFusion.tab));
	}
}
