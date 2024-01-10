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
public class Ejercicio7UT4 {

    /**
     * @param args the command line arguments
     */
    //Leer 7 letras sobre un vector. Visualizar cuántas letras “a” hay
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        // Declarar un vector de 10 elementos
        char[] vector = new char[7];

        // Asignar valores individualmente mediante Scanner
        for (int i = 0; i < vector.length; i++) {
            vector[i] = scanner.next().charAt(0);

        }
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 'a' )
            {
                contador++;

            }
          
        }            System.out.print("Vocales = "+contador);

    }
}
