
/**
 * Write a description of class Multiplicaci�n here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Multiplicaci�n
{
    public int mult (int x, int y)
    {
        int res;
        if (x==1) res = y;
        else
            if (x % 2 == 0)
                res = mult (x/2, y*2);
            else 
                res = mult (x/2, y*2)+y;
        return res;
    }
}
