
/**
 * Write a description of class Fractales_Piramides here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fractales_Piramides
{
    int triangulos(int n)
    {
        int res;
        if(n==1) res = 1;
        else res = 2*triangulos(n-1)+2;
        return res;
    }
}
