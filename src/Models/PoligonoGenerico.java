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
public class PoligonoGenerico extends FiguraGeometrica {
    private double[] x;
    private double[] y;
    private int numVertices;

    public PoligonoGenerico(double[] x, double[] y, int numVertices) {
        this.x = x;
        this.y = y;
        this.numVertices = numVertices;
    }

    public double[] getX() {
        return x;
    }

    public void setX(double[] x) {
        this.x = x;
    }

    public double[] getY() {
        return y;
    }

    public void setY(double[] y) {
        this.y = y;
    }

    public int getNumVertices() {
        return numVertices;
    }

    public void setNumVertices(int numVertices) {
        this.numVertices = numVertices;
    }

    @Override
    public double calcularArea() {
        double area = 0.0;

        for (int i = 0; i < numVertices; i++) {
            int j = (i + 1) % numVertices;
            area += (x[i] * y[j]) - (x[j] * y[i]);
        }

        if (area < 0) {
            area = area * -1;
        }

        return area / 2.0;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 0.0;

        for (int i = 0; i < numVertices; i++) {
            int j = (i + 1) % numVertices;
            perimetro += Math.sqrt(Math.pow(x[j] - x[i], 2) + Math.pow(y[j] - y[i], 2));
        }

        return perimetro;
    }
}
