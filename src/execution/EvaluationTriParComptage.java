package execution;

import algorithmes.TriParComptage;
import util.TableauUtils;

public class EvaluationTriParComptage {
	
	private static int borneSuperieure;
	private static int tab[];
	
	public static void main(String[] args) {
		
		if (args.length > 0 && Integer.parseInt(args[0]) > 0) {
			
			// récupération nb éléments la ligne des commandes
			int nbElementsTab = Integer.parseInt(args[0]);
			
			// initialisation du tableau
			EvaluationTriParComptage.tab = TableauUtils.initTab(nbElementsTab);
			EvaluationTriParComptage.borneSuperieure = TableauUtils.setMax(EvaluationTriParComptage.tab);
			
			// affichage tableau avant tri
			System.out.println("Nb éléments : " + nbElementsTab);
			System.out.println("Borne superieure : " + EvaluationTriParComptage.borneSuperieure);
			System.out.println("Tableau avant tri : " + TableauUtils.affiche(EvaluationTriParComptage.tab));
			
			// tri par comptage
			TriParComptage comptage = new TriParComptage(EvaluationTriParComptage.tab, EvaluationTriParComptage.borneSuperieure);
			comptage.trier();
			
			// affichage tableau après tri
			System.out.println("Tableau apès tri : " + TableauUtils.affiche(EvaluationTriParComptage.tab));
		} else {
			System.out.println("Merci de spécifier le nombre d'éléments du tableau à trier");
		}
	}
}
