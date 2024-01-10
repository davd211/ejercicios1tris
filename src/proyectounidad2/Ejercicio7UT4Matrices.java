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
public class Ejercicio7UT4Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
//
        int[][] matriz = new int[3][2];
        double media = 0;
        int sumaPeso;

        
        // Input grades for each student and module
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = teclado.nextInt();
            }
        }

        System.out.println("LISTADO EDAD Y PESO");

        // Print the list of grades for each student
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Alumno" + (i + 1) + ": ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Calculate the average of Module 1
//        for (int i = 0; i < matriz.length; i++) {
//            media += matriz[i][0]; // Assuming module 1 is at index 0
//        }
//        media /= matriz.length;
        sumaPeso = matriz[0][1] + matriz[1][1] + matriz[2][1];

 double mediaPeso = (double) sumaPeso / matriz.length;

        // Print the average weight
        System.out.printf("La media de pesos de los estudiantes es: %.0f%n", mediaPeso);
    }

    
    }
    

