/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectounidad2;

/**
 *
 * @author David.P
 */
public class Ejercicio2AMPLI2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int pares = 0, impares = 0;
        int suma = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                pares=i+pares;
            } else {
                impares=i+impares ;
            }

        }
        System.out.printf("Pares suman "+pares+" e impares suman "+impares);
    }

} 
//    public static void main(String[] args) {
//        int sumaPares = 0;
//        int sumaImpares = 0;
//
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) {
//                // Si es par
//                sumaPares += i;
//            } else {
//                // Si es impar
//                sumaImpares += i;
//            }
//        }
//
//        System.out.println("Suma de números pares: " + sumaPares);
//        System.out.println("Suma de números impares: " + sumaImpares);
//    }
//}
