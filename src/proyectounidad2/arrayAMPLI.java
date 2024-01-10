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
public class arrayAMPLI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
int [] array = new int [8];

for (int i=0; i < array.length; i++){

    array[i] = teclado.nextInt();
    
}
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            
        }



    }
    
}
