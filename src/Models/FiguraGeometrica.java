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
public abstract class FiguraGeometrica {
    protected String nomeFigura;
    
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}
