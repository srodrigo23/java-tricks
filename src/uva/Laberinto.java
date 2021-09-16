/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package marzo19recursividad;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase tiene como parametro principal una matriz, y un método que se encarga
 * de buscar en la matriz si existe un camino entre dos puntos, la matriz guarda chars
 */
public class Laberinto {
    private char[][]        laberinto;
    private List<Posicion>  camino = new ArrayList<Posicion>();
    /**
     * Contructor de Laberinto
     * @param x
     * @param y
     */
    public Laberinto(int x, int y)
    {
        laberinto = new char[x][y];
    }
    
    /**
     * Este método se encarga de llenar la matriz que representa el laberinto
     */
    public void llenar(){

    }

    public boolean buscarSalida(Posicion inicio, Posicion fin)
    {
        boolean ret = false;
        
        camino.clear();
        if((validarPos(inicio))&&(validarPos(fin)))
        {
            inicio.setControl(true);
            fin.setControl(true);
            
            buscar(fin, inicio,inicio);
            camino.add(inicio);
        }
        return ret;
    }
    
    private boolean buscar(Posicion fin, Posicion actual, Posicion ant){
    
        boolean ret = false;
        
        Posicion[] siguiente = new Posicion[4];
        
        if(fin.equals(actual)){
            
            actual.setControl(true);
            camino.add(actual);
            ret = true;
            
        } else {
            
            siguiente[0] = new Posicion(actual.getX(), actual.getY()-1);
            siguiente[1] = new Posicion(actual.getX()+1, actual.getY());
            siguiente[2] = new Posicion(actual.getX(), actual.getY()+1);
            siguiente[3] = new Posicion(actual.getX()-1, actual.getY());

            for(int i = 0; i <4;i++){

                if(!siguiente[i].equals(ant)){
                    if(validarPos(siguiente[i])){
                        ret = buscar(fin, siguiente[i],actual);
                        if(ret)
                        {
                            i = 5;
                        }
                    }
                }
            }

        }
        return ret;
    }
    
    /**
     * Verifica si una posicion existe en la matriz laberinto
     * @param pos
     * @return
     */
    
    private boolean validarPos(Posicion pos){
        boolean ret = false;
        if((pos.getX()>=0)&&(pos.getX()<laberinto.length)){
            if((pos.getY()>=0)&&(pos.getY()<laberinto[0].length)){
                ret = true;
            }
        }
        return ret;
    }

}
