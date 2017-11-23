/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Jhon Nash
 */
public class Horario {
    private String tipo;
    private Date horaEntrada;
    private Date horaSalida;
    private int horasSemana;

    public Horario() {
        this.tipo = tipo;
        this.horaEntrada = null;
        this.horaSalida = null;
        this.horasSemana = 0;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getHorasSemana() {
        return horasSemana;
    }

    public void setHorasSemana(int horasSemana) {
        this.horasSemana = horasSemana;
    }

    @Override
    public String toString() {
        return "Horario{" + "tipo=" + tipo + ", horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + ", horasSemana=" + horasSemana + '}';
    }
    
    
}
