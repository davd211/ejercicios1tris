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
public class Ejercicio9Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String frase1 = teclado.nextLine();

        int contador = 0;
        int numeroa = 0, numeroe = 0, numeroi = 0, numeroo = 0, numerou = 0;

        contador = frase1.length();
        //  System.out.println(contador);
        for (int i = 0; i < frase1.length(); i++) {

            if (frase1.charAt(i) == 'a' ) {
                numeroa++;
            } else if (frase1.charAt(i) == 'e') {
                numeroe++;
            } else if (frase1.charAt(i) == 'i') {
                numeroi++;
            }else if ( frase1.charAt(i) == 'o'){
                numeroo++;
            }else if (frase1.charAt(i) == 'u'){
                numerou++;
            }
        }System.out.println("Número de a: "+numeroa+", numero de e: "+numeroe+" numero de i: "+numeroi+", numero de o: "+numeroo+" , número de u: "+numerou );

    }

}


//Número de a: 3, numero de e: 0 numero de i: 1, numero de o: 2, número de u: 0
