
/**
 * Write a description of class Prom here.
 * 
 * @author (Terceros córdova Viviana) 
 * @version (30/10/2006)
 */
public class Prom extends Functor
{
	public Prom()
	{
	    super();
	}
	
	public double calcular(int[]sec, int t){
	    return ((double)suma(sec,t, 0))/((double)t);
	   }
	private int suma(int[] sec, int t, int p){
	    int r;
	    if(p==t)
	    r=0;
	    else
	    r=sec[p] +suma(sec, t, p+1);
	    return r;
	   }
}
