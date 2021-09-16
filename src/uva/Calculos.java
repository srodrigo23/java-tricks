
/**
 * Write a description of class Calculos here.
 * @author (Terceros Córdova Viviana) 
 * @version (30/10/2006)
 */
public class Calculos{

	/**
	 * Constructor for objects of class Calculos
	 */
	   public Calculos(){	
	    }
	//1. Recursividad potencia de un número. a elevado a la b.
	public double potencial(double a, int b){
	    double r;
	    if(b==0)
	    r=1;
	    else
	    r=a*potencial(a,b-1);
	    return r;
	   }
	//2. Recursividad método q te indica si un número natural n es primo o no.
	public boolean primo(int n){
	    boolean r=true;
	       if(cantDiv(n,n)>2)
	       r=false;
	    return r;
	   }
	private int cantDiv(int n, int d){
	    int r=0;
	       if((n==1)||(d==1))
	       r=1;
	       else
	          if(n%d==0)
	          r=1+cantDiv(n,d-1);
	          else
	          r=cantDiv(n,d-1);
	    return r;  
	   }
	//3. Recursividad método que permite calcular la cantidad de dígitos de un número positivo n
	public int cantN(int n){
	    int r;
	       if(n==0)
	       r=0;
	       else
	       r=1+ cantN(n/10);
	    return r;
	   }
	//4. Recursividad método que muestra los factores primos de un número n.
	public void divPrimos(int n){
	    System.out.println(divPrimos(n,n));
	   }
	private String divPrimos(int n, int d){
	    String r;
	       if((n==1)||(d==1))
	       r="1";
	       else
	          if((n%d==0)&& primo(d))
	          r=divPrimos(n,d-1)+","+d;
	          else
	          r=divPrimos(n,d-1);
	    return r;  
	   }
	//14. Recursividad.- método que permite saber si todos los dígitos de un numero n, son pares.
	public boolean digNPares(int n){
	    boolean r=false;
	       if(cantNPares(n)==cantN(n))
	       r=true;
	    return r;
	   }
	private int cantNPares(int n){
	    int r;
	      if(n<10)
	         if(n%2==0)
	         r=1;
	         else
	         r=0;
	      else
	         if(((n%10)%2)==0)
	         r=1+cantNPares(n/10);
	         else
	         r=cantNPares(n/10);
	    return r;
	   }
	//15. Recursividad.- método que te indica si un número natural n es divisible entre 11. 

