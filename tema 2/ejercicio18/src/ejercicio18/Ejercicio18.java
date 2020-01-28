/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

import javax.swing.JOptionPane;


public class Ejercicio18 {

   
    
    public static void main(String[] args) {
         
        int n1 = 1, n2 = 1, n3, contador = 2;
        
         String serie = n1 +" "+  n2 + " ";
        
        int nroFinal = Integer.parseInt(JOptionPane.showInputDialog(null, "dame un numero"));
        while (contador < nroFinal)
        {
            n3 = n1 + n2;
            serie = serie + n3+ " ";
            contador++;
            n1 = n2;
            n2 = n3;
        }
        JOptionPane.showMessageDialog(null, serie);
    }
    
}
