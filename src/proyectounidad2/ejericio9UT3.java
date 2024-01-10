/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectounidad2;

/**
 *
 * @author David.P
 */
public class ejericio9UT3 {

 
    public static void main(String[] args) {
        int inicio = 0;
        int fin = 5;
        int cantidadPares = 0;

        for (int i = inicio; i <= fin; i++) {
            if (i % 2 == 0) {
                cantidadPares++;
            }
        }

        System.out.println("Cantidad de números pares: " + cantidadPares);
    }
}

   
