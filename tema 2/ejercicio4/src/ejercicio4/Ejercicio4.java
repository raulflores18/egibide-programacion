/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int resultado;
        Scanner  Sc= new Scanner(System.in);
        System.out.println("introduce las diagonales");
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        resultado = a*b/2;
        System.out.println("resultado: " + a*b/2);
    }
    
}
