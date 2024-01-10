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
public class ejercicio5UT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num1 = teclado.nextInt();
        double num2 = teclado.nextInt();

        double resultadonum2, resultado;

        resultadonum2 = num2 / 100;
        

        resultado = num1 * resultadonum2;
        System.out.println(resultado);
    }

}
