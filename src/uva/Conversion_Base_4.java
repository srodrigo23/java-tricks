class Conversion_Base_4
{
    public static void main (String []args)
    {
         System.out.print("Ingrese el numero a convertir: ");
         int n = LeerTeclado.readInt();
         System.out.println(n);
         int nn = 0, c = 0, d;
         while(n>0)
        {
            d = n%4; 
            nn += d * (Math.pow(10,c));
            c++;  
            n/=4;
        }
         System.out.println("El numero en base 4 es "+nn);
            

    }
}