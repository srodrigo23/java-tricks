
/**
 * Write a description of class Sumas_especiales here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sumas_especiales
{
    public int Suma_dig_pares(int num)
    {
        
    int res;
    if(num>=0 && num<=9)
    {
        if (esPar(num))
            res = num;
        else res = 0;
    }
    else
    {
        if(esPar(num%10))
            res =Suma_dig_pares(num/10)+(num%10);
        else
            res = Suma_dig_pares(num/10);
       
    }
     return res;
    }
    
    private boolean esPar(int num)
    {
        return (num%2==0);
    }
}
