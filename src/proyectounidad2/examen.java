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
public class examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int numero1 = sn.nextInt();
        int numero2 = numero1 * numero1;
        int impares = 0;
        for (int i = numero1; i < numero2 - 1; i++) {
            if (i % 2 != 0) {
                impares += i; //impares = impares + i
                System.out.print(i + " + ");
            }
        }
        for (int i = numero2 - 1; i <= numero2; i++) {
            // esto es para que el último no imprima un
            if (i % 2 != 0) {
                impares += i;
                System.out.print(i + " = ");
            }
        }
        System.out.print(impares);
    }

}
