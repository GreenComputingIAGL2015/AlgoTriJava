package algorithmes;

public class TriABullesOptimise {
	
	private int [] tab;
	
	/**
	 * Constructeur permettant de définir le tableau
	 * @param tab Le tableau
	 */
	public TriABullesOptimise(int [] tab) {
		this.tab = tab;
	}
	
	/**
	 * Méthode permettant de trier le tableau
	 */
	public void trier() {
		
		int tabSize = this.tab.length;
		boolean echange = true;
		
		while ((tabSize > 0) && echange) {
			
			echange = false;
			
			for (int i = 0; i < tabSize  - 1; i++) {
				
				if (this.tab[i] > this.tab[i+1]) {
					int tmp = this.tab[i];
					this.tab[i] = this.tab[i+1];
					this.tab[i + 1] = tmp;
					echange = true;
				}
				
			}
			
			tabSize = tabSize - 1;
		}
	}
}
