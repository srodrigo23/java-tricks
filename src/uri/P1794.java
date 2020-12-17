import jdk.swing.interop.SwingInterOpUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1794 {

    /**
     * URL: https://www.urionlinejudge.com.br/judge/es/problems/view/1794
     * PROBLEM: LAVADERO
     * STATUS: ACCEPTED
     * NUM:1794
     * @param args
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        int N, LA, LB, SA, SB;
        String []line;
        N = Integer.parseInt(in.readLine());
        line = in.readLine().split(" ");
        LA = Integer.parseInt(line[0]);
        LB = Integer.parseInt(line[1]);
        line = in.readLine().split(" ");
        SA = Integer.parseInt(line[0]);
        SB = Integer.parseInt(line[1]);
        if(isInRange(N, LA, LB) && isInRange(N, SA, SB)){
            System.out.println("possivel");
        }else{
            System.out.println("impossivel");
        }

    }

    private static boolean isInRange(int n, int a, int b) {
        return n>=a && n<=b;
    }

}
