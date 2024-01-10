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
public class Ejercicio4String {

    /**
     * @param args the command line arguments
     */
    //Leer una frase e indicar el número de caracteres totales que contiene. ¿Cuántas son vocales, consonantes,
    //dígitos, espacios en blanco y otro tipo de caracteres? 
//Caracteres: 22. Vocales: 5. Consonantes: 7. Espacios: 1. Digitos: 8. Resto: 1
//Programacion 2021-2022
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String frase1 = teclado.nextLine();

        int contador = 0;
        int contavoc = 0, contadorcon = 0, contadorespacios = 0, contadordedigitos = 0, resto = 0;

        contador = frase1.length();
        //  System.out.println(contador);
        for (int i = 0; i < frase1.length(); i++) {

            if (frase1.charAt(i) == 'a' || frase1.charAt(i) == 'e' || frase1.charAt(i) == 'i' || frase1.charAt(i) == 'o'
                    || frase1.charAt(i) == 'u') {
                contavoc++;
            } else if (Character.isLetter(frase1.charAt(i))) {
                contadorcon++;
            } else if (frase1.charAt(i) == ' ') {

                contadorespacios++;
            } else if (frase1.charAt(i) >= '0' && frase1.charAt(i) <= '9') {

                contadordedigitos++;
            } else {
                resto++;
            }

        }System.out.println("Caracteres: "+contador+". Vocales: "+contavoc+". Consonantes: "+contadorcon+". Espacios: "+contadorespacios+
                ". Digitos: "+contadordedigitos+". Resto: "+resto);

    }

}
