/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_extra;

/**
 * Clase que muestra los datos de un Piloto
 * @author Barillas
 */
public class Piloto extends Persona{
    private String tipoLicencia;
    private String numeroLicencia;
    private int estatura;
    
    public Piloto() {
    }
/**
 * Metodo que muestra los datos de un Piloto
 * @param tipoLicencia Tipo de Licencia de un Piloto
 * @param numeroLicencia Número de Licencia de un Piloto 
 * @param estatura Estatura de un Piloto
 * @param mascota Mascota de un Piloto
 * @param nombre Nombre de un Piloto
 * @param edad Edad de un Piloto
 */
    public Piloto(String tipoLicencia, String numeroLicencia, int estatura, boolean mascota, String nombre, int edad) {
        super(mascota, nombre, edad);
        this.tipoLicencia = tipoLicencia;
        this.numeroLicencia = numeroLicencia;
        this.estatura = estatura;
    }
    
    public void conducir(){
        System.out.println("Manejando ando");
    }
    
    public void encenderDireccionales(){
        System.out.println("Las direccionales no gastan gasolina ni las cobran en el recibo de la luz");
    }
    
    public void gritarleAlDeEnfrente(){
        System.out.println("¡Quitate animal!");
    }
  /**
   * Metodo que muestra los datos de un Piloto
   * @return Tipo de Licencia, número de licencia, estatura, mascota, nombre, edad de un Piloto
   */  
    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return super.toString() + "Piloto{" + "tipoLicencia=" + tipoLicencia + ", numeroLicencia=" + numeroLicencia + ", estatura=" + estatura + '}';
    }
}


