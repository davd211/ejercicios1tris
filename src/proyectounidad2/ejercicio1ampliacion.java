/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectounidad2;

/**
 *
 * @author David.P
 */
public class ejercicio1ampliacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int t=40000, horas, minutos, segundos;

horas= t /3600;
minutos=(t%3600)/60;
segundos=((t%3600)%60)%60;
        System.out.println(horas + " Horas," + minutos+ "  Minutos," + segundos +
                " segundos");

    }
    
}
