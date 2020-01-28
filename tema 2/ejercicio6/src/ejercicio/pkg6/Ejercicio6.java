/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg6;
import javax.swing.JOptionPane;


public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio"));
         double area = Math.PI * Math.pow(radio, 2);
        JOptionPane.showMessageDialog(null, "El área de la circunferencia es " + area);
    }
    
}
