package Metodos_Recursivos;


/**
 * Write a description of class Num_Circulos here.
 * 
 * Sergio Cardenas
 * @version (a version number or a date)
 */
public class Num_Circulos
{
    public int Circulos(int num)
    {
       int res;
       if(num == 1)
        res = 1;
       else
        res = Circulos(num -1)+ 4*(num - 1);
       return res;
    }
}
