/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 * Clase que muestra los datos de un Triangulo
 * @author Barillas
 */
public class Triangulo extends Poligono {
    private int alfa, beta, gamma;
    private float a, b, c;
    private float base, altura;

    public Triangulo() {
    }
/**
 * Metodo que muestra los datos de un Triangulo
 * @param base Base de un Triangulo
 * @param altura Altura de un Triangulo
 */
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
/**
 * Metodo que muestra los datos de un Triangulo
 * @return Base y Altura de un Triangulo
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

    public int getGamma() {
        return gamma;
    }

    public void setGamma(int gamma) {
        this.gamma = gamma;
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

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
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
        return a+b+c; 
    }
    
    @Override
    public float area(){
        return base*altura/2;
    }
    
    @Override
    public String toString() {
        return "Triangulo{" + "alfa=" + alfa + ", beta=" + beta + ", gamma=" + gamma + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + '}';
    }
}
