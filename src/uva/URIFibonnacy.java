import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class URIFibonnacy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class URIFibonnacy
{
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n, num;
        ArrayList<Integer>a;
        n=sc.nextInt();
        for(int i=0; i<n; i++){
            a=new ArrayList<Integer>();
            num=sc.nextInt();
            int res = fibonacci(num, a);
            System.out.println("fib("+num+") = "+(a.size()-1)+ " calls = "+ res);
        }
    }
    
    public static int fibonacci(int n, ArrayList<Integer> a){
        int res;
        a.add(0);
        if(n==0 || n==1){
            res = n;
        }else{
            res = fibonacci(n-1, a)+fibonacci(n-2, a);
        }
        return res;
    }
}
