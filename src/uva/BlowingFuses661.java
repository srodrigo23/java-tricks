import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BlowingFuses661 {
    
    public static void main(String[] args) throws IOException
    {
        Lector.init(System.in);
        int N, M, C, cont;
        int vals[];
        cont=1;
        N=Lector.nextInt();
        M=Lector.nextInt();
        C=Lector.nextInt();
        while(N!=0 && M!=0 && C!=0){
            vals[]=new int[N];
            for (int i = 0; i < 10; i++) {
                
            }
        }
    }
    class Lector {
        static BufferedReader reader;
        static StringTokenizer tokenizer;
        
        static void init(InputStream input) {
            reader = new BufferedReader(
                                        new InputStreamReader(input) );
            tokenizer = new StringTokenizer("");
        }
        
        static String next() throws IOException {
            while ( ! tokenizer.hasMoreTokens() ) {
                //TODO add check for eof if necessary
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }
        
        static int nextInt() throws IOException {
            return Integer.parseInt( next() );
        }
        
        static double nextDouble() throws IOException {
            return Double.parseDouble( next() );
        }
    }
}
