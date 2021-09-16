package instancia;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




    }

    public static void mostrarParteClara(int[][]m){
        int ini = 1, fin = m[0].length - 1;
        for (int i = 0; i <m.length/2 - 1; i++) {
            for (int j = ini; j < fin; j++) {
                System.out.println(m[i][j]);
            }
            ini++;
            fin--;
        }

        //despues lo mismo
    }


}
