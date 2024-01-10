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
public class Ejercicio3UT4 {

    /**
     * @param args the command line arguments
     */
    //Introducir 5 números en un array y visualizar cuántos son menores que el último valor introducido
    public static void main(String[] args) {

        int[] matriz = new int[5];
        int menor = 0;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = teclado.nextInt();

        }
          for (int i = 0; i<matriz.length-1; i++) {
            if (matriz[i]<matriz[matriz.length-1])
                menor++;
                
            
        } 
        
        
        
        System.out.printf("Hay %d mayores que el último",menor); 
    }

}
