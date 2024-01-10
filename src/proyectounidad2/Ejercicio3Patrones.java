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
public class Ejercicio3Patrones {

    /**
     * @param args the command line arguments
     */
    //Validar una cuenta bancaria. Tendrá 2 letras y 20 dígitos. Utilizar expresiones regulares.


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String frase1 = teclado.nextLine();
        Pattern p = Pattern.compile("[a-zA-Z]{2}[1-9]{20}");
        Matcher m = p.matcher(frase1);
        if (m.matches()) {

            System.out.println("CC válida");
        } else {
            System.out.println("CC no válida");
        }

    }

}
