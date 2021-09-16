
package intro.PP_2_2015;

/**
 *
 * @author SergioRodrigo
 */
public class P1 {
    
    void encontrarClave(long clave, int dl){
        String res;
        res = "Los digitos de la clave son ";
        int cantD, dig;
        cantD = 0;
        while(clave>0 && cantD <= 3){
            if(clave%10==dl){
                dig = (int)(clave/10)%10;
                clave/=100;
                res+=dig;
                cantD++;
                if(cantD!=3){
                    res+=", ";
                }
            }else{
                clave/=10;
            }
        }
        System.out.println(res);
    }
    
    public static void main(String[] args) {
        P1 p1=new P1();
        p1.encontrarClave(new Long("4454562480"), 4);
        p1.encontrarClave(new Long("74067506202"), 0);
    }   
}
