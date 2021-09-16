class perfecto
{
    public static void main(String [] args)
    {
        System.out.println("Ingrese el numero a verificar: ");
        int n = LeerTeclado.readInt();
        System.out.println(n);
        int s=0;
        for (int i =1;i<=n/2; i++)
        {
            if (n%i == 0)
            s=s+i;
        }
        if (n==s)
            System.out.println("Es pefecto");
        else
            System.out.println("No es pefecto");
        
    }
  
}