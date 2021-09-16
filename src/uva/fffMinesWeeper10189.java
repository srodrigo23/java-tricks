/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package srcCode.uva;

import java.util.Scanner;
/**
 * 
 * @author Sergio Rodrigo
 */

public class fffMinesWeeper10189 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, m, field;
        field  = 0;
        String line;
        boolean bb = false;
        while(bb == false){
            n = sc.nextInt();
            m = sc.nextInt();
            sc.nextLine();
            if(n==0 && m==0){
                bb = true;
            }else{
                String [][]mines = new String[n][m];
                for(int i=0; i<n; i++){
                    line = sc.nextLine();
                    for(int j=0; j<m; j++)
                        mines[i][j] = line.charAt(j)+"";    
                }
                
                for(int i=0; i<n; i++){
                    for(int j=0; j<m; j++){
                        if(i==0 && j==0){
                            if("*".equals(mines[i][j])){
                                mines[i][j+1]   = simb(mines[i][j+1]);
                                mines[i+1][j+1] = simb(mines[i+1][j+1]);
                                mines[i+1][j]   = simb(mines[i+1][j]);
                            }
                        }else                        
                        if(i==0 && j>0 && j < m ){
                            if("*".equals(mines[i][j])){
                                mines[i][j+1]   = simb(mines[i][j+1]);
                                mines[i+1][j+1] = simb(mines[i+1][j+1]);
                                mines[i+1][j]   = simb(mines[i+1][j]);
                                mines[i+1][j-1] = simb(mines[i+1][j-1]);
                                mines[i][j-1]   = simb(mines[i][j-1]);                            
                            }
                        }else                        
                        if(i==0 && j == m){
                            mines[i+1][j]   = simb(mines[i+1][j]);
                            mines[i+1][j-1] = simb(mines[i+1][j-1]);
                            mines[i][j-1]   = simb(mines[i][j-1]);
                        }
                    }
                }
            
                
                for(int i=0; i<n; i++){
                    for(int j=0; j<m; j++)
                        System.out.print(mines[i][j]);
                    System.out.println("");
                }
            }    
        }
    }
    
    public static String simb(String c){
        String res;
        switch (c) {
            case "*":  
                res = "*";
                break;
            case ".":
                res = "1";
                break;
            default:
                res = Integer.toString(Integer.parseInt(c)+1);
        }
        return res;
    }
}