import java.util.ArrayList;
/**
 *                  PRACTICA 2: PLANILLA DE NOTAS
 * 
 * @author Christian Gonzalo Perez Leyton
 * @version 7/10/2015
 */
public class PlanillaNotas
{
 private String[] alumnos;
 private int[] notas;
 ArrayList<String> lista;
 int z;
 int n;
 public PlanillaNotas(){
     alumnos = new String [10];
     notas = new int[10];
     lista = new ArrayList<String>();
     
     
}
public void RegistrarAlumno(String alumno){
    if(z < alumnos.length){
        alumnos[z] = alumno;
        z++;
    }
    }
public void RegistrarNotas(int nota){
if(n < notas.length && nota<=100 && nota>0){
    notas[n] = nota;
    n++;
}
}
public void MostrarAprobados(){
    for(int n=0; n<notas.length; n++){
        if(notas[n]>50){
            lista.add(alumnos[n]);
        }
    }
    System.out.println(lista);
}
public void MostrarReprovados(){
    for(int n=0; n<notas.length; n++){
        if(notas[n]<=50){
            lista.add(alumnos[n]);
        }
}
    System.out.println(lista);
}
public void MayorNota(){
    
    for(int i = 0; i<notas.length; i++){
        for(int j = 0; j<notas.length-1; j++){
            if(notas[i]>notas[j]){
                lista.add(alumnos[i]) ;
            }
            else{
                lista.add(alumnos[j]);
            }
        }
    }
    System.out.println(lista);
}
public void EncimaDelPromedio(int promedio){
    for(int n=0; n<notas.length; n++){
        if(notas[n]>promedio){
            lista.add(alumnos[n]);
        }
    }
    System.out.println(lista);
}
public int PromedioTotal(int promedio){
    ArrayList<String> aprovados;
    ArrayList<String> reprovados;
    int abandonos = 0;
    aprovados = new ArrayList<String>();
    reprovados = new ArrayList<String>();
    for(int i = 0; n<notas.length; n++){
         if(notas[i]>promedio){
             aprovados.add(alumnos[i]);
            }
            else{
                reprovados.add(alumnos[i]);
            }
            if(notas[i]==0){
                abandonos = abandonos+1;
            }
}
    System.out.println(aprovados);
    System.out.println(reprovados);
    return abandonos;
}
}
