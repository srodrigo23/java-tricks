
/**
 * Write a description of class Circunferencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circunferencia
{
    int cir(int n)
    {
        int res;
        if(n==1) res=1;
        else res = cir(n-1)+4*(n-1);
        return res;
    }
}
