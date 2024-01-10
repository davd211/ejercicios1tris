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
public class pizarra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int []  [] matriz = new int [4] [2];
Scanner tec = new Scanner(System.in);

        for (int[] matriz1 : matriz) {
            System.out.println("Introduce el valor del sueldo y edad del empleado");
            for (int j = 0; j<matriz[0].length; j++) {
                matriz1[j] = tec.nextInt();
            }
        }
    }
    
}
