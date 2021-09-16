import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class HolaMundoPDF
{
	public static void main(String[] args) throws 
                DocumentException, 
                FileNotFoundException, 
                BadElementException, 
                IOException
        {

                FileOutputStream archivo = new FileOutputStream("hola1.pdf");
		Document documento = new Document();
                PdfWriter.getInstance(documento, archivo);
                documento.open();
                //Image foto = Image.getInstance("D:\\Imagenes/imagen1.jpg");
                //foto.scaleToFit(40, 40);
                //foto.setAlignment(Chunk.ALIGN_CENTER);
                //documento.add(foto);
                documento.add(new Paragraph("   Granja Cornejo"));
                documento.add(new Paragraph("   Colcapirua"));
                Paragraph titulo = new Paragraph("REPORTE DE SIMULACION");
                titulo.setAlignment(Chunk.ALIGN_CENTER);
                documento.add(titulo);
                //documento.addTitle("REPORTE DE SIMULACION");
                //documento.addAuthor("Taller de simulacion");
                documento.addCreationDate();
                int num = documento.getPageNumber();
                Paragraph numero = new Paragraph("dendiendo de la disposicon de los comnesales en la convocatoria de los cantaes en puerto rico y de las chicas que participaran en el disenio de los trajes para determinada entrada universitaria");
                
                numero.setAlignment(Chunk.ALIGN_JUSTIFIED_ALL);
                documento.add(numero);
                documento.close();
	}
}