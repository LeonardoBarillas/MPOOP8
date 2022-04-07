/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_extra;

/**
 * Clase que muestra los datos de una Mascota
 * @author Barillas
 */
public class Mascota extends SerVivo{
    private String color;
    private String raza;
    private String colorOjos;

    public Mascota() {
    }
 /**
  * Metodo que muestra los datos de una Mascota
  * @param color Color de una Mascota
  * @param raza Raza de una Mascota
  * @param colorOjos Color de Ojos de una Mascota
  * @param nombre Nombre de una Mascota
  * @param edad Edad de una Mascota
  */  
    public Mascota(String color, String raza, String colorOjos, String nombre, int edad) {
        super(nombre, edad);
        this.color = color;
        this.raza = raza;
        this.colorOjos = colorOjos;
    }
   
    public void dormir(){
        System.out.println("Esta durmiendo... Zzz...");
    }
   
    public void jugar(){
        System.out.println("Hora de jugar!");
    }
    
    public void saltar(){
        System.out.println("Ha saltado muy alto!");
    }
/**
 * Metodo que muestra los datos de una Mascota
 * @return Color, raza, color de ojos, nombre y edad de una Mascota
 */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    @Override
    public String toString() {
        return super.toString() + "Mascota{" + "color=" + color + ", raza=" + raza + ", colorOjos=" + colorOjos + '}';
    }
}
