/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_walterreyes;


public class Estudiantes {
 private String Nombre;
 private String Apellido;
 private int cuenta;
 private int edad;
 private String genero;
 private Carrera carrera;

    public Estudiantes() {
    }

    public Estudiantes(String Nombre, String Apellido, int cuenta, int edad, String genero, Carrera carrera) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.cuenta = cuenta;
        this.edad = edad;
        this.genero = genero;
        this.carrera = carrera;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return  "Nombre:" + Nombre + " cuenta:" + cuenta + " carrera: " + carrera + "\n";
    }
 
}
