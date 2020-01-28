/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3ejercicio2;
import java.util.Scanner;

public class Tema3ejercicio2 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la frase");
        String cadena = sc.nextLine();
         String cadenaInvertida = "";
         for (int i = cadena.length() - 1 ; i >= 0; i--) {
            char car = cadena.charAt(i);
            cadenaInvertida = cadenaInvertida + car;
    }
    System.out.println("La cadena invertida es: " + cadenaInvertida);
    }     
    
}
