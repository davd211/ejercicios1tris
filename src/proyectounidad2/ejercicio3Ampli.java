/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectounidad2;

import java.util.Scanner;

/**
 *
 * @author David.P
 */
public class ejercicio3Ampli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0, numero1 = 0;
        int mayor = 0;
        int contador = 0;
        numero1 = teclado.nextInt();

        do {
            numero = teclado.nextInt();
            if (numero1 < numero) {
                contador++;
            }
        } while (numero != 0);

        System.out.printf("Hay " + contador + " mayores que " + numero1);
    }

}