	public boolean divisorDe11(int n){
	    boolean r=false;
	       if(sumDiv11(n,0)%11==0)
	       r=true;
	    return r;
	   }
	private int sumDiv11(int n, int p){
	    int r;
	      if(n<10)
	         if(p%2==0)
	          r=n;
	         else
	          r=-n;
	      else
	         if((p%2)==0)
	          r=(n%10)+sumDiv11(n/10,p+1);
	         else
	          r=-(n%10)+sumDiv11(n/10,p+1);
	    return r;
	   }
	//16. Recursividad.- un número n explota en varios fragmentos mas chicos que el, dada una bomba b. 
	public void bomb(int n, int b){
        if(n>b){
            System.out.print(n/b+",");
            bomb(n-n/b,b);
            bomb(n/b,b);
        }
       }
    //2. Recursividad1.-numero promedio de n, suma de sus dígitos pares y menos sus dígitos impares. 
    public int numProm(int n){
       return sumDiv11(n, 0);
        }
    //5. Recursividad1.- suma de los primeros n números pares que no son múltiplos de 4.
    public int sumNMultp4(int n){
        return sumNMultp4(0,2,n);
    }
    private int sumNMultp4(int n, int num, int p){
        int s;
        if(p==n)
        s=0;
        else
           if(num%4!=0)
           s=num+sumNMultp4(n+1,num+2,p);
           else
           s=sumNMultp4(n,num+2,p);
        return s;
    }
    //6. Recursividad1.- muestra una media pirámide de dígitos.
    public void mediaPiramide(){
        mediaPiramide(1, "");
    }
    private void mediaPiramide(int p,String cadena ){
        if(p<10){
            cadena=p+cadena;
            System.out.println(cadena);
            mediaPiramide(p+1,cadena);
        }
    }
    //7. Recursividad1.-Se define si un número conste de dígitos incrementales
    public boolean numDigIncrementales(int n){
        return numDigIncrementales(n,true);
    }
    private boolean numDigIncrementales(int n, boolean b){
        boolean r=b;
        if(n>10 && b==true){
            if(n%10<((n/10)%10))
            b=false;
            r=numDigIncrementales(n/10,b);
        }
        return r;
    }
    //8. Recursividad1.- Se define si un número conste de dígitos decrementales
    public boolean numDigDecrementales(int n){
        return numDigDecrementales(n,true);
    }
    private boolean numDigDecrementales(int n, boolean b){
        boolean r=b;
        if(n>10 && b==true){
            if(n%10>((n/10)%10))
            b=false;
            r=numDigDecrementales(n/10,b);
        }
        return r;
    }
    //13. Recursividad1.- devuelve si un nº positivo n es par, si su predecesor es impar.
    public boolean par(int n){
        return !(par(n,0,true));
    }
    private boolean par(int n, int p, boolean v){
        boolean r = v;
        if(p<n){
            if(p%2!=0)
            r=false;
            r=par(n,p+1,r);
        }
        return r;
    }
    //14. Recursividad1.-Dado n, determina cuantos dígitos pares ocupan posiciones impares .
    public int cantNparPosImp(int n){
        int c=0;
        if(n>10){
            if(((n%100)/10)%2==0)
            c=1+cantNparPosImp(n/100);
            else
            c=cantNparPosImp(n/100);
        }
        return c;
    }
    //15. Recursividad1.-Dado un monto en pesos m, imprime la cantidad de billetes y monedas q necesita
    public void cantBilletesYMonedas(double m){
        int b100=cantD(m,100);
        int b50=cantD(m-b100*100,50);
        int b20=cantD(m-(b100*100+b50*50),20);
        int b10=cantD(m-(b100*100+b50*50+b20*20),10);
        int b5=cantD(m-(b100*100+b50*50+b20*20+b10*10),5);
        int b2=cantD(m-(b100*100+b50*50+b20*20+b10*10+b5*5),2);
        m=m-(b100*100+b50*50+b20*20+b10*10+b5*5+b2*2);
        int m1=cantD(m,1);
        int m05=cantD(m-m1,0.5);
        int m025=cantD(m-(m1+m05*0.5),0.25);
        int m01=cantD(m-(m1+m05*0.5+m025*0.25),0.1);
        int m005=cantD(m-(m1+m05*0.5+m025*0.25+m01*0.1),0.05);
        int m001=cantD(m-(m1+m05*0.5+m025*0.25+m01*0.1+m005*0.05),0.01);
        System.out.println("La cantidad de billetes de 100:"+b100);
        System.out.println("La cantidad de billetes de 50:"+b50);
        System.out.println("La cantidad de billetes de 20:"+b20);
        System.out.println("La cantidad de billetes de 10:"+b10);
        System.out.println("La cantidad de billetes de 5:"+b5);
        System.out.println("La cantidad de billetes de 2:"+b2);
        System.out.println("La cantidad de monedas de 1:"+m1);
        System.out.println("La cantidad de monedas de 0.5:"+m05);
        System.out.println("La cantidad de monedas de 0.25:"+m025);
        System.out.println("La cantidad de monedas de 0.1:"+m01);
        System.out.println("La cantidad de monedas de 0.05:"+m005);
        System.out.println("La cantidad de monedas de 0.01:"+m001);
    }
    private int cantD(double n, double d){
        int c=0;
        if(n>d)
        c=1+cantD(n-d,d);
        return c;
    }
}
