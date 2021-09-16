/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package laboabril2;

/**
 *
 * @author Familia
 */
public class Quickort {
void ordenarQuicksort(int[] vector, int primero, int ultimo){
        int i=primero, j=ultimo;
        int pivote=vector[(primero + ultimo) / 2];
        int auxiliar;

        do{
                while(vector[i]<pivote) i++;
                while(vector[j]>pivote) j--;

                if (i<=j){
                        auxiliar=vector[j];
                        vector[j]=vector[i];
                        vector[i]=auxiliar;
                        i++;
                        j--;
                }

        } while (i<=j);

        if(primero<j) ordenarQuicksort(vector,primero, j);
        if(ultimo>i) ordenarQuicksort(vector,i, ultimo);
    }
public void quickSortRecursivo(int V[], int prim, int ult){
	int i, j, p, aux;
	i=prim;
	j=ult;
	p=V[(i+j)/2];
	do{
		while (V[i]<p)
			i=i+1;
		while (V[j]>p)
			j=j-1;
		if (i<=j) {
			aux= V[j];
			V[j]= V[i];
			V[i]= aux;
			i=i+1;
			j=j-1;
		}
	}
	while (i<j);{
		if (prim<j)
			quickSortRecursivo(V,prim,j);
		if (i<ult)
			quickSortRecursivo(V,i,ult);
	}
  }

}
