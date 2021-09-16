public class MatrizLatino
{
    public static int [][] latino (int fila, int col, int cont, int orden, int mat [] [])
    {
	if (fila == 0 && col == 0)
	    mat [0] [0] = 1;
	else
	    if (fila == col)
		latino (fila - 1, orden - 1, orden, orden, mat);
	    else
	    {
		mat [fila] [col] = cont;
		latino (fila, col - 1, orden + 1, orden, mat);
	    }
	    return mat;
    }
    public static void mostrarMatriz(int [][] mat){
    	for(int i = 0; i < mat.length; i++){
    		for(int j = 0; j < mat[0].length;j++){
    			System.out.print(mat[i][j]+"\t");
    		}
    		System.out.println();
    	}
    }
    public static int[][] llenar(int [][] mat)
    {
    	int con = 0;
    	for(int i = 0; i < mat.length; i++){
    		for(int j = 0; j < mat[0].length;j++){
    			mat[i][j] = con;
    			con++;
    		}
    	
    	}
    	return mat;
    }
    public static void main (String[] args) {
    	int[][] a = new int[4][4];
    	a = llenar(a);
    	a = latino(1,1,4,1,a);
    	mostrarMatriz(a);
    }
}
