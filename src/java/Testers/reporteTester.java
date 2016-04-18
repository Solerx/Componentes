/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Testers;

import ReportMaker.*;
import com.itextpdf.text.DocumentException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class reporteTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, DocumentException {
        ClaseGenerica cg = new ClaseGenerica("san pedro", "metrica 1", "metrica 2");
        ClaseGenerica cg1 = new ClaseGenerica("Heredia", "metrica 1", "metrica 2");
        ClaseGenerica cg2 = new ClaseGenerica("otro", "metrica 1", "metrica 2");
        
        ArrayList<ClaseGenerica> clases = new ArrayList<ClaseGenerica>();
        clases.add(cg);
        clases.add(cg1);
        clases.add(cg2);
        
       Reportalo r = new Reportalo ();
        System.out.println(r.GenerarReporte(clases, null));
        
    }
    
}
