/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Marcos Vinicius
 */
public class TrianguloIsoceles extends FiguraGeometrica {
    private double base;
    private double altura;

    public TrianguloIsoceles(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularLadoIgual() {
        return Math.sqrt(Math.pow(base / 2, 2) + Math.pow(altura, 2));
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return base + (2 * calcularLadoIgual());
    }
}
