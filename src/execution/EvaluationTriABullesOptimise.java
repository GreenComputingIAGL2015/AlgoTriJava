package execution;

import java.util.Scanner;

import algorithmes.TriABullesOptimise;
import util.TableauUtils;

public class EvaluationTriABullesOptimise {
	
	private static int tab[];
	
	public static void main(String[] args) {
		
		if (args.length > 0 && Integer.parseInt(args[0]) > 0) {
			
			// r�cup�ration nb �l�ments la ligne des commandes
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Nombre d'éléments du tableau :");
			int nbElementsTab = keyboard.nextInt();
			
			//int nbElementsTab = Integer.parseInt(args[0]);
			
			// initialisation du tableau
			EvaluationTriABullesOptimise.tab = TableauUtils.initTab(nbElementsTab);
			
			// affichage tableau avant tri
			System.out.println("Nb �l�ments : " + nbElementsTab);
			System.out.println("Tableau avant tri : " + TableauUtils.affiche(EvaluationTriABullesOptimise.tab));
			
			// tri par comptage
			TriABullesOptimise bulles = new TriABullesOptimise(EvaluationTriABullesOptimise.tab);
			bulles.trier();
			
			// affichage tableau apr�s tri
			System.out.println("Tableau ap�s tri : " + TableauUtils.affiche(EvaluationTriABullesOptimise.tab));
		} else {
			System.out.println("Merci de sp�cifier le nombre d'�l�ments du tableau � trier");
		}
	}
}
