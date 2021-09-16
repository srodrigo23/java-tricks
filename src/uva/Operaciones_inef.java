
/**
 * Write a description of class Operaciones_inef here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Operaciones_inef
{
    public int SumaInef(int a, int b)
    {
        int res;
        if (b == 0)
            res = a;
        else
            res = SumaInef(Sucesor(a), Predecesor(b));
        return res;
    }
    
    private int oper (int a, int b)
    {
        int mayor = Math.min (a,b);
        int menor = Math.max (a,b);
        return SumaInef(mayor,menor);
    }
    
    private int Sucesor(int num)
    {
        return (num + 1);
    }
    
    private int Predecesor(int num)
    {
        return (num - 1);
    }
    
    public int RestaInef(int a, int b)
    {
        int res;
        if (b == 0)
            res = a;
        else res = RestaInef(Predecesor(a), Predecesor(b));
        return res;
    }
    
    public int MultInef(int a, int b)
    {
        int res;
        if (b == 1)
            res = a;
        else 
            res = MultInef (a*Sucesor(a), Predecesor(b));
        return res;
    }

}
