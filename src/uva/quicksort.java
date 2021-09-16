
public class quicksort {
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

}
