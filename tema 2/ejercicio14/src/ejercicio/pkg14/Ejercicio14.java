/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg14;
import javax.swing.JOptionPane;
/**
 *
 * @author Raul
 */
public class Ejercicio14 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma=0;
        String numero = null;
        int num=0;
        for(int cont=0;cont<10;cont++){
         
        
        numero= JOptionPane.showInputDialog("introduce los numeros");
        num= Integer.parseInt(numero);
        suma=suma+num;
        }
    
        JOptionPane.showMessageDialog(null,"el resultado es"+suma);
    
}
}
