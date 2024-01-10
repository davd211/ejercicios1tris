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
public class Ejercicio8String {

    /**
     * @param args the command line arguments
     */
    //Dada una cadena, indica el número de palabras que tiene
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String frase = teclado.nextLine();

        int contador = 1;//el contador empieza en 1 porque al final de la frase no añade ningun espacio 

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == ' ') {

                contador++;
            }

        }

        System.out.print("Número de palabras: "
                + contador);

    }

}
