import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.urionlinejudge.com.br/judge/es/problems/view/1379

public class P1379 {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        String line;
        while(!(line = in.readLine()).equals("0 0")){
            String AB[] = line.split( " ");
            int A = Integer.parseInt(AB[0]);
            int B = Integer.parseInt(AB[1]);
            System.out.println(A - (B-A));
        }
    }
}
