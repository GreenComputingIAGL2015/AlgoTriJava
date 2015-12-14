package algorithmes;

public class TriParComptage {
/*
fonction triParComptage(tab, borneSuperieure):
   // Initialisation des variables
   tabComptage[borneSuperieure + 1]
   tailleTab = taille(tab) - 1
   x = 0

   // Initialisation du tableau de comptage à 0
   pour i = 0 à borneSuperieure:
      tabComptage[i] = 0
   finPour

   // Création du tableau de comptage
   pour i = 0 à tailleTab:
      tabComptage[tab[i]]++
   finPour

   // Création du tableau trié
   pour i = 0 à borneSuperieure:
      pour j = 0 à tabComptage[i]:
         tab[x++] = i
     finPour
  finPour
  retourne tab 
*/
	private int borneSuperieure;
	private int tailleTab;
	private int[] tabComptage;
	private int[] tab;
	private int x;
	
	public TriParComptage(int[] tab, int borneSuperieure) {
		
		// Initialisation des variables
		this.borneSuperieure = borneSuperieure;
		this.tab = tab; 
		this.tabComptage = new int[this.borneSuperieure+1];
		this.tailleTab = this.tab.length;
		this.x = 0;
	}
	
	private void initTabComptage () {
		for(int i=0; i<=this.borneSuperieure; i++) {
			this.tabComptage[i] = 0;
		}
	}
	
	private void createTabComptage() {
		for(int i=0; i<this.tailleTab; i++) {
			this.tabComptage[this.tab[i]]++;
		}
	}
	
	private void createTabTrie() {
		for(int i=0; i<=this.borneSuperieure; i++) {
			for (int j = 0; j < this.tabComptage[i]; j++) {
				this.tab[this.x++] = i;
			}
		}
	}
	
	public int[] trier() {
		
		// Initialisation du tableau de comptage à 0
		this.initTabComptage();
		
		// Création du tableau de comptage
		createTabComptage();
		
		// Création du tableau trié
		createTabTrie();
		
		return this.tab;
	}
}
