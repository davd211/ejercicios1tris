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
public class ejercicio5Ampli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int suma = 0;
       int mayor = 0, menor = 0;

        for (int i = 0; i < 6; i++) {
            int numero = teclado.nextInt();
            if (i == 0) {
                mayor = numero;
                menor = numero;
            }
            if (mayor < numero) {
                mayor = numero;
            }
            if (menor > numero) {
                menor = numero;
            }

        }
        System.out.print("El mayor es " + mayor + " y el menor es " + menor);

    }

}
