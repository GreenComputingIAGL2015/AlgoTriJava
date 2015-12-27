package algorithmes;

import java.util.Arrays;

/**
 * Algorithme
 *
'''procédure''' tri_fusion(tableau t)
    n = longueur(t)
    si n > 1 alors
        u = tri_fusion(t[1], …, t[n / 2]) // première moitié
        v = tri_fusion(t[n / 2 + 1], …, t[n]) // deuxième moitié
        a = 1 // pointeur pour parcourir les éléments de u
        b = 1 // pointeur pour parcourir les éléments de v
        '''pour''' i '''allant de''' 1 '''à''' n '''faire'''
            '''si''' (a <= longueur(u)) // si tous les éléments de u n'ont pas été parcourus
                et (b > longueur(v) // et si tous les éléments de v ont été parcourus
                ou u[a] ≤ v[b]) '''alors''' // ou si l'élément courant de u est plus petit
                t[i] = u[a] // on choisit l'élément courant de u comme élément suivant de t
                a = a + 1 // on avance dans u
            '''sinon'''
                t[i] = v[b] // on choisit l'élément courant de v comme élément suivant de t
                b = b + 1 // on avance dans v
            '''fin si
        '''fin pour'''
    '''fin si'''
    renvoyer t
'''fin procédure'''
 */
public class TriFusion {
	
	public int[] trier(int [] tabToSort, int tabSize) {
		
		int indexMax = tabSize - 1;
		
		if (tabSize > 1) {
			
			// première moitié
			int [] firstSlice = trier(Arrays.copyOfRange(tabToSort, 0, tabSize/2), tabSize/2);
			
			// deuxième moitié
			int [] secondSlice = trier(Arrays.copyOfRange(tabToSort, tabSize/2, tabSize), tabSize - tabSize/2);
			
			// pointeur pour parcourir les éléments de firstSlice
			int firstPtr = 0;
			
			// pointeur pour parcourir les éléments de secondSlice
			int secondPtr = 0;
			
			for (int i = 0; i<indexMax; i++) {
				
				// si tous les éléments de firstSlice n'ont pas été parcourus
				// et si tous les éléments de secondSlice ont été parcourus
				// ou si l'élément courant de firstSlice est plus petit
				if ((firstPtr < firstSlice.length) && (secondPtr >= secondSlice.length || firstSlice[firstPtr] <= secondSlice[secondPtr])) {
					
					// on choisit l'élément courant de firstSlice comme élément suivant de tab
					tabToSort[i] = firstSlice[firstPtr];
					
					// on avance dans firstSlice
					firstPtr = firstPtr + 1;
				} else {
					
					// on choisit l'élément courant de secondSlice comme élément suivant de tab
					tabToSort[i] = secondSlice[secondPtr];
					
					// on avance dans secondSlice
					secondPtr = secondPtr + 1;
				}
			}
		}
		
		return tabToSort;
	}
}
