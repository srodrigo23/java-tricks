
/**
 * Write a description of class Gremlinfs here.
 * 
 * @author (Terceros Córdova Viviana) 
 * @version (30/10/2006)
 */
import java.util.ArrayList;
public class Gremlinfs
{
    private int[] grem;
    private int tam;
	/**
	 * Constructor for objects of class Gremlinfs
	 */
	public Gremlinfs()
	{
	}
	
	public void rep(int n, int v){
	    tam=0;
	    tam( n, v);
	    grem= new int[tam];
	    rep(tam,n,v);
	    System.out.println(lista(tam));
	   }
	
    private void rep(int t, int n, int v){
        if(t>0){
            grem[--t]=(int)(n/v);
            grem[--t]=(int)(n-n/v);
            rep(t,(int)(n/v),v);
            rep(t,(int)(n-n/v),v);
        }
    }
    private void tam(int n, int v){
        if(n>v){
            tam=tam+2;
            tam((int)(n/v),v);
            tam((int)(n-n/v),v);
        }
    }
    private String lista(int n){
        String r;
        if(n==0)
        r="";
        else
        r=grem[n-1]+","+lista(n-1);
        return r;
    }
	
}
