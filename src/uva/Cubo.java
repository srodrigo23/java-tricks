
/**
 * Write a description of class Cubo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cubo
{
  public int cubo(int num){
      return cubo(num, (num*(num-1))+1, 1,(num*(num-1))+1 );
  }
  
  public int cubo(int num, int ser, int vez, int suma){
      int res;
      int aux;
      if(num == vez)
        res = ser;
      else{
        aux = ser+2;
        ser = ser+aux;
        res = cubo(num, aux, vez+1, ser);
      }
      return res;
    }
}