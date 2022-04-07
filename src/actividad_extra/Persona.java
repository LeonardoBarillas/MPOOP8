/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_extra;

/**
 * Clase que muestra los datos de una Persona
 * @author Barillas
 */
public class Persona extends SerVivo{
    private boolean mascota;

    public Persona() {
    }
/**
 * Metodo que muestra los datos de una Persona
 * @param mascota Mascota de una Persona
 * @param nombre Nombre de una Persona
 * @param edad Edad de una Persona
 */
    public Persona(boolean mascota, String nombre, int edad) {
        super(nombre, edad);
        this.mascota = mascota;
    }
/**
 * Metodo que muestra los datos de una Persona
 * @return Mascota, nombre y edad de una Persona
 */
    public boolean isMascota() {
        return mascota;
    }

    public void setMascota(boolean mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return super.toString() + "Persona{" + "mascota=" + mascota + '}';
    }
}
