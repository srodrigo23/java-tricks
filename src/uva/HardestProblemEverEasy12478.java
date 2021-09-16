
/**
 * Write a description of class HardestProblemEverEasy12478 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HardestProblemEverEasy12478
{
    public static void main(String args[]){
        char m[][]={{'O', 'B', 'I', 'D', 'A', 'I', 'B', 'K', 'R'},
                    {'R', 'K', 'A', 'U', 'L', 'H', 'I', 'S', 'P'},
                    {'S', 'A', 'D', 'I', 'Y', 'A', 'N', 'N', 'O'}, 
                    {'H', 'E', 'I', 'S', 'A', 'W', 'H', 'I', 'A'}, 
                    {'I', 'R', 'A', 'K', 'I', 'B', 'U', 'L', 'S'},
                    {'M', 'F', 'B', 'I', 'N', 'T', 'R', 'N', 'O'},
                    {'U', 'T', 'O', 'Y', 'Z', 'I', 'F', 'A', 'H'}, 
                    {'L', 'E', 'B', 'S', 'Y', 'N', 'U', 'N', 'E'}, 
                    {'E', 'M', 'O', 'T', 'I', 'O', 'N', 'A', 'L'}};
        String pal[]={"RAKIBUL", "ANINDYA", "MOSHIUR", "SHIPLU", 
            "KABIR", "SUNNY", "OBAIDA", "WASI"};
        int c;
        String cad;
        for(int i=0;i<pal.length;i++){
            cad=pal[i];
            c=buscarPalabra(cad, m);
            if(c==2)
                break;
        }
    }
    
    private static int buscarPalabra(String cad, char[][]m){
        char[]pal=cad.toCharArray();
        String c=new String(pal);
        for(int i=0; i<9; i++){
            for(int j=0; j<0; j++){
                
            }
        }
        
        return 0;
    }
}

