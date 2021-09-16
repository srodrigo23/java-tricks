public class EjCadena
{
	private String c;
	public EjCadena(String cadena)
	{
		c= cadena;
	}
    //1. Recursividad1.- a) La cantidad de veces que aparece un carácter x en la cadena c. 
	public int cantChar(char x){
	    return cantChar(x,0);
	   }
    private int cantChar(char x, int p){
        int r;
        if(p==c.length())
        r=0;
        else
            if(c.charAt(p)==x)
            r=1+cantChar(x,p+1);
            else
            r=cantChar(x,p+1);
        return r;
    }
    //1. Recursividad1.- b) Generar una cadena c1 equivalente a la cadena c, pero invertida. 
    public String invertir(){
        return invertir(0);
    }
    private String invertir(int p){
        String r;
        if(p== c.length())
        r="";
        else
        r=invertir(p+1)+c.charAt(p);
        return r;
    }
    //1. Recursividad1.- c) la cantidad de vocales que tiene c. 
    public int cantVocales(){
        return cantChar('a')+cantChar('e')+cantChar('i')+cantChar('o')+cantChar('u');
    }
    //4. Recursividad1.- permite saber si una palabra es palíndroma 
    public boolean palindroma(){
        return c.equals(invertir());
    }
    //9. Recursividad1.- inverso de una Secuencia de caracteres sin sus repeticiones consecutivas.
    public String invRed(){
        return invRed(c.length()-1);
    }
    private String invRed(int p){
        String r=""+c.charAt(p);
        if(p==0)
        r+="";
        else
           if(c.charAt(p)==c.charAt(p-1))
              r=invRed(p-1);
           else
              r=c.charAt(p)+invRed(p-1);
        return r;
    }
    //10. Recursividad1.- define si una cadena dada es de la forma anbn.
    public boolean nAsnBs(){
        return (invRed().equals("ba"));
    }
    //12. Recursividad1.- a)Dadas dos cadenas c1 y c2 devuelve true si  c1 es prefijo de c2. 
    public boolean c1PrefijoC2(String c1,String c2){
        return pref(c1,c2,0,true);
    }
    private boolean pref(String c1,String c2,int p, boolean v){
        boolean r=v;
        if(p!=c1.length() && r==true){
            if(c1.charAt(p)!=c2.charAt(p))
            r=false;
            r=pref(c1,c2,p+1,r);
        }
        return r;
    }
    //12. Recursividad1.- b)Dadas dos cadenas c1 y c2 devuelve true si  c1 es sufijo de c2. 
    public boolean c1SubfijoC2(String c1, String c2){
        return suf(c1,c2,c1.length()-1,c2.length()-1, true);
    }
    private boolean suf(String c1, String c2,int p1, int p2, boolean v){
        boolean r=v;
        if(p1!=-1 && r==true){
            if(c1.charAt(p1)!=c2.charAt(p2))
            r=false;
            r=suf(c1,c2,p1-1,p2-1,r);
        }
        return r;
    }
    
}
