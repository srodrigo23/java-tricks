
/**
 * Hallar la clave de 3 digitos, teniendo la clave codificada (cc) y 
 * el digito de base (b), a la izquierda de cada digito de base se encuentra
 * un digito de la clave.
 * @author Roger Alberto Flores vargas 
 * @version 18.12.15
 */
public class Clave
{
    int clave(long cc, int b){
        int clave;
        long d;
        int i;
        i = 0;
        clave = 0;
        while(i <= 2){
            d = cc % 10;
            cc /= 10;
            if(d == b){
                clave += (int)(cc % 10) * (int)Math.pow(10,i);
                i++;
                cc /= 10;
            }
        }
        return clave;
    }
}