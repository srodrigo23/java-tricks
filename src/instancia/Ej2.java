package instancia;

public class Ej2 {

    public static void main(String[] args) {

    }

    public void espiral(int [][]m){
        int fil = m.length;
        int col = m[0].length;
        int i=0, j=0;
        for (int a = 0; a < fil/2; a++) {
            for (int k = i; k < col; k++) System.out.println(m[i][k]);
            j++;
            for (int k = j; k < fil; k++) System.out.println(m[k][col-1]);
            col--;
            for (int k = col; k >= i; k--) System.out.println(m[fil-1][k]);
            fil--;
            for (int k = fil; k >= i+1 ; k--) System.out.println(m[k][i]);
            i++;
        }
    }
}
