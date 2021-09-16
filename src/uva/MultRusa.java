
/**
 * Write a description of class MultRusa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MultRusa
{
     public static int mult_rusa(int A, int B)
    { 
        if(A==1){
            return (B);
    }
        if(A%2!=0){
            return(B+mult_rusa( A/2 , B*2));
        }
        else{
            return(mult_rusa( A/2 , B*2));
        }                                
    }
    public static void main(String [] args)
    {
        System.out.println("14 X 9  = "+mult_rusa(14,9));
        System.out.println("9  X 14 = "+mult_rusa(9,14));
    }
}
