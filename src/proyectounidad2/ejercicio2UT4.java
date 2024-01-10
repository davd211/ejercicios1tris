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
public class ejercicio2UT4 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarar un vector de 10 elementos
        int[] vector = new int[8];

        // Asignar valores individualmente mediante Scanner
        for (int i = 0; i < vector.length; i++) {
            vector[i] = scanner.nextInt();
        }

        // Mostrar el contenido del vector
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

        // Cerrar el Scanner para evitar fugas de recursos
    }
}
