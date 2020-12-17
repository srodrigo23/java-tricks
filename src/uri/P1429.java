import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Link: -...uri
 * PROBLEM: Primes Again
 * * status: ACEPTED
 */

public class P1429 {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        String num;
        int fac[] ={1, 2, 6, 24, 120};
        int ans;
        char n[];
        while(!(num=in.readLine()).equals("0")){
            n = num.toCharArray();
            ans = 0;
            for(int i=0; i<n.length; i++){
                ans = ans + (((int)n[i]-48)*(fac[n.length-(i+1)]));
            }
            System.out.println(ans);
        }
    }
}
