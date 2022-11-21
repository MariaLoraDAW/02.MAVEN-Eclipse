package ies.soterohernandez.daw.endes.HelloWorld;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class HelloWorld {
	  public static final String DEST = "resultados/hello-world.pdf";
	  
	  public static void main(String args[]) throws IOException {
	    PdfDocument pdf = new PdfDocument(new PdfWriter(DEST));
	    Document document = new Document(pdf);
	    String line = "Hola Mundo";
	    document.add(new Paragraph(line));
	    document.close();

	    System.out.println("No sé como pero se acaba de crear un PDF");
	  }
	}