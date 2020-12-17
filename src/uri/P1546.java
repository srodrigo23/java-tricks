import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1546 {
    /**
     * URL: https://www.urionlinejudge.com.br/judge/es/problems/view/1546
     * Name: FeddBack
     * STATUS: ACCEPTED
     * @param args
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        int N, K, val;
        String[]encharged = {"Rolien", "Naej", "Elehcim", "Odranoel"};
        N = Integer.parseInt(in.readLine());
        for (int i = 0; i < N; i++) {
            K = Integer.parseInt(in.readLine());
            for (int j = 0; j < K; j++) {
                val = Integer.parseInt(in.readLine());
                System.out.println(encharged[val-1]);
            }
        }
    }
}
