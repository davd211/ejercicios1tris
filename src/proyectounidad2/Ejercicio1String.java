/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectounidad2;

/**
 *
 * @author David.P
 */
/**
 * Comprobar si una frase es un palíndromo (frase que el invertirla carácter a
 * carácter, sin tener en cuenta los espacios en blanco ni los acentos, no
 * cambia). “dabale arroz a la zorra el abad”
 *
 * a) Quitarle los espacios en blanco
 *
 * b) Invertirla
 */
public class Ejercicio1String {

    /**
     * @param args the command line arguments
     * @return
     */
    public static void main(String[] args) {

        String frase = "dabale arroz a la zorra el abad";
       frase = frase.replace(" ","");

        for (int i = frase.length() - 1; i < 0; i--) {

            char frasenueva = frase.charAt(i);
            frase = frase + frasenueva;

        }
        
        System.out.println(frase);
    }
}


