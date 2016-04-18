/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ReportMaker;

import com.google.common.collect.Table;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.collection.PdfTargetDictionary;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Reportalo {
    
    public static final String ReporteTest = "reportes/tablaTest.pdf";
    
    public File GenerarReporte(ArrayList<ClaseGenerica> clasesRandom, String filename) throws IOException, DocumentException {
        
          {
    	// step 1
        Document document = new Document();
        // step 2
              try {
                  PdfWriter.getInstance(document, new FileOutputStream(ReporteTest));
              } catch (NullPointerException e) {
                  System.out.println("catch!");
                  e.printStackTrace();
                  PdfWriter.getInstance(document, new FileOutputStream("test.pdf"));
              }
        
        // step 3
        document.open();
        // step 4
        document.add(crearTabla( clasesRandom));
        // step 5
        document.close();
        
    return null;}
}

    private PdfPTable crearTabla(ArrayList<ClaseGenerica> cedes) {
        PdfPTable tabla = new PdfPTable(3);
        
        tabla.addCell(new PdfPCell( new Paragraph("Cede")));
        tabla.addCell(new PdfPCell(new Paragraph("dato 1")));
        tabla.addCell(new PdfPCell( new Paragraph("dato 2")));
        
        for (ClaseGenerica cede : cedes){
        tabla.addCell(new PdfPCell( new Paragraph(cede.getUno())));
        tabla.addCell(new PdfPCell( new Paragraph(cede.getDos())));
        tabla.addCell(new PdfPCell( new Paragraph(cede.getTres())));
        }
        
        return tabla;
    }
}

