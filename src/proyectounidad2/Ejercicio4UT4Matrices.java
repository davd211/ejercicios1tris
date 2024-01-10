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
public class Ejercicio4UT4Matrices {

    /**
     * @param args the command line arguments
     */
    //Poner valores del 0 al 8 a una matriz de 3 filas y 3 columnas. Visualizar el contenido por filas.
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;

        int[][] matriz = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[0][i]);

        }
        System.out.print("\n");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[1][i]);

        }
                System.out.print("\n");

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[2][i]);

        }
        System.out.println("");
    }

}
