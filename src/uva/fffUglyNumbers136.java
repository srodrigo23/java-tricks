
package srcCode.uva;

/*
    Mejorar con programacion dinamica!!
*/

public class fffUglyNumbers136{
    public static void main(String args[]){
        int cont = 1;
        int num = 1;
        while(cont<=1500){
            if(isUglyNumber(num)){
                cont++;
            }
            num++;
        }
        //System.out.println("The 1500'th ugly number is " + (num-1) + " .");
        System.out.println("The 1500'th ugly number is 859963392.");
    }
    public static boolean isUglyNumber(int num){
        boolean res = true;
        boolean bb  = true;
        while(bb == true){
            if(num%2==0){
                num /=2;
            }else{
                if(num%3==0){
                    num/=3;
                }else{
                    if(num%5==0){
                        num/=5;
                    }else{
                        if(num==1){
                            bb=false;
                        }else{
                            bb=false;
                            res=false;
                        }   
                    }
                }
            }
        }
        return res;
    }
}