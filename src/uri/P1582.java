import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  url: https://www.urionlinejudge.com.br/judge/es/problems/view/1582
 *  status: accepted
 *  level:3
 */

public class P1582 {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        String val[], line;
        int a, b, c, aux;
        while((line = in.readLine())!=null){
            val = line.split(" ");
            a = Integer.parseInt(val[0]);
            b = Integer.parseInt(val[1]);
            c = Integer.parseInt(val[2]);
            if(a>b){
                aux =a;
                a = b;
                b = aux;
            }
            if(b>c){
                aux = b;
                b = c;
                c = aux;
            }
            if(a>c){
                aux = a;
                a = c;
                c = aux;
            }
            if(!reviewPythag(a, b, c))
                System.out.println("tripla");
            else if(gcd(gcd(a, b), c)==1)
                System.out.println("tripla pitagorica primitiva");
            else System.out.println("tripla pitagorica");
        }
    }

    public static int gcd(int a, int b){
        while(a!=b){
            if (a>b)a=a-b;
            else b=b-a;
        }
        return a;
    }

    public static boolean reviewPythag(int a, int b, int c){
        return (Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2);
    }
}
