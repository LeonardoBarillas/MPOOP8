/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 * Clase que muestra los datos de un Cuadrilatero
 * @author Barillas
 */
public class Cuadrilatero extends Poligono {
     private int alfa, beta;
    private float a, b;
    private float base, altura;
    
    public Cuadrilatero() {
    }
/**
 * Metodo que muestra los datos de un Cuadrilatero
 * @param base Base de un Cuadrilatero
 * @param altura Altura de un Cuadrilatero
 */
    public Cuadrilatero(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
/**
 * Metodo que muestra los datos de un Cuadrilatro
 * @return Base y altura de un Cuadrilatero 
 */
    public int getAlfa() {
        return alfa;
    }

    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    public int getBeta() {
        return beta;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float perimetro() {
        return 2*a + 2*b;
    }
    
    @Override
    public float area(){
        return base*altura;
    }
    @Override
    public String toString() {
        return "Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }
}
