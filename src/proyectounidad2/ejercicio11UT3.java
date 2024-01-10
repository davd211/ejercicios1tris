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
public class ejercicio11UT3 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, cero = 0;
        double b = 0, c = 0;
        double par = 0, impar = 0;
        do {
            a = teclado.nextInt();
            if (a % 2 == 0) {
                b = b + a;
                par++;
            } else if (a % 3 == 0) {
                c = c + a;
                impar++;
            } else if (a == 0) {
                cero++;
            }

        } while (a != -1);

        System.out.printf("La media de los numeros pares es %.2f.La media de los numeros impares es %.2f.El numero de ceros es %d", b, c, cero);

    }
}
