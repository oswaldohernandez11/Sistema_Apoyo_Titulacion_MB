/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Jhon Nash
 */
public class Tesis {
    private String Tema;
    private Asesor director;
    
    public String getTema() {
        return Tema;
    }

    public void setTema(String Tema) {
        this.Tema = Tema;
    }

    public Asesor getDirector() {
        return director;
    }

    public void setDirector(Asesor director) {
        this.director = director;
    }
}
