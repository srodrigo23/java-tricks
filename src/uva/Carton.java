// JUEGO DEL BINGO
import java.io.*;
public class Carton
{ int ii=-1, ac=0;
  int c[] = new int[15];

 // llena el carton
 public void llena()
 { while (ii < 14)
     { int num = 1 + (int) (Math.random()*90);
       int b=0;
       for (int k=0; k<=ii; k++) // ver si ya existe este numero
         if (num==c[k])
           b=1;
       if (b==0)
         {ii++; c[ii]=num;}
     }
 }

 // verifica el carton
 public int verifica(int x)
 { for (int k=0; k<15; k++)
     { if (x==c[k])	// VER SI x ESTA EN ESTE CARTON
         ac++;		// SI ESTA SE INCREMENTA SU CONTADOR DE ACIERTOS
     }
   if (ac==15)		// SI SU CONTADOR DE ACIERTOS ES 15, YA HAY GANADOR
       return 1;	// INDICA QUE YA HAY UN GANADOR
     else
       return 0;	// INDICA QUE AUN NO HAY GANADOR
 }
 
 // muestra el carton
 public void ver_carton()
 { for (int k=0; k<15; k++)
     { System.out.print(c[k] + "   ");
       if ((k+1)%5==0)
         System.out.println("");
     }
 }

 // ordena las cartas
 public void ordena()
 { int aux=0;
   for (int i=0; i<14; i++)
     for (int j=i+1; j<=14; j++)
       if (c[i]>c[j])
         {aux=c[i]; c[i]=c[j]; c[j]=aux;}
 }

 public static void main(String arg[])
 { int u;
   int m[] = new int[90];
   String names[] = {"Lin","Tere","Hernan","Raul","Dany"};
   for (int k=0; k<90; k++)
     m[k]=0;
     
   Carton [] bingo = new Carton [15];
   for (int q=0; q<15; q++)
     bingo[q] = new Carton();

	// GENERA LOS CARTONES PARA INICIAR UN JUEGO
   System.out.println("Las cartones son :");
   for (u=0; u<5; u++)
     { System.out.println("El carton " + u + " de " + names[u] + " es : ");
       bingo[u].llena();
       System.out.println("-------------------------");
       bingo[u].ordena();
       bingo[u].ver_carton();
       System.out.println("-------------------------");
     }
   int cont=0, ind=0, bb=0, rep, num;
   // EFECTUARA EL JUEGO MISMO DEL BINGO
   while (bb==0)
     { num = 1 + (int) (Math.random()*90); // SE GENERA UN NUMERO
       rep=0;
       if ( m[num-1]!=1)	// VERIFICAMOS SI NO SE ESTA REPITIENDO
           { m[num-1]=1;
             cont++;
             System.out.print(num+"-");
             for (u=0; u<5; u++)
               { bb=bingo[u].verifica(num);// VERIFICAMOS EN CADA CARTON
                 if (bb==1)
                   { ind=u; u=5;
                     System.out.println("BINGO !!!  BINGO !!!");
                   }
               }
           }
     }
   System.out.println("Ganador "+names[ind]+" en "+cont+" Jugadas");
 }
}
