/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;
import javax.swing.JOptionPane;

public class Ejercicio11 {

    
    public static void main(String[] args) {
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("introduce el primer numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("introduce el segundo numero"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("introduce el tercer numero"));
        
        
    
        if (n1 > n2 && n1 > n3);
        {
              JOptionPane.showMessageDialog(null, n1 + " es el más grande");
                if (n2 > n3)
              JOptionPane.showMessageDialog(null, n3 + " es el más pequeño");
                 else
              JOptionPane.showMessageDialog(null, n2 + " es el más pequeño");
      
      }
       
      {
              if (n2 > n3)
          {
              JOptionPane.showMessageDialog(null, n2 + " es el más grande");
              if (n1 > n3)
                    JOptionPane.showMessageDialog(null, n3 + " es el más pequeño");
              else
                    JOptionPane.showMessageDialog(null, n1 + " es el más pequeño");
          }
          else
          {
              JOptionPane.showMessageDialog(null, n3 + " es el más grande");
              if (n1 > n2)
                    JOptionPane.showMessageDialog(null, n2 + " es el más pequeño");
              else
                    JOptionPane.showMessageDialog(null, n1 + " es el más pequeño");
          }
       }
    }
}
