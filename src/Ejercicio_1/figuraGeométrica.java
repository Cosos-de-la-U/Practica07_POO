/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

import javax.swing.JOptionPane;

/**
 *
 * @author raulpenate
 */
public class figuraGeométrica implements perimetro, area {

    public double areaTriangulo;
    public double perimetroTriangulo;

    @Override
    public void calcularPerimetro(double ladoUno, double ladoDos, double ladoTres) {
        perimetroTriangulo = ladoUno + ladoDos + ladoTres;
        JOptionPane.showMessageDialog(null, "Perimetro : " + perimetroTriangulo);
    }

    @Override
    public void calcularArea(double base, double altura) {
        areaTriangulo = (base * altura) / 2;
        JOptionPane.showMessageDialog(null, "Area : " + areaTriangulo);
    }

    public static void main(String[] args) {
        figuraGeométrica Triangulo = new figuraGeométrica();

        double[] datosPerimetro = new double[3];
        double[] datosArea = new double[2];
        String[] nombres = {"Area", "Perimetro"};

        for (int i = 0; i < 3; i++) {
            datosPerimetro[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el lado " + (i+1)));
        }

        for (int i = 0; i < 2; i++) {
            datosArea[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el  " + nombres[i]));
        }

        Triangulo.calcularPerimetro(datosPerimetro[0], datosPerimetro[1], datosPerimetro[2]);
        Triangulo.calcularArea(datosArea[0], datosArea[1]);
    }

}
