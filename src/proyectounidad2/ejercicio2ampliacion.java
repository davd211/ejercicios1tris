/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectounidad2;

/**
 *
 * @author David.P
 */


public class  ejercicio2ampliacion {
    public static void main(String[] args) {

      
        int importe = 232;

        int billetes500 = importe / 500;
        importe = importe % 500;

        int billetes200 = importe / 200;
        importe = importe % 200;

        int billetes100 = importe / 100;
        importe = importe % 100;

        int billetes50 = importe / 50;
        importe = importe % 50;

        int billetes20 = importe / 20;
        importe = importe % 20;

        int billetes10 = importe / 10;
        importe = importe % 10;

        int billetes5 = importe / 5;
        int monedas1 = importe % 5;

       
        System.out.println("El número de billetes es"+" Billetes de 500:" + billetes500);
        System.out.println("Billetes de 200: " + billetes200);
        System.out.println("Billetes de 100: " + billetes100);
        System.out.println("Billetes de 50: " + billetes50);
        System.out.println("Billetes de 20: " + billetes20);
        System.out.println("Billetes de 10: " + billetes10);
        System.out.println("Billetes de 5: " + billetes5);
        System.out.print("Y sobran " + monedas1 + "€");
    }
}