package examenescompu1;
import java.util.Scanner;
/**
 *
 * @author Sergio Rodrigo
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
        int n; 
        int c=0;
        int nd;
        int aux;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        n=sc.nextInt();
        aux=n;
        nd=numDig(n);
        for(int i=1; i<=nd; i++){
            while(numDig(aux)>=i){
                int ns = numGrupos(aux, i);
                if(esPrimo(ns)==true)
                    c++;
                aux=aux/10;
            }
            aux=n;
        }
        System.out.println("Hay " + c + " numeros primos en " + n);
    }
        
    private static boolean esPrimo(int n){
        boolean res=false;
        int c=0;
        for(int i=1; i<=n; i++){
            if((n%i)==0)
                c++;
        }
        if(c==2)
            res=true;
        System.out.println(res);
        return res;
                
    }
    
    private static int numDig(int n){
        int c=0;
        while(n>0){
            n=n/10;
            c++;
        }
        return c;
    }
    
    private static int numGrupos(int n, int cd){
        int pow = (int) Math.pow(10, cd);
        System.out.println(n % pow);
        return (n % pow);
    }
}
