//  
//  Manejo de threads
//  
//--------------------------------------------------------------------------

import java.awt.*;
import java.applet.*;
import java.lang.Math;
import java.util.Random;
import java.awt.event.*;
//import javax.swing.*;
//import javax.swing.event.*;

// Es un applet muy simple para demostrar el multithreading
// Crea círculos, corriendo cada uno en su propio thread
// que se irá agrandando y disminuyendo 
public class Figuras extends Applet {
    public int Ancho = 400;
    public int Alto = 100;
    public int Numero = 15;
    public final int minTam = 10;
    public final int maxTam = 50;
    public final int minNaptime = 1;
    public final int maxNaptime = 500;

    public final Color colores[] = {
        Color.red,
        Color.pink,
        Color.orange,
        Color.yellow,
        Color.green,
        Color.magenta,
        Color.blue,
        Color.cyan,
        Color.white,
        Color.gray,
        Color.lightGray,
        Color.darkGray
        };

    public final Color bg = Color.black;
    boolean thSuspendida = false;
    Image im;
    Graphics offscreen;
    Random rand;
    Circulo circulos[] = new Circulo[Numero];
        

    public void init() {
        resize( Ancho,Alto );
        rand = new Random( (long)System.currentTimeMillis() );
        try {
            im = createImage( Ancho,Alto );
            offscreen = im.getGraphics();
        } catch( Exception e ) {
            offscreen = null;
            }
        }


    // Se crea cada figura con algunos parámetros aleatorios y
    // se inicia su thread
    public void start() {
        for( int i=0; i < Numero; i++ ) 
            {
            if( circulos[i] == null ) 
                {
                // Se crea un círculo
                circulos[i] = new Circulo( this,
                    (int)( (double)Ancho * rand.nextDouble() ),
                    (int)((double)Alto * rand.nextDouble() ),
                    minTam + 
                    (int)( (double)(maxTam-minTam) * rand.nextDouble() ),
                    minNaptime + 
                    (int)( (double)(maxNaptime-minNaptime) * rand.nextDouble() ),
                    colores[(int)( (double)colores.length * rand.nextDouble() )],
                    bg );
                circulos[i].start(); // Se inicia el thread
                }
            }
        repaint();
        }


    // Al parar el applet, se paran todos los threads
    public void stop() {
        for( int i=0; i < Numero; i++ ) 
            circulos[i].stop();
        }
        

    // Maneja la actualización de la pantalla
    public void update( Graphics g ) {
        paint( g );
        }
        

    // Actualización de la pantalla
    public void paint( Graphics g ) {
        if( offscreen != null ) 
            {
            paintApplet( offscreen );
            g.drawImage( im,0,0,this );
            } 
        else
            paintApplet( g );
        }

        
    // Se usa el método paint de cada una de las figuras
    public void paintApplet( Graphics g ) {
        g.setColor( bg );
        g.fillRect( 0,0,Ancho,Alto );
        for( int i=0; i < Numero; i++ ) 
            circulos[i].paint( g ); //Redibuja el círculo
        }
    

    // El control del thread se realia con las teclas del mouse
    public boolean mouseDown( Event evt,int x,int y ) {
        if( thSuspendida ) 
            {
            for( int i=0; i < Numero; i++ )
                circulos[i].thread.resume(); // Se reinicia el proceso
            } 
        else 
            {
            for( int i=0; i < Numero; i++ )
                circulos[i].thread.suspend(); // Se suspende el proceso del hilo
            }
        thSuspendida = !thSuspendida;

        return( true );
        }
        
    public static void main( String args[] ) {
      Figuras applet = new Figuras();
      applet.init();

      Frame f = new Frame("Ejemplo de Hilos");
      f.add(applet);
      f.pack();
      f.setVisible(true);

      f.addWindowListener(
                          new WindowAdapter()
                          {
                             public void windowClosed(WindowEvent e)
                             {
                                System.exit(0);
                             }
                             public void windowClosing(WindowEvent e)
                             {
                                windowClosed(e);
                             }
                          }
                          );
   	  }
    }                                 



// Se usa la INterface Runnable para implementar hilos
class Circulo implements Runnable {
    static int threadNum = 1;
    private Color color = null;
    private Color bg = Color.black;
    private int naptime = 500;
    private int tamano = 50;
    private int factorCrecer = 1;
    private int ox = 0;    /* posición dentro del frame */
    private int oy = 0;
    private Graphics graphics;
    private int actual;
    private int anterior;
    private boolean creciendo = false;
    public Thread thread = null;
    Figuras applet;

    public Circulo( Figuras applet,int x,int y,int s,int n,
        Color c,Color bg ) {
        this.applet = applet;
        ox = x;
        oy = y;
        tamano = s;
        naptime = n;
        color = c;
        if( color == null )
        color = Color.black;
        actual = anterior = s;
        }
        

    // COntrol del tamaño de las circunferencias
    public void run() {
        thread.setPriority( Thread.MIN_PRIORITY+1 );
        while( thread != null ) 
            {
            anterior = actual;
            if( creciendo )
                actual += factorCrecer;
            else
                actual -= factorCrecer;
        
            if( actual == tamano || actual == 0 ) 
                creciendo = !creciendo;
        
            try { 
                thread.sleep( naptime ); 
            } catch( InterruptedException e ) 
                {
                ;
                }
            applet.repaint();
            }
        thread = null;
        }
        

	// Al iniciar se crea el hilo
    public void start() {
        if( thread == null ) 
            {
            thread = new Thread( this,Integer.toString( threadNum++ ) );
            thread.start();
            }
        }
        

    public void stop() {
        thread = null;
        }
       

    // Se borra la antigua posición y se pinta la nueva
    public void paint( Graphics g ) {
        int antMedio = (int)( anterior/2 );
        int actMedio = (int)( actual/2 );

        g.setColor( bg );
        g.fillOval( ox-antMedio,oy-antMedio,anterior,anterior );
   
        g.setColor( color);
        g.fillOval( ox-actMedio,oy-actMedio,actual,actual );
        }
    }

