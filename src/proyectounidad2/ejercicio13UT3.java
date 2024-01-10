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
public class ejercicio13UT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String h = null;
        double hombre = 0, mujer = 0;
        String m = null;
        double porcentaje = 0;
        for (int i = 0; i < 2; i++) {

            String nombre = teclado.next();
            char sexo = teclado.next().charAt(0);

            if (sexo == 'h') {
                hombre++;
            }
            if (sexo == 'm') {
                mujer++;
            }

        }
        porcentaje = (hombre + mujer) / 100;
        
        hombre = hombre / porcentaje; 
        mujer = mujer / porcentaje;
        System.out.printf("Porcentaje Mujeres %.2f%%.Porcentaje Hombres %.2f%%", hombre, mujer );
       
    }

}
