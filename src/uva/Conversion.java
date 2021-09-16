
/**
 * Write a description of class Conversion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Conversion
{
    private int num1;
    private int num2;
    
    Conversion(){
        num1 = 1;
        num2 = 1;
    }
    
    public void km_a_milla(int num){
        int res;
        if(esFibonacci(num)){
            res = km_a_milla(num1, num2, num);
            System.out.println(res);
        }
        else{
            System.out.println("no se puede relizar la conversión por este metodo");
        }
    }
    
    public void milla_a_km(int num){
        int res;
        if(esFibonacci(num)==true){
            res = milla_a_km(num1, num2, num);
            System.out.println(res);
        }
        else{
            System.out.println("no se puede relizar la conversión por este metodo");
        }
    }
    
    private int km_a_milla(int n1, int n2, int n){
        int aux;
        int res;
        if(n2 == n)
            res = n1+n2;
        else{
            aux = n1;
            n1 = n2;
            n2 = aux + n2;
            res =  km_a_milla(n1,n2,n);
        }
        return res;    
    }
    
     private int milla_a_km(int n1, int n2, int n){
        int aux;
        int res;
        if(n2 == n)
            res = n1;
        else{
            aux = n1;
            n1 = n2;
            n2 = aux + n2;
            res = milla_a_km(n1,n2,n);
        }
        return res;    
    }
    
    private boolean esFibonacci(int n){
        return esFibonacci(num1,num2,n);
    }
    
    private boolean esFibonacci(int n1, int n2,int n){
        boolean res = false;
        if(n2 == n)
            res = true;
        else 
            if(n2 < n)
                res = esFibonacci(n2,n1+n2,n);
        return res;
    }
}
