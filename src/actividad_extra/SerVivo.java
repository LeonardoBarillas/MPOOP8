/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_extra;

/**
 * Clase que muestra los datos de un SerVivo
 * @author Barillas
 */
public class SerVivo {
    private String nombre;
    private int edad;

    public SerVivo() {
    }
/**
 * Metodo que muestra los datos de un SerVivo
 * @param nombre Nombre de un SerVivo
 * @param edad Edad de un SerVivo
 */
    public SerVivo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void respirar(){
        System.out.println("Esta respirando");
    }
/**
 * Metodo que muestra los datos de un SerVivo
 * @return Nombre y edad de un SerVivo
 */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "SerVivo{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
}
