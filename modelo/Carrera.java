
package modelo;

public class Carrera {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Carrera{"+"nombre="+nombre+'}';
    }
    
    
}
