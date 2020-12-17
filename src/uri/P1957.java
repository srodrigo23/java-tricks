
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https:
 * PROBLEM: Inferior Area
 * STATUS: ACCEPTED
 */

public class P1957 {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int num = Integer.parseInt(in.readLine());
        System.out.printf("%s\n",convertToHexa(num));
    }

    private static String convertToHexa(int num) {
        String ans="";
        int res;
        while(num>0){
            res = num % 16;
            num = (int)(num / 16);
            if(res==10){
                ans='A'+ans;
            }else if(res==11){
                ans='B'+ans;
            }else if(res==12){
                ans='C'+ans;
            }else if(res==13){
                ans='D'+ans;
            }else if(res==14){
                ans='E'+ans;
            }else if(res==15){
                ans='F'+ans;
            }else
                ans=res+ans;
        }
        return ans;
    }
}
