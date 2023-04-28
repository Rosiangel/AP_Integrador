
package com.mycompany.integrador_ap4.Entidades;


public class Pronostico {
    private Partido partido;
    private Equipo equipo;
    private int resultadoEnum;

    public Pronostico() {
    }

    public Pronostico(Partido partido, Equipo equipo, int resultadoEnum) {
        this.partido = partido;
        this.equipo = equipo;
        this.resultadoEnum = resultadoEnum;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getResultadoEnum() {
        return resultadoEnum;
    }

    public void setResultadoEnum(int resultadoEnum) {
        this.resultadoEnum = resultadoEnum;
    }
    
    //Metodo 
   
}
