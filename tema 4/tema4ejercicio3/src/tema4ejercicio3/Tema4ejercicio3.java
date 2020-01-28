/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4ejercicio3;
import java.util.Scanner;

public class Tema4ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        char mayusculas[] = new char[26];
        for (int i = 65, j = 0; i <= 90; i++, j++) {
            mayusculas[j] = (char) i;
        }
 
        String cadena = "";
        int eleccion = -1;
 
        do {
            System.out.println("Escoge una letra entre 0 y " + (mayusculas.length - 1));
            eleccion = sc.nextInt();
 
            if (!(eleccion >= 0 && eleccion <= mayusculas.length - 1)) {
                System.out.println("Error, ingrese un num valido");
            } else {
                if (eleccion != -1) {
                    cadena += mayusculas[eleccion];
                }
            }
 
        } while (eleccion != -1);
 
        System.out.println(cadena);
    }
    
}
