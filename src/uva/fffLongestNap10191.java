
package srcCode.acm.uva;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * WA
 * @author SergioRodrigoCardenasRivera
 */

public class fffLongestNap10191 {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Comparator<Schedule> comp = new Comparator<Schedule>() {
            @Override
            public int compare(Schedule o1, Schedule o2) {
                return Integer.compare(o1.getValSum(), o2.getValSum());
            }
        };
        Comparator<Schedule> comp1 = new Comparator<Schedule>() {
            @Override
            public int compare(Schedule o1, Schedule o2) {
                return Integer.compare(o1.getValRes(), o2.getValRes());
            }
        };
        StringTokenizer stk;
        String ini, fin;
        int init, end, numSh, durNap;
        int numDay = 0;
        while (sc.hasNext()) {            
            numSh = Integer.parseInt(sc.nextLine());
            numDay++;
            LinkedList<Schedule> list = new LinkedList<>();
            LinkedList<Schedule> naps = new LinkedList<>();
            for (int i = 0; i < numSh; i++) {
                stk = new StringTokenizer(sc.nextLine(), " ");
                ini = stk.nextToken();
                fin = stk.nextToken();
                stk = new StringTokenizer(ini, ":");
                init = Integer.parseInt(stk.nextToken())*60;
                init += Integer.parseInt(stk.nextToken());
                stk = new StringTokenizer(fin, ":");
                end = Integer.parseInt(stk.nextToken())*60;
                end += Integer.parseInt(stk.nextToken());
                list.add(new Schedule(init, end));
            }
            Collections.sort(list, comp);
            int hora = 600;
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getIni() > hora){
                    naps.add(new Schedule(hora, list.get(i).getIni()));
                }
                hora = list.get(i).getFin();
            }
            if(list.getLast().getFin()<1080){
                naps.add(new Schedule(list.getLast().getFin(), 1080));
            }
            Collections.sort(naps, comp1);
            String res;
            Schedule sh = naps.getLast();
            String inicioNap = Integer.toString(sh.getHorasInicio());
            if(sh.getMinutosInicio()<10)
                inicioNap = inicioNap + ":0" + sh.getMinutosInicio();
            else
                inicioNap = inicioNap + ":" + sh.getMinutosInicio();
            durNap = sh.getValRes();
            String valLiteral;
            if(durNap/60 >= 1 && durNap%60>=0)
                valLiteral = durNap/60 + " " + "hours and " + durNap%60 + " minutes.";
            else
                valLiteral = durNap%60 + " minutes.";
            res = "Day #" + numDay + ": the longest nap starts at " + inicioNap +" and will last for " + valLiteral;
            System.out.println(res);
        }
    }
    static class Schedule{
        int ini, fin;
        public Schedule(int ini, int fin) {
            this.ini = ini;
            this.fin = fin;
        }
        public int getIni() {
            return ini;
        }
        public int getFin() {
            return fin;
        }
        public int getValSum(){
            return ini + fin;
        }
        public int getHorasInicio(){
            return (int)ini/60;
        }
        public int getMinutosInicio(){
            return ini%60;
        }
        public int getValRes(){
            return fin - ini;
        }
    }
}