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
public class Ejercicio3UT4Matrices {

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
      

 System.out.print("columna 1: "+matriz[0][1]+","+matriz[1][1]+","+matriz[2][1]+","+matriz[3][1]+","+matriz[4][1]+",");
            }

        }
    

