import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
* Status : ACEPTED
* UVa
*
*/

public class P 
{
    
    static Reader in = new Reader(System.in);
    static Writer out = new Writer(System.out);

    static int N, B, bd, ba, vb;
    static int[]reg;

    static String ans;
    public static void main(String[] args) throws IOException 
    {
        while(true)
        {
            B = in.nextInt();
            N = in.nextInt();

            ans = "S";

            if(B==0 & N==0) break;

            reg = in.nextIntArray(B);

            for (int i = 0; i < N; i++) 
            {
                bd = in.nextInt();
                ba = in.nextInt();
                vb = in.nextInt();
                
                reg[ba-1] = reg[ba-1] + vb;
                reg[bd-1] = reg[bd-1] - vb;
            }

            for (int i = 0;i < B ; i++) 
            {
                if(reg[i] < 0)  ans="N";   
            }

            out.println(ans);
        }
        out.flush();
        out.close();
    }

    static class Reader implements Closeable {
            
        private final BufferedReader reader;
        private StringTokenizer tokenizer;
        
        public Reader(InputStream input) {
            reader = new BufferedReader(
                                        new InputStreamReader(input));
            tokenizer = new StringTokenizer("");
        }
        
        private StringTokenizer getTokenizer() throws IOException {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                String line = nextLine();
                if (line == null) {
                    return null;
                }
                tokenizer = new StringTokenizer(line);
            }
            return tokenizer;
        }
        
        public boolean hasNext() throws IOException {
            return getTokenizer() != null;
        }
        
        public String next() throws IOException {
            return hasNext() ? tokenizer.nextToken() : null;
        }
        
        public String nextLine() throws IOException {
            tokenizer = null;
            return reader.readLine();
        }
        
        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
        
        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }
        
        public float nextFloat() throws IOException {
            return Float.parseFloat(next());
        }
        
        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
        
        public String[] nextStringArray(int size) throws IOException {
            String[] array = new String[size];
            for (int i = 0; i < size; i++) {
                array[i] = next();
            }
            return array;
        }
        
        public int[] nextIntArray(int size) throws IOException {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = nextInt();
            }
            return array;
        }
        
        public long[] nextLongArray(int size) throws IOException {
            long[] array = new long[size];
            for (int i = 0; i < size; i++) {
                array[i] = nextLong();
            }
            return array;
        }
        
        public double[] nextDoubleArray(int size) throws IOException {
            double[] array = new double[size];
            for (int i = 0; i < size; i++) {
                array[i] = nextDouble();
            }
            return array;
        }
        
        @Override
        public void close() throws IOException {
            tokenizer = null;
            reader.close();
        }
    }
        
    static class Writer {
        
        private final PrintWriter writer;
        
        public Writer(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }
        
        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }
        
        public void println(Object... objects) {
            print(objects);
            writer.println();
        }
        
        public void close() {
            writer.close();
        }
        
        public void flush() {
            writer.flush();
        }
        
    }
}