import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2456 {
    /**
     * URL: https://www.urionlinejudge.com.br/judge/es/problems/view/2456
     * Name: Cards
     * STATUS: ACEPTED
     * @param args
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        StringTokenizer stk = new StringTokenizer(in.readLine());
        int i=0, val[] = new int[5];
        boolean ans=true;
        while(stk.hasMoreTokens()){
            val[i] = Integer.parseInt(stk.nextToken());
            i++;
        }
        if(val[0] < val[1]){
            //orden creciente
            for (int j = 1; j < 5; j++) {
                for (int k = j + 1; k < 4; k++) {
                    if(val[j]>val[k]) ans= false;
                }
            }
            if(ans) System.out.println("C"); else System.out.println("N");
        }else{
            //orden creciente
            for (int j = 1; j < 5; j++) {
                for (int k = j + 1; k < 4; k++) {
                    if(val[j]<val[k]) ans= false;
                }
            }
            if(ans) System.out.println("D"); else System.out.println("N");
        }
    }
}