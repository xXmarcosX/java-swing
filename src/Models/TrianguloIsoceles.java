/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author 2830482511008
 */
public class TrianguloIsoceles extends FiguraGeometrica {
    private double base;
    private double ladoIgual;
    private double altura;

    public TrianguloIsoceles(double base, double ladoIgual, double altura) {
        this.base = base;
        this.ladoIgual = ladoIgual;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLadoIgual() {
        return ladoIgual;
    }

    public void setLadoIgual(double ladoIgual) {
        this.ladoIgual = ladoIgual;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return (2 * ladoIgual) + base;
    }
}
