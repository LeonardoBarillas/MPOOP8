/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_extra;

/**
 * Clase que muestra los datos de un Gato
 * @author Barillas
 */
public class Gato extends Mascota{
     public Gato() {
    }
/**
 * Metodo que muestra los datos de un Gato
 * @param color Color de un Gato
 * @param raza Raza de un Gato
 * @param colorOjos Color de Ojos de un Gato
 * @param nombre Nombre de un Gato
 * @param edad Edad de un Gato
 */
    public Gato(String color, String raza, String colorOjos, String nombre, int edad) {
        super(color, raza, colorOjos, nombre, edad);
    }
   
    public void rasguñar(){
        System.out.println("El gato quiere rasguñar algo");
    }
/**
 * Metodo que muestra los datos de un Gato
 * @return Color, raza, color de ojos, nombre y edad de un Gato
 */
    @Override
    public String toString() {
        return super.toString() + "Gato{" + '}';
    }
}
