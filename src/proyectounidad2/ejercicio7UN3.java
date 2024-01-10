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
public class ejercicio7UN3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1; 
        int i = 0;

 

        for (int z=0; z<5; z++ ){
        
        num1 = teclado.nextInt();
        if(num1%5==0){
        i++;
        }
            
        }
            
            
       
        System.out.print("Multiplos de 5: " + i);

    }

}
