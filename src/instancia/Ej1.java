package instancia;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej1 {

    public static int[]cantEnRango = new int[5]; //para las cantidades
    public static int[]sumEnRango = new int[5];
    public static ArrayList[]numeros = {new ArrayList(), new ArrayList(), new ArrayList(),
                       new ArrayList(), new ArrayList()};
    public static int n;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        n = sc.nextInt();// numero de numeros
        int num;
        for (int i = 0; i < n; i++) {
            num = leerNumero();
            cantEnRango[num-1/20]++;
            sumEnRango[num-1/20] += num;
            numeros[num-1/20].add(num);
        }
        mostrarPromedios();
        mostrarPromedioGeneral();
        mostrarMayorYMenor();
        mostrarHistograma();
    }

    private static void mostrarHistograma(){
        System.out.println("Histograma");
        System.out.println("Rango 1 : " + asteriscos(cantEnRango[0]));
        System.out.println("Rango 2 : " + asteriscos(cantEnRango[1]));
        System.out.println("Rango 3 : " + asteriscos(cantEnRango[2]));
        System.out.println("Rango 4 : " + asteriscos(cantEnRango[3]));
        System.out.println("Rango 5 : " + asteriscos(cantEnRango[4]));
    }

    private static String asteriscos(int cant){
        String ast = "";
        for (int i = 0; i < cant; i++) {
            ast = ast + "*";
        }
        return ast;
    }

    private static void mostrarMayorYMenor(){
        System.out.println("Mayor del Rango1 : " + mayor(numeros[0]) + "   Menor del Rango1 : " + menor(numeros[0]));
        System.out.println("Mayor del Rango2 : " + mayor(numeros[1]) + "   Menor del Rango2 : " + menor(numeros[1]));
        System.out.println("Mayor del Rango3 : " + mayor(numeros[2]) + "   Menor del Rango3 : " + menor(numeros[2]));
        System.out.println("Mayor del Rango4 : " + mayor(numeros[3]) + "   Menor del Rango4 : " + menor(numeros[3]));
        System.out.println("Mayor del Rango5 : " + mayor(numeros[4]) + "   Menor del Rango5 : " + menor(numeros[4]));
    }

    private static int mayor(ArrayList<Integer> nums){
        int may = nums.get(0);
        for (int i = 1; i < nums.size()-1; i++) {
            if(nums.get(i)>may) may = nums.get(i);
        }return may;
    }

    private static int menor(ArrayList<Integer> nums){
        int men = nums.get(0);
        for (int i = 1; i < nums.size()-1; i++) {
            if(nums.get(i)<men) men = nums.get(i);
        }return men;
    }

    private static void mostrarPromedioGeneral(){
        int sumaTotal = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j <numeros[i].size() ; j++) {
                sumaTotal =+ (int)numeros[i].get(j);
            }
        }
        System.out.println(sumaTotal/n);
    }

    private static void mostrarPromedios(){
        System.out.println("Rango 1:" + cantEnRango[0] + " Promedio del rango 1:" + sumEnRango[0]/cantEnRango[0]);
        System.out.println("Rango 2:" + cantEnRango[1] + " Promedio del rango 2:" + sumEnRango[1]/cantEnRango[1]);
        System.out.println("Rango 3:" + cantEnRango[2] + " Promedio del rango 3:" + sumEnRango[2]/cantEnRango[2]);
        System.out.println("Rango 4:" + cantEnRango[3] + " Promedio del rango 4:" + sumEnRango[3]/cantEnRango[3]);
        System.out.println("Rango 5:" + cantEnRango[4] + " Promedio del rango 5:" + sumEnRango[4]/cantEnRango[4]);
    }

    public static int leerNumero(){
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        boolean vb=false;
        while (!vb){
            ans = sc.nextInt();
            if(ans<0 || ans > 100) System.out.println("Ingrese un num entre 0 y 100");
            else vb = true;
        }
        return ans;
    }
}
