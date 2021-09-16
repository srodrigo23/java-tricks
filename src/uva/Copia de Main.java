qpackage icpc.Varios;
import java.util.Scanner;
/**
 *
 * @author SergioR
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[]in;
        String ent;
        int cont, i, j;
        int veces = 0;
        boolean bb=false;
        while(bb==false){
            ent = sc.next();
            if(ent==null){
                bb=true;
            }else{
                in = ent.toCharArray();
                cont = sc.nextInt();
                veces++;
                System.out.println("Case " +veces+":");
                for (int k = 0; k < cont; k++) {
                    i = sc.nextInt();
                    j = sc.nextInt();
                    if(equals(Math.min(i, j), Math.max(i,j), in)==true){
                        System.out.println("Yes");
                    }else{
                        System.out.println("No");
                    }
                }
            }
        }
    }
    
    public static boolean equals(int i, int j, char []in){
        return equals (i, j, in, true);
    }
    
    private static boolean equals(int i, int j, char []in, boolean r){
        boolean res;
        if(i==j)    res = r;
        else{
            r = in[i] == in[j];
            res = r && equals(i, j-1, in, r);
        }
        return res;
    }           
}
