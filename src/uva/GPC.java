/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpc;



import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class GPC extends JFrame {

    private int xT = 0;
    private int yT = 0;

    private int gapY = 35;
    private int gapX = 64;

    private Scanner scanner = new Scanner(System.in);
    private Robot robot;
    private int width;
    private int height;

    public GPC() {

        //Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(new Dimension(720 ,700));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        //Dimension ventana = this.getSize();
        //setLocation((pantalla.width – ventana.width) / 2, (pantalla.height – ventana.height) / 2);
        setVisible(true);
    }

    public void test() {


        BufferedImage img = null;
//    Graphics2D graphics2D = img.createGraphics();
        try {
            img = ImageIO.read(new File("ardilla.jpg"));
        } catch (IOException e) {
            System.out.println("No se cargó");
        }
        Graphics g = getGraphics();
        System.out.println("Bound X: "+getGraphicsConfiguration().getBounds().getX());
        width = img.getWidth();
        height = img.getHeight();

        int color = 0;

        for(int i = 0; i< width; i++){
            for(int j = 0; j< height; j++){
                color = img.getRGB(i,j);
                g.setColor(new Color(color));
                g.drawLine(i, j, i+1, j+1);
            }
        }

        try{
            robot = new Robot();
            System.out.println(robot.getPixelColor(50,50));

        }catch (Exception e){
            System.out.println("No se pudo crear");
        }


        showFirstMenu();
        translate();

    }

    private void translate() {
//        Graphics2D gr = ((Graphics2D) getGraphics());
//        gr.translate(xT,yT);
        Graphics graphics = getGraphics();
        for(int i = gapX; i<width+gapX; i++){
            for(int j=gapY; j<height + gapY; j++){
                graphics.setColor(robot.getPixelColor(i,j));
                graphics.drawLine(i+xT, j+yT, i+xT+1, j+yT+1);
                
                //graphics.setColor(Color.WHITE);
                //int originalX = i - gapX;
                //int originalY = j - gapY;
                //graphics.drawLine(originalX, originalY, i-gapX+1, j-gapY+1);
            }
        }
    }

    private void showFirstMenu() {
        System.out.println("Traslación básica:");
        System.out.println("Seleccione la distancia a recorrer:");
        System.out.print("x: ");
        xT = scanner.nextInt();
        System.out.print("y: ");
        yT = scanner.nextInt();

        scanner.close();
    }

    public static void main(String arg[]) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                GPC gpc = new GPC();
                gpc.test();
            }
        });
    }

}