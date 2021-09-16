/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srcCode.uva;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Sergio Rodrigo
 * 
 * 
 * implementar recursividad para todas las convinaciones
 */
public class fffPasswords628 { 
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        ArrayList<String> dicc = new ArrayList();
        ArrayList<String> reglas = new ArrayList();
        int numPal;
        int numReglas;
        String regla;
        String pass;
        String pal;
        String passAux;
        while(sc.hasNext()){
            numPal = sc.nextInt();
            for(int i=0; i<numPal; i++){
                dicc.add(sc.next());
            }
            numReglas = sc.nextInt();
            for(int i=0; i<numReglas; i++){
                reglas.add(sc.next());
            }
            System.out.print("--");
            for(int i=0; i<reglas.size(); i++){
                regla = reglas.get(i);
                for(int j=0; j<dicc.size(); j++){
                    pal  = dicc.get(j);
                    pass = regla.replaceAll("#", pal);
                    passAux = pass;
                    for(int k=0; k<=9; k++){
                        System.out.println(pass.replaceAll("0", Integer.toString(k)));
                        pass = passAux;
                    }
                }
            }


            //faltaaaaaa


            dicc  = new ArrayList<>();
            reglas = new ArrayList<>();
        }
    }
}