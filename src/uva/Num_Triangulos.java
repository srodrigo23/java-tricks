package Metodos_Recursivos;


/**
 * El siguiente metodo recusivo calcula la cantidadde triangulos que son necesarios para poder 
 * construir un triangulo de altura (num);
 * 
 * Sergio Cardenas
 * 25/02/2011
 */
public class Num_Triangulos
{
    public int Triangulos(int num)
    {
        int res;
        if(num == 1)
            res = 1;
        else
            res = Triangulos (num-1)+ 2*num-1;
        return res;
    }
}
