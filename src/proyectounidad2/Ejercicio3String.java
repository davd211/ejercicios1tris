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
public class Ejercicio3String {

    /**
     * @param args the command line arguments
     */
    //Dadas dos cadenas de caracteres, muestra la más larga
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String frase1 = teclado.nextLine();
        String frase2 = teclado.nextLine();

        int contador1 = 0, contador2;

        contador1 = frase1.length();

        contador2 = frase2.length();
        
        if (contador1<contador2){
        
            System.out.print("La cadena más larga es: "+ frase1);
        }else {
            System.out.print("La cadena más larga es: "+frase2);
        }
        

    }

}
