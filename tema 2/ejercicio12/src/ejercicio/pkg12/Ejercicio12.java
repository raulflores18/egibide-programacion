/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg12;
import javax.swing.JOptionPane;
/**
 *
 * @author Raul
 */
public class Ejercicio12 {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
  double importe;
        int consumo = Integer.parseInt(JOptionPane.showInputDialog(null,"Teclea el consumo mensual"));
        if (consumo > 300)
        {
            if (consumo > 500)
            {
                importe = 300 * 0.03 + (consumo - 300) * 0.02;
                
                if (consumo > 800)
                    importe = importe - (importe * 1.25)/100;
            }
            else
                
                importe = consumo * 0.03;
        } 
        else
            
            importe = consumo * 0.04;
        
        JOptionPane.showMessageDialog(null, importe);
    }
    
}  
    



