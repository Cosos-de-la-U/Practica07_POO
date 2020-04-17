/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;

/**
 *
 * @author raulpenate
 */
public class Producto implements Caducidad, Impuesto {

    @Override
    public void fechaCaducidad(String dia, String mes, String año) {
        System.out.println("Vence : " + dia + "/" + mes + "/" + año);
    }

    @Override
    public void calcularImpuesto(String tipoDeProducto) {
        switch (tipoDeProducto) {
            case "libro":
                System.out.println("Este producto no tiene impuestos");
                break;
            case "leche":
                System.out.println("Este producto tiene un impuesto DAI del 20%");
                break;
            case "alcohol":
                System.out.println("Este producto tiene un impuesto DAI del 40%");
                break;
            case "cerveza":
                System.out.println("Este producto tiene un impuesto DAI del 20%");
                break;
            case "queso":
                System.out.println("Este producto tiene un impuesto DAI del 20%");
                break;
            case "arroz":
                System.out.println("Este producto tiene un impuesto DAI del 20%");
                break;
            default:
                System.out.println("Este producto no esta registrado en la base de datos");
        }
    }

}
