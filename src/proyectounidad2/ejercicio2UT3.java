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
public class ejercicio2UT3 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num, numaprob = 0, numerosusp = 0;

        for (int i = 0; i < 5; i++) {
            num = teclado.nextInt();
            if (num >= 5) {
                numaprob++;
            }else { numerosusp++;
            }
        }

        System.out.print(" Aprobados " + numaprob + " Suspensos " + numerosusp);

    }

}
