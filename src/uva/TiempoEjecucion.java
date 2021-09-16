
/**
 * Write a description of class TiempoEjecucion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TiempoEjecucion
{
    public static void main (String args[]){
        new TiempoEjecucion();
    }
    
    public TiempoEjecucion(){
        //int numero=10;
        long tiempoInicio=System.currentTimeMillis();
        ejecutaProceso();
        long tiempoFinal=System.currentTimeMillis();
        long tiempoTotal=tiempoFinal-tiempoInicio;
        System.out.println("Tiempo de ejecucion "+tiempoTotal+" milisegundos");
    }
    
    public void ejecutaProceso(){
        for(int i = 0; i < 1000; i++)
            System.out.println(i);
    }
}
