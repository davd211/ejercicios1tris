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
public class Ejercicio2UT4Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);

        int[][] matriz = new int[5][2];
        int doble;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = teclado.nextInt();

            }
        }
        for (int i = 1; i < matriz.length; i +=2) {
            System.out.print("fila " + i + ": ");

            for (int j = 0; j < matriz[0].length; j+=1) {

                System.out.print(matriz[i][j] + ",");
              
            }

        }
    }
}    
    

