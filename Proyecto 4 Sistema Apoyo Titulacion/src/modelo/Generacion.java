
package modelo;

public class Generacion {
    private String generacion;

    public String getGeneracion() {
        return generacion;
    }

    public void setNombre(String generacion) {
        this.generacion = generacion;
    }

    @Override
    public String toString() {
        return "Carrera{"+"nombre="+generacion+'}';
    }
}
