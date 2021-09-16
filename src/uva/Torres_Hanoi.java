
/**
 * Write a description of class Torres_Hanoi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Torres_Hanoi
{
    public String torreHanoi (int n, char orig, char dest, char aux)
    {
        String res = "";
        if (n == 1) res = mover (n, orig, dest);
        else
        {
            res = torreHanoi(n-1, orig, aux, dest);
            res = res + mover (n, orig, dest);
            res = res + torreHanoi (n-1, aux, dest, orig);
        }
        return res;
    }
    
    private String mover (int n, char a, char b)
    {
        return "Movimiento "+n+"de "+a+"a "+b+"/n";
    }
}
