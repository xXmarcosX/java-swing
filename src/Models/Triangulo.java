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
public class Triangulo extends FiguraGeometrica {
    private double xA, yA, xB, yB, xC, yC;

    public Triangulo(double xA, double yA, double xB, double yB, double xC, double yC) {
        this.xA = xA;
        this.yA = yA;
        this.xB = xB;
        this.yB = yB;
        this.xC = xC;
        this.yC = yC;
    }

    public double getxA() {
        return xA;
    }

    public void setxA(double xA) {
        this.xA = xA;
    }

    public double getyA() {
        return yA;
    }

    public void setyA(double yA) {
        this.yA = yA;
    }

    public double getxB() {
        return xB;
    }

    public void setxB(double xB) {
        this.xB = xB;
    }

    public double getyB() {
        return yB;
    }

    public void setyB(double yB) {
        this.yB = yB;
    }

    public double getxC() {
        return xC;
    }

    public void setxC(double xC) {
        this.xC = xC;
    }

    public double getyC() {
        return yC;
    }

    public void setyC(double yC) {
        this.yC = yC;
    }

    public double distanciaAB() {
        return Math.sqrt(Math.pow(xB - xA, 2) + Math.pow(yB - yA, 2));
    }

    public double distanciaBC() {
        return Math.sqrt(Math.pow(xC - xB, 2) + Math.pow(yC - yB, 2));
    }

    public double distanciaCA() {
        return Math.sqrt(Math.pow(xA - xC, 2) + Math.pow(yA - yC, 2));
    }

    @Override
    public double calcularArea() {
        // Monta a matriz 3x3 com as coordenadas dos vértices
        double[][] matriz = {
            {xA, yA, 1},
            {xB, yB, 1},
            {xC, yC, 1}
        };

        // Cálculo do Determinante pela Regra de Sarrus
        double diagPrincipal = (matriz[0][0] * matriz[1][1] * matriz[2][2]) +
                               (matriz[0][1] * matriz[1][2] * matriz[2][0]) +
                               (matriz[0][2] * matriz[1][0] * matriz[2][1]);

        double diagSecundaria = (matriz[0][2] * matriz[1][1] * matriz[2][0]) +
                                (matriz[0][0] * matriz[1][2] * matriz[2][1]) +
                                (matriz[0][1] * matriz[1][0] * matriz[2][2]);

        double det = diagPrincipal - diagSecundaria;

        if (det < 0) {
            det = det * -1;
        }

        return det / 2.0;
    }

    @Override
    public double calcularPerimetro() {
        return distanciaAB() + distanciaBC() + distanciaCA();
    }
}
