/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectounidad2;
import java.util.Scanner;

public class ejercicio6Ut4Matricess {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[][] matriz = new int[3][5];
        int media = 0;

        
        // Input grades for each student and module
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = teclado.nextInt();
            }
        }

        System.out.println("LISTADO DE NOTAS DE 1DAW ");

        // Print the list of grades for each student
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Alumno" + (i + 1) + ": ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
            
            
        }
        
        System.out.println("Media del módulo 1: "+(matriz[0][0]+matriz[0][1]+matriz[0][2])/3);
//
//     /**   // Calculate the average of Module 1
//        for (int i = 0; i < matriz.length; i++) {
//            media += matriz[i][0]; // Assuming module 1 is at index 0
//        }
//        media /= matriz.length;
// int roundedAverage = (int) Math.round(media);
//        System.out.printf("Media del módulo 1: %.0f%n", roundedAverage);*/
;
    }
}

//import java.util.Scanner;
//
//public class ejercicio6Ut4Matricess {
//
//    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//
//        int[][] matriz = new int[3][5];
//        double media = 0;
//
//        
//        // Input grades for each student and module
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[0].length; j++) {
//                matriz[i][j] = teclado.nextInt();
//            }
//        }
//
//        System.out.println("LISTADO DE NOTAS DE 1DAW ");
//
//        // Print the list of grades for each student
//        for (int i = 0; i < matriz.length; i++) {
//            System.out.print("Alumno" + (i + 1) + ": ");
//            for (int j = 0; j < matriz[0].length; j++) {
//                System.out.print(matriz[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        // Calculate the average of Module 1
//        for (int i = 0; i < matriz.length; i++) {
//            media += matriz[i][0]; // Assuming module 1 is at index 0
//        }
//        media /= matriz.length;
//
//        System.out.println("Media del módulo 1: " + media);
//    }
//}
