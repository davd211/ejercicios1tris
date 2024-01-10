/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectounidad2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author David.P
 */
public class Ejercicio1PatronesAmpli {

    /**
     * @param args the command line arguments
     */
    //Valida con expresiones regulares la dirección de una página web. Empezando por www. 
    // más cualquier caracter seguido de "."  y como mínimo dos caracteres a contuación (del punto)
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String frase1 = teclado.nextLine();
        Pattern p = Pattern.compile("www\\.[a-zA-Z]+\\.[a-zA-Z]{2}");
        Matcher m = p.matcher(frase1);
        if (m.matches()) {

            System.out.print("NIF válido");
        } else {
            System.out.print("NIF no válido");
        }
    }

}
