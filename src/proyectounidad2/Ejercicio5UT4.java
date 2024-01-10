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
public class Ejercicio5UT4 {

    /**
     * @param args the command line arguments
     */
    //Programa que lea 9 números sobre un vector, multiplique cada uno de los elementos por 2 y visualice el contenido del vector.
    public static void main(String[] args) {

        int[] matriz = new int[9];
        int multiplica ;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = teclado.nextInt();

        }

        for (int i = 0; i < matriz.length; i++) {
            multiplica = matriz[i] * 2;
            System.out.print(multiplica );

            if (i < matriz.length - 1) {
                System.out.print(", ");

            }
        }

    }
}
