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
public class Ejercicio6UT4 {

    /**
     * @param args the command line arguments
     */
    //Introducir la edad de 7 personas sobre un vector. ¿Cuántas son mayores de edad?
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declarar un vector de 10 elementos
        int[] vector = new int[7];
        int mayor = 0;

        // Asignar valores individualmente mediante Scanner
        for (int i = 0; i < vector.length; i++) {
            vector[i] = scanner.nextInt();

        }
        for (int i = 0; i < vector.length; i++) {

            if (vector[i] >= 18) {

                mayor++;
            }
        }System.out.print("Mayores de edad="+mayor);

    }

}