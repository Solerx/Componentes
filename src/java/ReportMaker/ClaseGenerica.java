/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ReportMaker;

/**
 *
 * @author Daniel
 */
public class ClaseGenerica {
     private String uno;
     private String dos;
     private String tres;

    public ClaseGenerica(String uno, String dos, String tres) {
        this.uno = uno;
        this.dos = dos;
        this.tres = tres;
    }

    public ClaseGenerica() {
    }
     
     public String getUno() {
        return uno;
    }

    public void setUno(String uno) {
        this.uno = uno;
    }

    public String getDos() {
        return dos;
    }

    public void setDos(String dos) {
        this.dos = dos;
    }

    public String getTres() {
        return tres;
    }

    public void setTres(String tres) {
        this.tres = tres;
    }

    @Override
    public String toString() {
        return "Titulo Random :B" ;
    }
     
    
     
}
