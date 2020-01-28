/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado;
        Scanner  Sc= new Scanner(System.in);
        System.out.println("dame un numero");
        int a = Sc.nextInt();
        System.out.println("dame un numero");
        int b = Sc.nextInt();
        resultado = a*b;
        System.out.println("resultado:" + a*b);
       
    }
    
}
