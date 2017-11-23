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
public class Trabajo {
    private Lugar lugar;
    private Horario Horario;
    private String cargo;
    private String nombreEmpresa;

    public Trabajo() {
        this.lugar = null;
        this.Horario = null;
        this.cargo = null;
        this.nombreEmpresa = null;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public Horario getHorario() {
        return Horario;
    }

    public void setHorario(Horario Horario) {
        this.Horario = Horario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    @Override
    public String toString() {
        return "Trabajo{" + "lugar=" + lugar.toString() + ", Horario=" + Horario.toString() + ", cargo=" + cargo + ", nombreEmpresa=" + nombreEmpresa + '}';
    }
}
