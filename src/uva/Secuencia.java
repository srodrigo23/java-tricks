import java.util.ArrayList;
import java.util.Arrays;

/**
 * Write a description of class secuenciauecia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Secuencia
{
    private ArrayList<Integer> secuencia;
    public  Secuencia()
    {
        secuencia= new ArrayList<Integer>(Arrays.asList(-3,1,2,-10,3,4,-5,8));
    }
    public int sumar()
    {
        return sumar(secuencia.size() - 1);
    }
    public ArrayList<Integer> getsecuencia()
    {
        return secuencia;
    }
    private int sumar(int i)
    {    int suma=0;
        if(i==0)
        {
            suma=secuencia.get(i);
        }
        else
        {
            suma=suma+sumar(i-1)+secuencia.get(i);
        }
        return suma;
    }
    public int minimoElemento()
    {
        return minimoElemento(secuencia.size()-1);
    }
    private int minimoElemento(int tam)
    {   
        int min=secuencia.get(0);
        if(tam>=0)
        {   min=minimoElemento(tam-1);
             if(secuencia.get(tam)<min)
            {
                min=secuencia.get(tam);
            }
        }
        return min;
    }

     public boolean buscador(int x,int i)
     {
         boolean resp=false;
         if(i<=secuencia.size()-1)
         {
             if(x!=secuencia.get(i))
             {
                 resp=buscador(x,i+1);
             }
             else resp=true;
         }
         return resp;
     }
     
     public ArrayList<Integer> sumadorSecuencia(Secuencia sec)
     {
         return sumadorSecuencia(sec,new ArrayList<Integer>(),0);
     }

     private ArrayList<Integer> sumadorSecuencia(Secuencia sec,ArrayList<Integer>respuesta, int i)
     {
         if(sec.getsecuencia().size()==secuencia.size())
         {
             if(i<secuencia.size())
             {
                 respuesta.add(sec.getsecuencia().get(i)+secuencia.get(i));
                 System.out.println(i+" "+ respuesta);
                 sumadorSecuencia(sec,respuesta,i+1);
             }
         }
         return respuesta;
     }

    public void ordenarSecuencia()
    {
        ordenarSecuencia(secuencia,secuencia.size());
    }

    private void ordenarSecuencia(ArrayList<Integer> col,int n)
    {
        int pivote = generarPivote(col,n);
        ArrayList<Integer>c1= new ArrayList<Integer>();
        ArrayList<Integer>c2= new ArrayList<Integer>();
        if(n>1)
        {
            
            dividir(col,c1,c2,pivote,0);
            System.out.println(n+"  "+col);
            System.out.println("C1:"+n+"  "+c1);
            System.out.println("C2:"+n+"  "+c2);
            ordenarSecuencia(c1,c1.size());
            ordenarSecuencia(c2,c2.size());
            col=unir(c1,c2);
     
            
        }
    }
      private int generarPivote(ArrayList<Integer> lista, int n)
    {
        return lista.get((int)(Math.random()*(n-1)));
    }
    private void dividir(ArrayList<Integer> col,ArrayList<Integer> c1,ArrayList<Integer> c2, int pivote, int i)
    {
        if(i<col.size())
        {
            if(col.get(i)>pivote)
            {
                c2.add(col.get(i));
            }
            else
            {
                c1.add(col.get(i));
            }
            dividir(col,c1,c2,pivote,i+1);
        }
    }
    private ArrayList<Integer> unir(ArrayList<Integer>c1,ArrayList<Integer>c2)
    {   ArrayList<Integer>respuesta= new ArrayList<Integer>(c1);
        respuesta.addAll(c2);
        return respuesta;
    }
}
