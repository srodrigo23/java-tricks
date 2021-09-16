//ordenamiento con sub-programas
import java.io.*;
class Vector2
{
 // sub-programa que inicializa el arreglo
 static void inicia(int p[],int l)
 { for (int i=0; i<l; i++)
       p[i]=0;
 }

 // sub-programa que muestra el arreglo
 static void muestra(int u[], int l)
 { for (int i=0; i<l ; i++)
       System.out.print(u[i] + " ");
   System.out.println("");
 }

 // sub-programa que ordena el arreglo
 static void ordena(int z[], int l)
 { int i,j,aux;
   for (i=0; i<l-1 ; i++)
     {  for (j=i+1; j<l; j++)
          if (z[i] > z[j])
             {  aux  = z[i];
                z[i] = z[j];
                z[j] = aux;    }
     }
  }

 // sub-programa que carga el arreglo
 static void leeArreglo(int z[], int l)
 { DataInputStream num = new DataInputStream( System.in );
   int n;
   try{
        for (int i=0; i<l ; i++)
          {     System.out.print("           numero " + i + " > ");
                String cad = num.readLine();
                n = Integer.parseInt(cad);
                z[i] = n;
           }
      }
   catch (IOException e)
         { System.out.println("existe un error de lectura ... ");}
 }
 
 // Programa principal
 public static void main(String a[])
 { int lim=10;
   int z[] = new int [100];

   inicia(z,lim);     // invoca al sub-programa que inicializa el arreglo

   System.out.println("");
   System.out.print("El arreglo inicializado es: ");
   muestra(z,lim);    // invoca al sub-programa que muestra el arreglo

   System.out.println("");
   System.out.println("Digite los elementos del arreglo: ");
   System.out.println("----------------------------------");
   leeArreglo(z,lim); // invoca al sub-programa que carga el arreglo
   System.out.println("----------------------------------");

   System.out.println("");
   System.out.print("El arreglo leido es:    ");
   muestra(z,lim);

   ordena(z,lim);     // invoca al sub-programa que ordena el arreglo
   System.out.println("");
   System.out.print("El arreglo ordenado es: ");
   muestra(z,lim);
 }
}
