
package com.mycompany.integrador_ap4.Entidades;


public class Equipo {
       //Atributos
    private String nombreEquipo;
    private String descripcion;
    
    //Contructor vacio
    public Equipo() {
    }
 
    //Contructor con parametros
    public Equipo(String nombreEquipo, String descripcion) {
        this.nombreEquipo = nombreEquipo;
        this.descripcion = descripcion;
    }
    //Getter and Setter
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
      
}
