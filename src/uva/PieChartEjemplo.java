/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficando;

import java.io.File;
import java.io.IOException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Sergio Rodrigo
 */
public class PieChartEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("Armando Casa = " + 175, (int) new Integer(175));
        pieDataset.setValue("Beto = " +  10, (int)new Integer(10));
        pieDataset.setValue("Carla = " + 10, (int)new Integer(10));
        pieDataset.setValue("Daniela = " + 5, (int)new Integer(5));
        JFreeChart chart = ChartFactory.createPieChart3D("Detalle de Venta", pieDataset, true, true, true);
        try{
            ChartUtilities.saveChartAsJPEG(new File("ARCHIVO.jpg"), chart, 500, 300);
        }catch(IOException e){
            System.err.println("No se creo");
        }
    }
}
