package execution;

import algorithmes.TriABullesOptimise;
import util.TableauUtils;

public class EvaluationTriABullesOptimise {
	
	private static int tab[];
	
	public static void main(String[] args) {
		
		if (args.length > 0 && Integer.parseInt(args[0]) > 0) {
			
			// récupération nb éléments la ligne des commandes
			int nbElementsTab = Integer.parseInt(args[0]);
			
			// initialisation du tableau
			EvaluationTriABullesOptimise.tab = TableauUtils.initTab(nbElementsTab);
			
			// affichage tableau avant tri
			System.out.println("Nb éléments : " + nbElementsTab);
			System.out.println("Tableau avant tri : " + TableauUtils.affiche(EvaluationTriABullesOptimise.tab));
			
			// tri par comptage
			TriABullesOptimise bulles = new TriABullesOptimise(EvaluationTriABullesOptimise.tab);
			bulles.trier();
			
			// affichage tableau après tri
			System.out.println("Tableau apès tri : " + TableauUtils.affiche(EvaluationTriABullesOptimise.tab));
		} else {
			System.out.println("Merci de spécifier le nombre d'éléments du tableau à trier");
		}
	}
}
