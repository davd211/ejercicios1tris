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
public class Prueba {

    /**
     * @param args the command line arguments
     */
    //Programa que lea 9 números sobre un vector, multiplique cada uno de los elementos por 2 y visualice el contenido del vector.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] matriz = new int[9];
        int numeromult;

        for (int i = 0; i < matriz.length; i++) {
             matriz[i] = teclado.nextInt();

        }
        for (int i=0;i<matriz.length;i++){
        matriz[i]=matriz[i]*2;
            System.out.println(matriz[i]);
        }
    }

}
