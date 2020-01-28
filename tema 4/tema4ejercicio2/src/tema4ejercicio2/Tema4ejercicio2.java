/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4ejercicio2;
import javax.swing.JOptionPane;

public class Tema4ejercicio2 {

    
    public static void main(String[] args) {
       
        String texto = JOptionPane.showInputDialog("ingresa un tamaño indicado");
        int num [] = new int[Integer.parseInt(texto)];
        
        rellenarNumAleatorioArray(num, 0, 9);
        
        mostrarArray(num);
    }
    public static void rellenarNumAleatorioArray(int num[], int a, int b){
        for(int x = 0; x < 10; x++){
            num[x] = ((int)Math.floor(Math.random()*(a-b)+b));
        }
    }
    public static void mostrarArray(int num[]){
        for(int x = 0; x < 10; x++){
            System.out.println("En el indice "+x+" esta el valor "+num[x]);
            
        }
    }
    
}
