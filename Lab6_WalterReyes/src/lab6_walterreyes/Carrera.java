
package lab6_walterreyes;

/**
 *
 * @author hp
 */
public class Carrera {
  private String nombre;
  private String facultad;
  private Float costo;
  private String jefe;

    public Carrera() {
    }

    public Carrera(String nombre, String facultad, Float costo, String jefe) {
        this.nombre = nombre;
        this.facultad = facultad;
        this.costo = costo;
        this.jefe = jefe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    @Override
    public String toString() {
        return   "nombre: " + nombre + "\n";
    }
  
  
}
