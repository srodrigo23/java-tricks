package javaapplication10;
import java.util.Scanner;
/**
 *
 * @author Sergio Rodrigo
 */
public class UVa10035 {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        int a, b, nC;
        boolean bb = false;
        while(bb==false){
            a = sc.nextInt();
            b = sc.nextInt();
            if(a==0 && b==0){
                bb=true;
            }else{
                nC = numCarries(a, b);
                switch(nC){
                    case 0:  System.out.println("No carry operation.");
                             break;
                    case 1:  System.out.println(nC + " carry operation.");
                             break;
                    default: System.out.println(nC + " carry operations.");
                }
            }
        }
    }
    
    public static int numCarries(int a, int b){
        return numCarries(a, b, 0, 0);
    }
    
    private static int numCarries(int a, int b, int contC, int c){
        int res, rr, d1, d2;
        if( a==0 && b==0 ){
            res = contC;
        }else{
            d1 = a % 10; d2 = b % 10;
            rr = d1 + d2 + c;
            if(rr >= 10) 
                contC++;
            c = rr/10;
            a=a/10;
            b=b/10;
            res = numCarries(a, b, contC, c);
        }
        return res;
    }
}