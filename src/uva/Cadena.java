/*********** 	<Cadena.java>
 * concatenar, reemplazar una letra por otra, convertir a mayusculas,
 * convertir a minusculas, quitar espacios, aumentar algo (por ejm. un "-")
 */
class Cadena
{
 public static void main(String a[])
 {
   String s1=new String("abuelita"),
          s2=new String("BUENAS NOCHES"),
          s3=new String("    sin espacios    "),
          s4=new String(),
          s5=new String();
   
   System.out.println("s1=" + s1);
   System.out.println("s2=" + s2);
   System.out.println("s3=" + s3);
   System.out.println("reemplazo de a x A en s1 -> " + s1.replace('a','A'));
   System.out.println("mayuscula de s1 -> " + s1.toUpperCase());
   System.out.println("minuscula de s2 -> " + s2.toLowerCase());
   System.out.println("sin espacios en s3 -> " + s3.trim() + ".");
   System.out.println("concatena s2 a s1 -> " + s1.concat(s2));
   s4=s1.concat("-");  // el guion
   s4=s4.concat(s2);
   s5=s2.concat(" ");  // un espacio
   s5=s5.concat(s1);
   System.out.println("s4: " + s4);
   System.out.println("s5: " + s5);
   }
}

/*****************		<Cadena01.java>
 * Concatenar cadenas, invertir cadenas y mostrar letra por letra 
 */
class Cadena01
{
 public static void main(String a[])
 {
   String s1=new String("cadena");
   String s5=new String();
   String s6=new String();
   String s7=new String();

   System.out.println("s1=" + s1);
   // invertir caso1
   int l=s1.length();
   for (int k=l-1 ; k>=0 ; k--)
    { System.out.println(s1.charAt(k)); // muestra letra por letra
      s5=s5.concat(String.valueOf(s1.charAt(k))); // concatena la letra
    }
   System.out.println("s5=" + s5);      // muestra la cadena invertida

   //invertir caso2
   for (int k=l-1 ; k>=0 ; k--)
     {s6=s5.substring(k,k+1);           // obtiene una letra
      s7=s7.concat(s6);                 // concatena la letra
      System.out.println(s6);           //muestra letra por letra
     } 
   System.out.println("s7=" + s7);

   // deletrea
   for (int k=0 ; k<l ; k++)
     {s6=s7.substring(k,k+1);           // obtiene una letra
      System.out.println(s6);           //muestra letra por letra
     }     
   }
}

/**************	<Cadena02.java>
 * buscando una letra o varias letras
 */

class Cadena02
{public static void main(String a[])
 {
   String s1=new String("cadena");
   String s6=new String();
   char mat[] = {'c','d','n'};  // letras a buscar
   int cont1=0, cont2=0;

   System.out.println("s1=" + s1);
   for (int k=0 ; k<s1.length() ; k++)
     {  s6=s1.substring(k,k+1);    // obtiene una letra de s1
        if ( s6.equals("a") )      // si la letra es una "a" la cuenta
            cont1++;
     }
   System.out.println("hay " + cont1 + " a" + " en " + s1);
   System.out.println("");

   for (int k=0 ; k<s1.length() ; k++)
     {  s6=s1.substring(k,k+1);           // obtiene una letra de s1
        for (int j=0; j<3; j++)
           if ( s6.equals(String.valueOf(mat[j])) ) // si esta en el arreglo
              cont2++;
     }
   System.out.println("hay " + cont2 + " letras iguales a [c/d/n]");     
   }
}


/*++++++++++++++++	<Cadena03.java>
 + buscando una subcadena y buscando vocales
 */
class Cadena03
{
 public static void main(String a[])
 {
   String s1=new String("cadena");
   String s6=new String();

   char mat[] = {'a','e','i','o','u'}; //lista de vocales a buscar

   System.out.println("s1=" + s1);
   int cont1=0,cont2=0;

   for (int k=0 ; k<s1.length()-1 ; k++)
     {  s6=s1.substring(k,k+2);           // obtiene una subcadena
        if ( s6.equals("ad") )             // si la letra es una 'ad'
            cont1 ++;
     }
   System.out.println("hay " + cont1 + " ad");
   System.out.println("");

   for (int k=0 ; k<s1.length() ; k++)
     {  s6=s1.substring(k,k+1);           // obtiene una letra
        for (int j=0; j<5; j++)
           if ( s6.equals(String.valueOf(mat[j])) ) // si esta en el arreglo
              cont2 ++;
     }
   System.out.println("hay " + cont2 + " vocales" + " en " + s1);
   }
}
