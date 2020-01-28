/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg19;
import javax.swing.JOptionPane;

public class Ejercicio19 {

    
    public static void main(String[] args) {
    long nro = Long.parseLong(JOptionPane.showInputDialog(null,"escribe un número"));
        int contador = 0, nroImpar = 1;
        long resultado = 0;
        while(contador < nro)
        {
            resultado = resultado + nroImpar;
            nroImpar = nroImpar + 2;
            contador = contador + 1;
        }
        JOptionPane.showMessageDialog(null,resultado);
        
    }
    
}
