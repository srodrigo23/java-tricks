
/**
 * Write a description of class Esta_Dentro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Esta_Dentro
{
    public boolean esta_Dentro(int num1, int num2)
    {
        boolean res;
        if(num1 == num2)
            res = true;
        else
        {
            res = esta_Dentro(num1%numdig(num2), num2);
            num1 /= 10;
        }
        return res;
    }
    
    public int numdig(int num)
    {
        int c = 0;
        if(num>=1 && num<=9)
            c = c + 1;
        else
        {    num /=10;
            c = c + 1;
            numdig(num);}
        return c;
    }
}
