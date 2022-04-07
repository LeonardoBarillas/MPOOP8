/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_extra;

/**
 * Clase que muestra los datos de un Perro
 * @author Barillas
 */
public class Perro extends Mascota{
     private boolean colaCortada;

    public Perro() {
    }
/**
 * Metodo que muestra los datos de un Perro
 * @param colaCortada Cola Cortada de un Perro
 * @param color Color de un Perro
 * @param raza Raza de un Perro
 * @param colorOjos Color de Ojos de un Perro
 * @param nombre Nombre de un Perro
 * @param edad Edad de un Perro
 */
    public Perro(boolean colaCortada, String color, String raza, String colorOjos, String nombre, int edad) {
        super(color, raza, colorOjos, nombre, edad);
        this.colaCortada = colaCortada;
    }
    
    public void correr(){
        System.out.println("Que rapido corre");
    }
    
    public void corretear(){
        System.out.println("Esta correteando algo");
    }

    public boolean isColaCortada() {
        return colaCortada;
    }

    public void setColaCortada(boolean colaCortada) {
        this.colaCortada = colaCortada;
    }
/**
 * Metodo que muestra los datos de un Perro
 * @return Cola cortada, color, raza, color de ojos, nombre y edad de un Perro
 */
    @Override
    public String toString() {
        return super.toString() + "Perro{" + "colaCortada=" + colaCortada + '}';
    }
}
