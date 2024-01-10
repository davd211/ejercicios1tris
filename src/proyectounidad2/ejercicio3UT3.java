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
public class ejercicio3UT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1,v = 0,num2 ;
        num1=teclado.nextInt();
        num2=teclado.nextInt();


        for (int i=0 ; i <num2; i++) {
          
          v=v+num1;
                  
                  
        }

        System.out.print("El resultado es "+v);

    }

}
  
