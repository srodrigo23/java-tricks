
/**
 * Write a description of class Piramide_con_triangulos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Piramide_con_triangulos
{
   int triangulos(int n)
   {
       int res;
       if (n==0) System.out.println("No existe ese rango"); 
       if (n==1) res=1;
       else res = triangulos(n-1)+2*n-1;
       return res;
   }
}
