import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

 class Main
{
    public static void main(String arg[]) throws IOException{
        Reader.init(System.in);        
        int t, n, u, l, r, val, q, index;
        t=Reader.nextInt();
        for(int i=0; i<t; i++){
            n=Reader.nextInt();
            u=Reader.nextInt();
            ArrayList<Integer>arr=new ArrayList<Integer>(n);
            //            int []arr=new int[n];
            for(int j=0; j<u; j++){
                l=Reader.nextInt();
                r=Reader.nextInt();
                val=Reader.nextInt();
                for(int k=l; k<=r; k++){
                    arr.set(k, arr.get(k)+val);
                }
            }
            q=Reader.nextInt();
            for(int m=0; m<q; m++){
                System.out.println(arr.get(Reader.nextInt()));
            }  
        }
    }
}

class Reader {
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


