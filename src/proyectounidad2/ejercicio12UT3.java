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
public class ejercicio12UT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int mult6=0, mult3=0,mult2=0;

        for (int i = 0; i < 5; i++) {

            int a = teclado.nextInt();
       
            
            if (a%6==0){
                mult6++;
        }else if (a%3==0){
                mult3++;
        }else if (a%2==0){
                mult2++;
        }
        

        }
        System.out.printf("Multiplos de 6: %d.Multiplos de 3: %d.Multiplos de 2: %d",mult6,mult3,mult2 );

    }

}
