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
public class ejercicio2Ampli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int suma = 0;
        int mayor = 0;
        for (int i = 0; i < 5; i++) {
            int numero = teclado.nextInt();

            
              if (mayor < numero) {
                  mayor=numero;
        }
   

        }System.out.println("El mayor es "+mayor);

    }
}
