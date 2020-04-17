/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author raulpenate
 */
public class main {

    public static void main(String[] args) {
        Producto oProducto = new Producto();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tipo de producto para verificar si tiene impuesto");
        String impuesto = sc.nextLine();
        String partesFecha[] = new String[3];
        String nombresFecha[] = {"Dia", "Mes", "Año"};
        System.out.println("Ahora ingrese los la fecha de vencimiento del producto");
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese " + nombresFecha[i]);
            partesFecha[i] = sc.nextLine();
        }
        //Resultados
        oProducto.calcularImpuesto(impuesto);
        oProducto.fechaCaducidad(partesFecha[0], partesFecha[1], partesFecha[2]);
    }
    
}
