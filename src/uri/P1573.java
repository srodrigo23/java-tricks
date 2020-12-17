import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class P1573 {
    /**
     * URL: https://www.urionlinejudge.com.br/judge/es/problems/view/1573
     * Name: Fabrica de chocolate
     * STATUS: ACEPTED
     * @param args
     */

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        String line, V[];
        while(!(line = in.readLine()).equals("0 0 0")){
            V = line.split(" ");
            int vol = Integer.parseInt(V[0]) * Integer.parseInt(V[1]) * Integer.parseInt(V[2]);
            System.out.println((int)Math.pow(vol,0.33333333333333333333));
        }
    }
}
