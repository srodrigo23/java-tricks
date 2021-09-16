import java.util.Scanner;
/**
 * Write a description of class URIAutomaticChek here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class URIAutomaticChek
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        boolean res=true;
        int plug1[]=new int[5];
        int plug2[]=new int[5];
        for(int i=0;i<5;i++){
            plug1[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            plug2[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            if(plug1[i]==plug2[i]){
                res=false;
            }
        }
        if(res){
            System.out.println("Y");
        }else{
            System.out.println("N");
        }
        
    }
}
