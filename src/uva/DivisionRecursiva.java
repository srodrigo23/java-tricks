/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package srcCode.recursividad;

/**
 *
* @author Sergio Rodrigo
 */
public class DivisionRecursiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //division de 110 /2
        int []arr=new int[2];
        int a = 110;
        int b = 2;
        arr = divisionRecursiva(a, b, arr, 0);
        //volvemos a formar 'a'
        int res = b * arr[0] +arr[1];
        System.out.println(res);
    }
    
    //retornara el valor de q y r en un arreglo de dos posiciones
    public static int[] divisionRecursiva(int a ,int b,int aux[], int cont){
        int res[];
        if(a < b){
            aux[0] = cont; //valor de q
            aux[1] = a;    //valor de r
            res = aux;
        }else{
            res = divisionRecursiva(a-b, b, aux, cont+1);
        }
        return res;
    }
    
}
