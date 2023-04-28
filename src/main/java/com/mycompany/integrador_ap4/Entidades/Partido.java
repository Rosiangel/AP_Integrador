
package com.mycompany.integrador_ap4.Entidades;

import Servicios.resultadoEnum;


public class Partido {
    //Atributos
    private Equipo Equipo1;
    private Equipo Equipo2;
    private int golesEquipo1;
    private int golesEquipo2;
    public static Ronda resultado;
    
     //Contructor con parametros
    public Partido() {
    }

    //Contructor con parametros

    public Partido(Equipo Equipo1, Equipo Equipo2, int golesEquipo1, int golesEquipo2) {
        this.Equipo1 = Equipo1;
        this.Equipo2 = Equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }
    
    public Partido(String string, String string2, int i, int j) {
	
}
    //Getter and Setter

    public Equipo getEquipo1() {
        return Equipo1;
    }

    public void setEquipo1(Equipo Equipo1) {
        this.Equipo1 = Equipo1;
    }

    public Equipo getEquipo2() {
        return Equipo2;
    }

    public void setEquipo2(Equipo Equipo2) {
        this.Equipo2 = Equipo2;
    }

    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public int getGolesEquipo2() {
        return golesEquipo2;
    }

    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }

    public static Ronda getResultado() {
        return resultado;
    }

    public static void setResultado(Ronda resultado) {
        Partido.resultado = resultado;
    }
 
  //Metodo
    public resultadoEnum resultado() {
        resultadoEnum resultado;
        if(golesEquipo1 > golesEquipo2) {
            resultado=resultadoEnum.GANADOR;
        }else if(golesEquipo1 == golesEquipo2) {
            resultado = resultadoEnum.EMPATE;
        } else resultado = resultadoEnum.PERDEDOR;
        return resultado;
    }
    
}
