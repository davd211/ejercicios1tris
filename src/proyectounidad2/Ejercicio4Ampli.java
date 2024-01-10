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
public class Ejercicio4Ampli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = 0, resultado = 0, multi = 0;

        numero = teclado.nextInt();

        while (numero != -1) {
            for (int i = 0; i <=10; i++) {
                resultado = numero * i;

                System.out.print(numero + "x" + i + "=" + resultado + ",");

            }
            numero = teclado.nextInt();

        }

    }

}
