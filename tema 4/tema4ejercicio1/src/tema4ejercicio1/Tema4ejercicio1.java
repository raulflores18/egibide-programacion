/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4ejercicio1;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class Tema4ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cantidadMinima = 0;
        double cantidadMaxima = 0;
        double[] miArray = new double[10]; 
            for(int x = 0; x < 10; x++)
               miArray[x]= Double.parseDouble(JOptionPane.showInputDialog("Posicion:"  + x +  "Contenido" + miArray[x]));
               JOptionPane.showInputDialog("introduce los numeros");
    }
    
}
