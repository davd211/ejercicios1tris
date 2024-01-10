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
public class ejercicio1AMPLI2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero = teclado.nextInt();
        int i, resultado = 0;
        resultado=numero;
        for (i = 1; i < numero; i++) {
            resultado= resultado*(numero-i);

        }
        System.out.println(resultado);

    }

}
