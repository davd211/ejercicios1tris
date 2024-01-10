/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectounidad2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author David.P
 */
public class ejercicio8UT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        try {

            int a = teclado.nextInt();
            if (a > 0) {
                System.out.println("Es mayor que 0");
            } else if (a < 0) {
                System.out.println("Es menor que 0");
            } else {
                System.out.println("Es 0");
                
            }
        } catch (InputMismatchException ex) {
            
                            System.out.println("Tipo de error " + ex.getMessage());}

        }

    }
