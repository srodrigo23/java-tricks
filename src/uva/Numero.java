package Problema1;
/**
 * Write a description of class CuadradoNumero here.
 * 
 * @author SRCR 
 * @version 1.0
 */
public class Numero
{
    int n;
    public Numero(int num){
        n = num;
    }
    
    public int calcularCuadrado(){
        int c=0;
        int imp;
        imp = 1;
        String suma="La suma de: ";
        for(int i=1; i<=n; i++ ){
            suma+=imp+" ";
            c+=imp;
            imp=imp+2;
        }
        System.out.println(suma);
        return c;
    }
}
