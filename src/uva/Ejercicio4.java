package icpc.Varios;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k, res;
        System.out.println("Ingrese N :");
        n = sc.nextInt();
        System.out.println("Ingrese K :");
        k = sc.nextInt();
        res = combinaciones(n, k);
        System.out.println("Existen " + res + " formas de sumar ese valor!");
    }
    
    public static int combinaciones(int n, int k){
        int ar[] = new int [n+1];
        int comb[] = new int [k];
        ar   = llenarArreglo(ar, 0);
        comb = estadoInicial(comb, ar[0], 0);
        return combinaciones(n, k-1, ar, 0, 0, comb);        
    }
    
    public static int[] estadoInicial(int comb[], int a, int i){
        int res[];
        if(i == comb.length){
            res = comb;
        }else{
            comb[i] = a;
            res = estadoInicial(comb, a, i+1);
        }
        return res;
    }
    
    public static int[] llenarArreglo(int a[], int i){
        int []res;
        if(i==a.length){
            res = a;
        }else{
            a[i] = i;
            res = llenarArreglo(a, i+1);
        }
        return res;
    }
   
    private static int combinaciones (int n, int k, int a[], int i, int cont, int comb[]){
        int res;
       // if(i==a.length) i=0;
        if(k >= a.length){
            res = cont;
        }else{
            comb[k] = a[i];
            if(sumaCombinaciones(comb) == n){
                cont++;
                System.out.println(Arrays.toString(comb));
            }
            i++;
            if(i<=a.length){
                res = combinaciones(n, k, a, i, cont, comb);
            }else{
                i=0;
                res = combinaciones(n, k-1, a, i, cont, comb);
            }
        }
        return res;
    }
   
    public static int sumaCombinaciones(int a[]){
        return sumaCombinaciones(a, 0, 0);
    }
    
    private static int sumaCombinaciones(int a[], int i, int s){
        int res;
        if(i == a.length){
            res = s;
        }else{
            s = s + a[i];
            res = sumaCombinaciones(a, i+1, s);
        }
        return res;
    }
}