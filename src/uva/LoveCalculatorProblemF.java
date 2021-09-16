package SergioCodigo.UVa;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class LoveCalculatorProblemF {
    
    public static void main(String[] args) {
        String nom1, nom2;
        int cant1, cant2;
        double res;
        char arr [] = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            nom1 = sc.nextLine().toLowerCase();
            nom2 = sc.nextLine().toLowerCase();
            cant1 = redUnSoloNumero(valPal(arr, nom1.toCharArray()));
            cant2 = redUnSoloNumero(valPal(arr, nom2.toCharArray()));
            res = (double)Math.min(cant1, cant2)/Math.max(cant1, cant2)*100;
            System.out.println(new BigDecimal(res).setScale(2, RoundingMode.HALF_DOWN) + " %");
        }
    }
    
    public static int valPal(char arr[],char arrNom[]){
        int res=0;
        boolean bb = false;
        int j=0;
        for (int i = 0; i < arrNom.length; i++) {
           while(bb == false){
               if(arr[j] == arrNom[i]){
                   res = res + j + 1;
                   bb = true;
               }else{
                   j++;
                   if(j>25)
                       bb = true;
               }
           }
           bb = false;
           j = 0;
        }
        return res;       
    }
    
    public static int redUnSoloNumero(int num){
        int res;
        if(num < 10)res = num;
        else res = redUnSoloNumero(sumaDigitos(num));
        return res;
    }
    
    public static int sumaDigitos(int num){
        int res;
        if(num < 10) res = num;
        else res = num%10 + sumaDigitos(num/10);
        return res;
    }
}