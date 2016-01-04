package execution;

import java.util.Scanner;

import algorithmes.TriParComptage;
import util.TableauUtils;

public class EvaluationTriParComptage {
	
	private static int borneSuperieure;
	private static int tab[];
	
	public static void main(String[] args) {
		
		// r�cup�ration nb �l�ments la ligne des commandes
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Nombre d'éléments du tableau :");
		int nbElementsTab = keyboard.nextInt();
		keyboard.close();
		
		// initialisation du tableau
		EvaluationTriParComptage.tab = TableauUtils.initTab(nbElementsTab);
		EvaluationTriParComptage.borneSuperieure = TableauUtils.setMax(EvaluationTriParComptage.tab);
		
		// affichage tableau avant tri
		System.out.println("Nb �l�ments : " + nbElementsTab);
		System.out.println("Borne superieure : " + EvaluationTriParComptage.borneSuperieure);
		System.out.println("Tableau avant tri : " + TableauUtils.affiche(EvaluationTriParComptage.tab));
		
		// tri par comptage
		TriParComptage comptage = new TriParComptage(EvaluationTriParComptage.tab, EvaluationTriParComptage.borneSuperieure);
		comptage.trier();
		
		// affichage tableau apr�s tri
		System.out.println("Tableau ap�s tri : " + TableauUtils.affiche(EvaluationTriParComptage.tab));
	}
}
