/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int resultado;
        Scanner  Sc= new Scanner(System.in);
        System.out.println("dame una altura");
        int h = Sc.nextInt();
        System.out.println("dame una base");
        int b = Sc.nextInt();
        resultado = 2*h+2*b;
        System.out.println("resultado es: " + resultado);
    }
    
}
