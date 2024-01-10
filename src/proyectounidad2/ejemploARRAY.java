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
public class ejemploARRAY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // int vector[] ={1,2}; // para dclara las variables que van dentro 
        //esto no hace que sea unos vlores fijos sino que en cada cuadrito esta 
        //ese valor, pero no tiene un numero de cuadraditos fijos.
        // si es   int vector[] =int int[2]; esto vale para cedirle el tamaño 
        // del array por lo que en el ejemplo tendra dos cuadristos maximos 
        // para asignar un valor a una posicion en especifico es de la siguiente forma 
        // vector[0]=1;
        // System.out.println(vector.length); // con esto mostramos la longitud de cuadraditos que hay en el vector
        //no la cantida de numeros que hay en el vector.
        // para mostrar el resultado de una posicion es con el sout y dentro de los parentesis poner (vector[0])
        //ejemplo tengo 8 alumnos y vamos a introducir sus notas 
        int notasAlumnos[] = new int[8];
        int contador = 0;
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < notasAlumnos.length; i++) {

            notasAlumnos[i] = teclado.nextInt();
            if (notasAlumnos[i] >= 5) {
                contador++;
            }
           
            
            }
         System.out.println("Numero de aprobados es: "+contador);
            
            for (int i=0; i<notasAlumnos.length;i++){
                System.out.println("alumno"+(i+1)+", nota: "+notasAlumnos[i]);
        }

    }

}
