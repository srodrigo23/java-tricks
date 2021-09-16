import java.util.Scanner;
/**
 * Write a description of class uri_queens here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class uri_queens
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x1, y1, x2, y2, res;
        while(true){
            x1=sc.nextInt();
            y1=sc.nextInt();
            x2=sc.nextInt();
            y2=sc.nextInt();
            if(x1==0 && y1==0 && x2==0 && y2==0)    break;
            if(x1==x2 && y1==y2)    res=0;
            else if(x1==x2 || y1==y2)res=1;
            else if(Math.abs(x1-x2)==Math.abs(y1-y2)) res=1;
            else    res=2;
            System.out.println(res);
        }
    }
}
