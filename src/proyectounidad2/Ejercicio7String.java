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
public class Ejercicio7String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String frase1 = teclado.nextLine();
        String frase2 = teclado.nextLine();
        String resultado = "";
//        StringBuffer resultado = new StringBuffer();
        int stringfinal = frase1.length() + frase2.length();

        for (int i = 0; i < frase2.length(); i++) {

            resultado = resultado + frase1.charAt(i) + frase2.charAt(i);

        }

        for (int i = frase2.length(); i < frase1.length(); i++) {

            resultado = resultado + frase1.charAt(i);

        }

        System.out.print("Intercalada: " + resultado);
    }
}
