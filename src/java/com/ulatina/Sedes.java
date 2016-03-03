/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
/**
 *
 * @author Coco xD
 */
@ManagedBean(name="beanSedes")
@RequestScoped

public class Sedes {
    private String nombre;
    private String facultades;
    private String dirección;
    private String teléfono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFacultades() {
        return facultades;
    }

    public void setFacultades(String facultades) {
        this.facultades = facultades;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }
    
    public void Guardar(){
    }
}
