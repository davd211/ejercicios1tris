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
public class Ejercicio5Patrones {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String frase1 = teclado.nextLine();
        Pattern p = Pattern.compile("[XYZ]+[0-9]{7}[a-zA-Z]");
        Matcher m = p.matcher(frase1);
        if (m.matches()) {

            System.out.print("NIF válido");
        } else {
            System.out.print("NIF no válido");
        }

    }

}
