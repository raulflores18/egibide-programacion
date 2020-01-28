/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;
import javax.swing.JOptionPane;

public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int contador=0,sumaEdades=0;
      
        int respuest;
      
        do
        {
            int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "escribe una edad"));
            contador++;
            sumaEdades += edad;
           
            respuest = JOptionPane.showConfirmDialog(null, "quieres continuar");
        }
        
        while(respuest == 0);
       
        JOptionPane.showMessageDialog(null, " La media es "+ (sumaEdades/contador));
    }
    
}
    
    

