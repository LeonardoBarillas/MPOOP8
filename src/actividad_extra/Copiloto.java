/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_extra;

/**
 * Clase que muestra los datos de un Copiloto
 * @author Barillas
*/
public class Copiloto extends Persona{
    private boolean gps;
    private boolean musica;
    private String genero;

    public Copiloto() {
    }
/**
 * Metodo que muestra los datos de un Copiloto
 * @param gps GPS del Copiloto
 * @param musica Música del Copiloto
 * @param genero Genero del Copiloto
 * @param mascota Mascota del Copiloto
 * @param nombre Nombre del Copiloto
 * @param edad Edad del Copiloto
 */
    public Copiloto(boolean gps, boolean musica, String genero, boolean mascota, String nombre, int edad) {
        super(mascota, nombre, edad);
        this.gps = gps;
        this.musica = musica;
        this.genero = genero;
    }
   
    public void quedarseDormido(){
        System.out.println("Un buen copiloto siempre se duerme");
    }
  
    public void ponerMusica(){
        System.out.println("Suena musica de Linkin Park de fondo...");
    }
   
    public void darDirecciòn(){
        System.out.println("Ha dado la dirección, pero se ha equivocado");
    }
 /**
  * Metodo que muestra los datos de un Copiloto
  * @return GPS, música, mascota, nombre, edadd y metodos de un Copiloto
  */  
    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean isMusica() {
        return musica;
    }

    public void setMusica(boolean musica) {
        this.musica = musica;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Copiloto{" + "gps=" + gps + ", musica=" + musica + ", genero=" + genero + '}';
    }
    
}

