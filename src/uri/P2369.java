import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2369 {

    /**
     * URL: https://www.urionlinejudge.com.br/judge/es/problems/view/2369
     * Name: Conta de Água
     * STATUS: Acepted
     * @param args
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        int n = Integer.parseInt(in.readLine());
        int ans = 0;
        if(n>=101) ans = (n - 100)*5 + (100-30)*2 + (30-10) + 7;
        else if (n >= 31 && n <= 100) ans = (n-30)*2 + (30-10) + 7;
        else if (n >= 11 && n <= 30) ans = (n-10) + 7;
        else ans = 7;
        System.out.println(ans);
    }
}
