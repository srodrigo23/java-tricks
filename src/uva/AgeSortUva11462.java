import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class AgeSortUva11462{
    public static void main(String args[])throws IOException{
        BufferedReader scan= new BufferedReader(new InputStreamReader(System.in));
        int n;
        n=Integer.parseInt(scan.readLine());
        StringBuffer sb=new StringBuffer();
        while(n!=0){
            String res="";
            int ages[]=new int[101];
            StringTokenizer line=new StringTokenizer(scan.readLine());
            for(int i=0; i<n; i++){
                ages[Integer.parseInt(line.nextToken())]++;
            }
            
            for(int a=1, j=0; a<100; a++){
                for(int i=0; i<ages[a];i++,j++){
                    sb.append(j>0?" ":"").append(a);
                }
            }
            sb.append("\n");
            n=Integer.parseInt(scan.readLine());
        }
        System.out.print(new String(sb));
    }
}
