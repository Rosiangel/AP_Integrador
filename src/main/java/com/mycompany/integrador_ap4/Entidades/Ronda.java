
package com.mycompany.integrador_ap4.Entidades;


public class Ronda {
 private int nroRondas;
 private Partido partido[];

    public Ronda() {
    }

    public Ronda(int nroRondas, Partido[] partido) {
        this.nroRondas = nroRondas;
        this.partido = partido;
    }

    public int getNroRondas() {
        return nroRondas;
    }

    public void setNroRondas(int nroRondas) {
        this.nroRondas = nroRondas;
    }

    public Partido[] getPartido() {
        return partido;
    }

    public void setPartido(Partido[] partido) {
        this.partido = partido;
    }
    
     //Metodo
    public Ronda puntos(){
     while (nroRondas<=2){
         nroRondas+=1;
         return Partido.resultado;
     }
    
        return null;
    }
 
}
