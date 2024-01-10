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
public class ejercicio1Ampli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String nombre = teclado.next();
            int nota = teclado.nextInt();
            if (nota < 5) {
                System.out.print(nombre+" SUSPENSO,");
            }else if (nota==5){
                System.out.print(nombre+" SUFICIENTE,");
            }else {
                System.out.print(nombre+" APROBADO,");
            }
        }

    }

}
