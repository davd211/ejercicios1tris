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
//Buscar en una cadena un patrón que comience por CA, a continuación de 0 a más dígitos y cualquier carácter. Utilizar expresiones regulares. 
public class ejericio1Patrones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String pattern;

        String frase1 = teclado.nextLine();

        Pattern p = Pattern.compile("CA[0-9][a-zA-Z]");
        Matcher m = p.matcher(frase1);
        if (m.matches()) {

            System.out.println("Si, contiene el patrón");
        } else {
            System.out.println("No, no contiene el patrón");
        }
    }

}
