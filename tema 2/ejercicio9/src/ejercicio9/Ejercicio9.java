/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner Sc=new Scanner(System.in);
 System.out.println("introduce la nota");
 int nota = Sc.nextInt();
 if (nota >= 0 & nota <= 2) 
         System.out.println("muy deficiente");
 if (nota >= 3 & nota <= 4) 
         System.out.println("insuficiente");
    if (nota >= 5 & nota <= 6) 
         System.out.println("suficiente");
    if (nota >= 7 & nota <= 8) 
         System.out.println("bien");
    if(nota >= 9 & nota <= 10)
         System.out.println("sobresaliente");
 
    }
    
}
