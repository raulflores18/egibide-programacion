/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import javax.swing.JOptionPane;
public class Ejercicio15 {

   
    public static void main(String[] args) {
       int contador = 0;
        String respuesta;
        do
        {
            int nota = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa la nota"));
            if (nota >= 6)
                contador = contador + 1;
            do
            {
                respuesta = JOptionPane.showInputDialog(null,"¿deseas continuar?");
            }
            while (respuesta.equalsIgnoreCase("si") == false && respuesta.equalsIgnoreCase("no") == false);
        }
        while(respuesta.equalsIgnoreCase("si"));
        JOptionPane.showMessageDialog(null,"El número de personas aprovadas es "+ contador);
    }
    
}
