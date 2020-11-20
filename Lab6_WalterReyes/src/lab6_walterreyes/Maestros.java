/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_walterreyes;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Maestros {
    
private String nombre;
private String apellido;
private Float salario;
private int edad;
private ArrayList <Clases> Clases = new ArrayList();

    public Maestros() {
    }

    public Maestros(String nombre, String apellido, Float salario, int edad, ArrayList<Clases> Clases) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.edad = edad;
        this.Clases = Clases;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Clases> getClases() {
        return Clases;
    }

    public void setClases(ArrayList<Clases> Clases) {
        this.Clases = Clases;
    }

    @Override
    public String toString() {
        return "Maestros{" + "nombre=" + nombre + '}';
    }

    

}
