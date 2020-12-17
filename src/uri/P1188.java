import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.urionlinejudge.com.br/judge/es/problems/view/1188
 * PROBLEM: Inferior Area
 * STATUS: ACCEPTED
 */

public class P1188
{
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        double[][] mat = new double [12][12];
        double sum = 0, prom ;
        char character;
        character = in.readLine().charAt(0);
        for(int i=0; i<12; i++){
            for(int j=0; j<12; j++){
                mat[i][j] = Double.parseDouble(in.readLine());
            }
        }

        int ini = 5, fin= 6, cont=0;
        for(int i=7; i<=11; i++){
            for(int j=ini; j<=fin; j++){
                sum += mat[i][j];
                cont++;
            }
            ini--;
            fin++;
        }
        prom = sum/cont;

        if(character == 'S'){
            System.out.println(Math.round(sum * 10) / 10.0);
        }else{
            System.out.println(Math.round(prom * 10) / 10.0);
        }
    }
}
