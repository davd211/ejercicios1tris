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
public class Ejercicio1UT4Matrices {

    /**
     * @param args the command line arguments
     */
    //Introducir 10 números y almacenarlos en una matriz de 5 por 2. Visualizar solo las filas pares. 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[][] matriz = new int[5][2];
        int doble;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = teclado.nextInt();

            }
        }
        for (int i = 0; i < matriz.length; i += 2) {
            System.out.print("Fila " + i + ": ");

            for (int j = 0; j < matriz[0].length; j++) {

                System.out.print(matriz[i][j] + ",");
              
            }

        }System.out.print(" ");
    }
}

//System.out.println(matriz.length);//5
//System.out.println(matriz[0].length);//2
   
//import java.util.Scanner;
//
//public class MatrizFilasPares {
//    public static void main(String[] args) {
//        // Inicializar una matriz de 5x2
//        int[][] matriz = new int[5][2];
//
//        // Introducir 10 números en la matriz
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 2; j++) {
//                matriz[i][j] = scanner.nextInt();
//            }
//        }
//
//        // Visualizar solo las filas pares
//        System.out.println("Salida deseada:");
//        for (int i = 0; i < 5; i += 2) {
//            System.out.print("Fila " + i + ": ");
//            for (int j = 0; j < 2; j++) {
//                System.out.print(matriz[i][j]);
//                if (j < 1) {
//                    System.out.print(", ");
//                }
//            }
//            System.out.println();
//        }

//        // Cerrar el escáner
//        scanner.close();
//    }
//}
