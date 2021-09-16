class Conversion_de_Bases
{
    public static void main (String[]args)
    {
         System.out.print("Ingrese el numero a convertir: ");
         int n = LeerTeclado.readInt();
         System.out.println(n);
         System.out.print("Ingrese la base: ");
         int b = LeerTeclado.readInt();
         System.out.println(b);
         int nn=0,c=0, d;
         while(n!=0)
         {
             d=n%b; nn+=d*(Math.pow(10,c));
             c++; n/=b;
         }
         System.out.println("El numero convertido a la base "+b+" es "+nn);



    }
}