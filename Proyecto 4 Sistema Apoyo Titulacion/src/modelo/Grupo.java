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
public class Grupo {
    private String nombre;
    private int numAceptados;
    static final int MAXIMO_ACEPTADOS= 25;
    static final int MINIMO_ACEPTADOS=10;
    private Candidato candidato;
    

    public Grupo() {
        this.nombre = null;
        this.numAceptados = 0;
        candidato = new Candidato();
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
    
    
    /*crear funcion para cuantificar numero de aceptados */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumAceptados() {
        return numAceptados;
    }

    public void setNumAceptados(int numAceptados) {
        this.numAceptados = numAceptados;
    }
    
    public void agregaAceptado(String matricula, 
        String nombre, String apellidoPaterno,
        String apellidoMaterno,String correoElectronico, 
        String generacion, int telefono, int foto ){
            candidato.setMatricula(matricula);
            candidato.setNombre(nombre);
            candidato.setApellidoPaterno(apellidoPaterno);
            candidato.setApellidoMaterno(apellidoMaterno);
            candidato.setCorreoElectronico(correoElectronico);
            candidato.setGeneracion(generacion);
            candidato.setTelefono(telefono);
            candidato.setFoto(foto);
    }
    
    public boolean terminaCapturaGrupo(){
        boolean bandera= false;
        if(this.numAceptados==0 || this.numAceptados<10 || this.numAceptados<0|| this.numAceptados>25){
            bandera= true;
        }
        return bandera;
    }
    
}
