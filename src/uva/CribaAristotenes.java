package algoritmos;

import java.util.ArrayList;

/**
 * 
 * @author 
 */
public class CribaAristotenes {    
    
    public CribaAristotenes(){
    
    }
    
    public void numerosPrimos(int limit){
        int nums[]=llenarNumeros(limit);
        ArrayList<Integer>primos=new ArrayList<>();
        for (int i = 2; i < (int)Math.sqrt(limit); i++) {
            if(nums[i]!=0){
                primos.add(i);
                for (int j = i; j <= (limit/i) ; j++) {
                    nums[i*j]=0;
                }
            }
        }
    }
    
    private int[] llenarNumeros(int n){
        int res[];
        res = new int[n+1];
        for (int i = 0; i < res.length; i++) {
            res[i]=i;
        }
        return res;
    }
    
    public static void main(String args[]){
        int n=15000;
        CribaAristotenes criba=new CribaAristotenes();
        criba.llenarNumeros(n);
        criba.numerosPrimos(n);
    }
    
    
}
