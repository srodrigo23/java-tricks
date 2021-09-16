import java.util.Scanner;
class panqq
{
    public static void main (String[]arg)
    {
        Scanner lector = new Scanner(System.in);
        String cad = lector.nextLine();
        char vector [] = cad.toArray();
        OrdenaAsc(vector.length());
        
    }
    
    public void OrdenaAsc (vector.length())
    {
        if (vector.length()!=1)
        {
            int pos = BuscaMay(vector.length()-2, vector[vector.length()-1]);
            if (pos == vector.length()-1)
            {
                res=OrdenaAsc(vector.length()-2);
            }
            else
            {
                if (pos == vector[0])
                {
                    System.out.println(vector[0]);
                    volcar(0, vector.length()-1);
                    res= OrdenaAsc(vector.length()-1);
                }
                else
                {
                    System.out.println(vector[pos]);
                    volcar(0, pos);
                    res = OrdenaAsc(vector.length()-1);
                }
            }   
            return res;
            System.out.println("Los num ordenados son: ");
            MostrarVector(vector.length()-1);
        }
    }
    public MostrarVector(vector.length())
    {
        if(vector.length()-1!=0)
        {
                System.out.println(vector[vector.length()-1]);
                res = MostrarVector(vector.length()-2);
        }
    }
    
    public BuscaMay(int a, int b, int c)
    {
        if(a!=0)
        {
            if (b>vector[a-1])
                res=BuscaMay(a-1,b,c);
            else
                res=BuscaMay((a-1), vector[a-1], (a-1));
            return res;
        }
        return c;
    }
    
    public volvar (int x, int y)
    {
        int aux;
        if(y>x)
        {
            aux=vector[x];
            vector[x]=vector[y];
            vector[y]=vector[aux];
            res=volcar ((x+1),(y-1));
        }
        return vector[];
        
    }
}