import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2292 {
    /**
     * URL: https://www.urionlinejudge.com.br/judge/es/problems/view/2292
     * Name: Paneles LED
     * STATUS: TIME LIMIT EXCEED
     * @param args
     */

    /**
     *
     *
     *
     * int main() {
     *
     *     string lampadas;
     *     unsigned long long int n, c;
     *
     *     cin >> n;
     *
     *     while(n--){
     *         cin >> lampadas >> c;
     *
     *         for(int i = 0; i < lampadas.size() && c > 0; i++){
     *             if(c % 2 == 1){
     *                 if(lampadas[i] == 'X'){
     *                     lampadas[i] = 'O';
     *                 }else{
     *                     lampadas[i] = 'X';
     *                     c += 2;
     *                 }
     *             }
     *             c /= 2;
     *         }
     *
     *         cout << lampadas << endl;
     *     }
     *
     *
     *     return 0;
     * }
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        int v = Integer.parseInt(in.readLine());
        String[] line;
        boolean camb;
        for (int i = 0; i < v; i++) {
            line = in.readLine().split(" ");
            char [] arr = line[0].toCharArray();
            for (int j = 0; j < Integer.parseInt(line[1]); j++) {
                if(arr[0]=='X')arr[0]='O';else arr[0]='X';
                camb = true;
                for (int k = 1; k < arr.length; k++) {
                    if(camb){
                        if(arr[k-1]=='X'){
                            if(arr[k]=='X') arr[k]='O';
                            else arr[k]='X';
                            camb=true;
                        }else{
                            camb=false;
                        }
                    }
                }
            }
            printArray(arr);
        }
    }

    public static void printArray(char[] arr){
        String toPrint="";
        for (int i = 0; i < arr.length; i++) {
            toPrint=toPrint+arr[i];
        }
        System.out.println(toPrint);
    }
}
