/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package marzo19recursividad;

/**
 *
 * @author Familia
 */
public class Posicion {
    private int x;
    private int y;
    private boolean control;

    public Posicion(int x,int y){
        this.x = x;
        this.y = y;
        control = false;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public boolean getControl(){
        return control;
    }
    public void setControl(boolean valor){
        control = valor;
    }
    public boolean equals(Posicion p) {
        boolean ret = false;
        if((x == p.getX())&&(y == p.getY())){
            ret = true;
        }
        return ret;
    }
}
