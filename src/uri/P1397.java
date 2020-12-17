import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1397 {

    /**
     * URL: https://www.urionlinejudge.com.br/judge/es/problems/view/1397
     * Name: Game of THe Greatest
     * STATUS: ACCEPTED
     * @param args
     */

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        int nc, na, nb, nWA=0, nWB=0;
        String line[];
        while((nc = Integer.parseInt(in.readLine()))!=0){
            nWA = 0;
            nWB = 0;
            for (int i = 0; i < nc; i++) {
                line = in.readLine().split(" ");
                na = Integer.parseInt(line[0]);
                nb = Integer.parseInt(line[1]);
                if(na > nb) nWA++;
                else if(na < nb) nWB++;
            }
            System.out.println(nWA+" "+nWB);
        }

    }
}