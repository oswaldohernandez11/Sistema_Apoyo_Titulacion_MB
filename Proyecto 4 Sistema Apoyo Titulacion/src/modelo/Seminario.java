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
public class Seminario {
    private String  nombre;
    private Date inicio;
    private int numeroGrupos;
    private int numeroAsesores;
    private Asesor asesor;

    public Seminario() {
        this.nombre = null;
        this.inicio = null;
        this.numeroGrupos = 0;
        this.numeroAsesores = 0;
        asesor = new Asesor();
    }

    public Asesor getAsesor() {
        return asesor;
    }

    public void setAsesor(Asesor asesor) {
        this.asesor = asesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public int getNumeroGrupos() {
        return numeroGrupos;
    }

    public void setNumeroGrupos(int numeroGrupos) {
        this.numeroGrupos = numeroGrupos;
    }

    public int getNumeroAsesores() {
        return numeroAsesores;
    }

    public void setNumeroAsesores(int numeroAsesores) {
        this.numeroAsesores = numeroAsesores;
    }

    public void agregaAsesor(){
        this.numeroAsesores++;
    }
    
    public void agregaGrupo(){
        this.numeroGrupos++;   
    }
    
    public void agregarAsesor( 
        String nombre, String apellidoPaterno,
        String apellidoMaterno,String correoElectronico, 
        int telefono, String cubiculo ){
        
            asesor.setNombre(nombre);
            asesor.setApellidoPaterno(apellidoPaterno);
            asesor.setApellidoMaterno(apellidoMaterno);
            asesor.setCorreoElectronico(correoElectronico);
            asesor.setTelefono(telefono);
            asesor.setCubiculo(cubiculo);
     }
    
    
}
