/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_extra;

/**
 * Clase que muestra los datos de un Auto
 * @author Barillas
 */
public class Auto {
    private String piloto, copiloto, mascota1, mascota2;

    public Auto() {
    }
/**
 * Metodo que muestra los datos de un Auto
 * @param piloto Piloto de un Auto
 * @param copiloto Copiloto dentro de un Auto
 * @param mascota1 Mascota1 dentro de un Auto
 * @param mascota2 Mascota2 dentro de un Auto
 */
    public Auto(String piloto, String copiloto, String mascota1, String mascota2) {
        this.piloto = piloto;
        this.copiloto = copiloto;
        this.mascota1 = mascota1;
        this.mascota2 = mascota2;
    }

      public void encender(){
        System.out.println("Auto encendido");
    }
  
    public void apagar(){
        System.out.println("Auto apagado");
    }
    
    public void acelerar(){
        System.out.println("Run run");
    }
    public void frenar(){
        System.out.println("Otro poco y chocas");
    }
 /**
  * Metodo que muestra los datos de un Auto
  * @return Piloto, Copiloto y Mascotas dentro del Auto
  */   
    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(String copiloto) {
        this.copiloto = copiloto;
    }

    public String getMascota1() {
        return mascota1;
    }

    public void setMascota1(String mascota1) {
        this.mascota1 = mascota1;
    }
    
    public String getMascota2() {
        return mascota2;
    }

    public void setMascota2(String mascota2) {
        this.mascota2 = mascota2;
    }

    @Override
    public String toString() {
        return "Auto{" + "piloto=" + piloto + ", copiloto=" + copiloto + ", mascota1=" + mascota1 + ", mascota2=" + mascota2 + '}';
    }

}
