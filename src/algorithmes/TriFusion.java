package algorithmes;

import java.util.Arrays;

/**
 * Algorithme
 *
'''procedure''' tri_fusion(tableau t)
    n = longueur(t)
    si n > 1 alors
        u = tri_fusion(t[1], …, t[n / 2]) // premiere moitie
        v = tri_fusion(t[n / 2 + 1], …, t[n]) // deuxieme moitie
        a = 1 // pointeur pour parcourir les elements de u
        b = 1 // pointeur pour parcourir les elements de v
        '''pour''' i '''allant de''' 1 '''à''' n '''faire'''
            '''si''' (a <= longueur(u)) // si tous les elements de u n'ont pas ete parcourus
                et (b > longueur(v) // et si tous les elements de v ont ete parcourus
                ou u[a] ≤ v[b]) '''alors''' // ou si l'element courant de u est plus petit
                t[i] = u[a] // on choisit l'element courant de u comme element suivant de t
                a = a + 1 // on avance dans u
            '''sinon'''
                t[i] = v[b] // on choisit l'element courant de v comme element suivant de t
                b = b + 1 // on avance dans v
            '''fin si
        '''fin pour'''
    '''fin si'''
    renvoyer t
'''fin procedure'''
 */
public class TriFusion {
	
	private int [] tab;
	
	/**
	 * Constructeur permettant de definir le tableau
	 * @param tab Le tableau
	 */
	public TriFusion(int [] tab) {
		this.tab = tab;
	}
	
	/**
	 * Methode permettant de trier le tableau
	 */
	public void trier() {
		
		int tabSize = tab.length;

		if (tabSize > 1) {
			
			int middleTabIndex = tabSize/2;
			TriFusion fusion;
			
			// premiere moitie moitie du tableau
			fusion = new TriFusion(Arrays.copyOfRange(tab, 0, middleTabIndex));
			fusion.trier();
			int[] firstSlice = fusion.getTab();
			
			// deuxieme moitie du tableau
			fusion = new TriFusion(Arrays.copyOfRange(tab, middleTabIndex, tabSize));
			fusion.trier();
			int[] secondSlice = fusion.getTab();
			
			// pointeur pour parcourir les elements de firstSlice
			int firstSlicePtr = 0;
			
			// pointeur pour parcourir les elements de secondSlice
			int secondSlicePtr = 0;
			
			for (int i = 0; i<tabSize; i++) {
				
				if ((firstSlicePtr < middleTabIndex) // si tous les elements de firstSlice n'ont pas ete parcourus
					&& (secondSlicePtr >= (tabSize - middleTabIndex) // et si tous les elements de secondSlice ont ete parcourus
					|| firstSlice[firstSlicePtr] <= secondSlice[secondSlicePtr]) // ou si l'element courant de firstSlice est plus petit
				) {
					
					// on choisit l'element courant de firstSlice comme element suivant de tab
					tab[i] = firstSlice[firstSlicePtr];
					
					// on avance dans firstSlice
					firstSlicePtr = firstSlicePtr + 1;
				} else {
					
					// on choisit l'element courant de secondSlice comme element suivant de tab
					tab[i] = secondSlice[secondSlicePtr];
					
					// on avance dans secondSlice
					secondSlicePtr = secondSlicePtr + 1;
				}
			}
		}
	}
	
	/**
	 * Methode pour recuperer le tableau
	 * @return tableau
	 */
	public int[] getTab() {
		return this.tab;
	}
}
