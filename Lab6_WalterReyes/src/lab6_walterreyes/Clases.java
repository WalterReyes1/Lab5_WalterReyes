/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_walterreyes;


public class Clases {
 private String nombre;
 private String sección;
 private int edificio;
 private int salón;
 private String aire;

    public Clases() {
    }

    public Clases(String nombre, String sección, int edificio, int salón, String aire) {
        this.nombre = nombre;
        this.sección = sección;
        this.edificio = edificio;
        this.salón = salón;
        this.aire = aire;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSección() {
        return sección;
    }

    public void setSección(String sección) {
        this.sección = sección;
    }

    public int getEdificio() {
        return edificio;
    }

    public void setEdificio(int edificio) {
        this.edificio = edificio;
    }

    public int getSalón() {
        return salón;
    }

    public void setSalón(int salón) {
        this.salón = salón;
    }

    public String getAire() {
        return aire;
    }

    public void setAire(String aire) {
        this.aire = aire;
    }

    @Override
    public String toString() {
        return "nombre:" + nombre + ", sección: " + sección + ", edificio: " + edificio + ", salón: " + salón + ", aire: " + aire + "\n";
    }
 
}
