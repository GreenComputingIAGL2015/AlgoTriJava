package execution;

import algorithmes.TriFusion;
import util.TableauUtils;

public class EvaluationTriFusion {
	
	private static int tab[];
	
	public static void main(String[] args) {		
		
		if (args.length > 0 && Integer.parseInt(args[0]) > 0) {
			
			// récupération nb éléments la ligne des commandes
			int nbElementsTab = Integer.parseInt(args[0]);
			
			// initialisation du tableau
			EvaluationTriFusion.tab = TableauUtils.initTab(nbElementsTab);
			
			// affichage tableau avant tri
			System.out.println("Nombre d'éléments du tableau : " + nbElementsTab);
			System.out.println("Tableau avant tri : " + TableauUtils.affiche(EvaluationTriFusion.tab));
			
			// tri par comptage
			TriFusion fusion = new TriFusion(EvaluationTriFusion.tab);
			fusion.trier();
			
			// affichage tableau après tri
			System.out.println("Tableau apès tri : " + TableauUtils.affiche(EvaluationTriFusion.tab));
		} else {
			System.out.println("Merci de spécifier le nombre d'éléments du tableau à trier");
		}
	}
}
