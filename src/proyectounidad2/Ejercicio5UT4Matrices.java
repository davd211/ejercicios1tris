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
public class Ejercicio5UT4Matrices {

    /**
     * @param args the command line arguments
     */
    //Introducir un valor y generar una matriz de ese tamaño. Inicializar las columnas pares con una 'a' y las impares con una 'b'. Visualiza la matriz.
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;
        byte a;//pares 
        byte b ;//impares

        
        
        numero = teclado.nextInt();
        
        int[][] matriz = new int [numero] [numero];
        for (int i = 0; i < matriz.length;i++ ) {
            System.out.print("a");

            for (int j = 0; j < matriz[0].length; i++ ) {
                
                if (j%2==0){
                    System.out.println("b");
                }

               // System.out.print("b"+"a");
              
            }System.out.println(" ");
        }

    }

}
