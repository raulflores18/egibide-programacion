/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3ejercicio1;
import java.util.Scanner;
/**
 *
 * @author Raul
 */
public class JavaApplication27 {

     
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Ingrese la frase");
        String cad = sc.nextLine();
        int cantidadVocales = 0;
        for(int i = 0; i < cad.length(); i++){
            char car = cad.charAt(i);
            
            
            if ( car == 'a' || car == 'e' || car == 'i'|| car == 'o'|| car == 'u') {
                cantidadVocales++;
            }
        }
            System.out.println("la cantidad de vocales es:" + cantidadVocales);
        }
    }
    

