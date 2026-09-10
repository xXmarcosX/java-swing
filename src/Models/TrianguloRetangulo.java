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
public class TrianguloRetangulo extends FiguraGeometrica {
    private double catetoA;
    private double catetoB;
    private double hipotenusa;

    public TrianguloRetangulo(double catetoA, double catetoB, double hipotenusa) {
        this.catetoA = catetoA;
        this.catetoB = catetoB;
        this.hipotenusa = hipotenusa;
    }

    public double getCatetoA() {
        return catetoA;
    }

    public void setCatetoA(double catetoA) {
        this.catetoA = catetoA;
    }

    public double getCatetoB() {
        return catetoB;
    }

    public void setCatetoB(double catetoB) {
        this.catetoB = catetoB;
    }

    public double getHipotenusa() {
        return hipotenusa;
    }

    public void setHipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }

    @Override
    public double calcularArea() {
        return (catetoA * catetoB) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return catetoA + catetoB + hipotenusa;
    }
}
