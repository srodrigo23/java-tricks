
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.nio.Buffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 15 L 10 R 5 R 20 L 40 L 15 L 20 R 15 L 40 L 20 X
 20 L 20 L 10 R 40 L 10 L 60 X
 * @author admin
 */
public class Main {

    public static void main(String[] arg) throws IOException {
        new Main().solve();
    }
    ArrayList<ArrayList<Integer>> g;
    HashMap<Integer, Character> est;
    HashMap<Integer, Integer> cp;

    public void solve() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = 1;
        String l;
        char state;
        int id, idp, i;
        int x, z, r, w;
        String exe;
        boolean end;
        String ru, zo, wa;

        ArrayDeque<Integer> q;
        for (String line; !(line = in.readLine()).equals("0"); t++) {
            g = new ArrayList<ArrayList<Integer>>();
            est = new HashMap<Integer, Character>();
            cp = new HashMap<Integer, Integer>();
            l = line;
            ru = zo = wa = "";
            g.add(new ArrayList<Integer>());
            est.put(0, 'r');
            x = z = r = w = 0;
            end = false;
            while (!l.equals("0")) {
                st = new StringTokenizer(l);
                id = Integer.parseInt(st.nextToken()) - 1;
                exe = st.nextToken();
                if (!end) {
                    if (exe.equals("fork")) {
                        x++;
                        g.get(id).add(x);
                        est.put(x, 'r');
                    }
                    if (exe.equals("wait")) {
                        est.put(id, 'w');
                    }
                    if (exe.equals("exit")) {
                        if (id == 0) {
                            end = true;
                        } else {
                            idp = cp.get(id);
                            state = est.get(idp);
                            if (state == 'w') {
                                est.put(id, 'e');
                                est.put(idp, 'r');
                            }
                            if (state == 'z') {
                                est.put(id, 'e');
                            }
                            if (state == 'r') {
                                est.put(id, 'z');
                            }
                        }
                    }
                }
                l = in.readLine();
            }
            System.out.println("Case " + t+": ");
            if (end) {
                System.out.println("   No processes.");
            } else {
                q = new ArrayDeque<Integer>();
                q.add(0);
                int u, v;
                while (!q.isEmpty()) {
                    u = q.poll();
                    state = est.get(u);
                    if (state == 'e') {
                    } else {
                        if (state == 'r') {
                            if (ru.equals("")) {
                                ru += u;
                            }
                            else
                            {
                                ru += ", "+u;
                            }
                            r++;
                        }
                        if (state == 'w') {
                            w++;
                            if (wa.equals("")) {
                                wa += u;
                            }
                            else
                            {
                                wa += ", "+u;
                            }
                        }
                        if (state == 'z') {
                            z++;
                            if (zo.equals("")) {
                                zo += u;
                            }
                            else
                            {
                                zo += ", "+u;
                            }
                        }
                        for (i = 0; i < g.get(u).size(); i++) {
                            q.add(g.get(u).get(i));
                        }

                    }
                }
            }
        }
    }

}





import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class o {
    public static void main(String[]arg) throws IOException
    {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BigInteger k,p,c,mid;
        String num;
        int n,i,t=1;
        
        for(String line;!(line = in.readLine()).equals("0");t++)
        {
            n = Integer.parseInt(line);
            num = in.readLine();
            p = new BigInteger(num);
            c = new BigInteger("2");
            BigInteger a = new BigInteger("0");
            BigInteger b = new BigInteger(num);
            while(b.subtract(a).compareTo(BigInteger.ONE) > 0)
            {
                mid = b.add(a).divide(c);
                if(mid.pow(n).compareTo(p) < 0)
                {
                    a = new BigInteger(mid.toString());
                }
                else
                    b = new BigInteger(mid.toString());
            }
            System.out.print("Case "+t+": ");
            if(b.pow(n).compareTo(p) == 0)
                System.out.println(b);
            else
                System.out.println("No solution");
            System.out.println();
        }
            
    }
}

