/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop8;

import actividad_extra.Auto;
import actividad_extra.Copiloto;
import actividad_extra.Mascota;
import actividad_extra.Piloto;
import actividad_extra.SerVivo;
import figuras.Cuadrilatero;
import figuras.Poligono;
import figuras.Triangulo;

/**
 *
 * @author Barillas
 */
public class MPOOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Poligono poligono = new Poligono();
        System.out.println(poligono);
        
        poligono = new Triangulo();
        System.out.println(poligono);
        
        poligono = new Cuadrilatero();
        System.out.println(poligono);
        
        Object objeto = new Object();
        System.out.println(objeto);
        objeto = new Poligono();
        System.out.println(objeto);
        objeto = new Triangulo();
        System.out.println(objeto);
        
        getPoligono(new Triangulo());
        getPoligono(new Cuadrilatero());
        getPoligono(new Poligono());
        
        //Triangulo t2 = new Poligono(); --> No se puede  
        
        Auto auto = new Auto();
        System.out.println(auto);
        getPosAuto(new Piloto());
        getPosAuto(new Copiloto());
        getPosAuto(new Mascota());
        
    }
    
    public static void getPoligono(Poligono pol) {
        if (pol instanceof Triangulo){
            System.out.println("El poligono es un triangulo");
        }else if (pol instanceof Cuadrilatero){
            System.out.println("El poligono es un cuadrilatero");
        }else {
            System.out.println("Es otra figura");
        }
    }
    
    public static void getPosAuto(SerVivo serVi) {
        if (serVi instanceof Piloto){
            System.out.println("El pasajero va en el asiento del piloto");
        }else if (serVi instanceof Copiloto){
            System.out.println("El pasajero va en el asiento del copiloto");
        }else {
            System.out.println("Es una mascota y va en una caja de atras");
        }
    }
    }
     

