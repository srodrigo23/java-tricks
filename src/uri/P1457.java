import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1457 {
    //https://www.urionlinejudge.com.br/judge/es/problems/view/1457
    //status:
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        int v = Integer.parseInt(in.readLine());
        int num[], j, subs;
        long ans;
        for (int i = 0; i < v; i++) {
            num = identifyNK(in.readLine());
            j=1;
            ans=num[0];
            while((subs = num[0]-(j*num[1]))>1){
                ans=ans*subs;
                j++;
            }
            System.out.println(ans);
        }
    }

    private static int[] identifyNK(String l) {
        int ans[] = new int[2];
        int pos=-1;
        for (int i = 0; i < l.length(); i++) {
            if(l.charAt(i)=='!'){
                pos = i;
                break;
            }
        }
        ans[0] = Integer.parseInt(l.substring(0, pos));
        ans[1] = l.substring(pos).length();
        return ans;
    }
}
