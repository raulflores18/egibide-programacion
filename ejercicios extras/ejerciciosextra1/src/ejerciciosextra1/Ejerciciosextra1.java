/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra1;
import javax.swing.JOptionPane;
/**
 *
 * @author Raul
 */
public class Ejerciciosextra1 {

    public static void main(String[] args) {
        int contador = 0;
       int paganormal=10;
       int pagaextra=15;
        int resultado=0;
        int dinero=0;
       String estaCiv="";
       String estudios="";
       String comb="";
      int horas=Integer.parseInt(JOptionPane.showInputDialog("introduce las horas"));
        
       if (horas > 40){
           dinero = (horas-40)*15 + (40*10);  
       }
       estaCiv = JOptionPane.showInputDialog("introduce el estado civil");
       estudios = JOptionPane.showInputDialog("introduce estudios");
       
       comb = estaCiv + estudios;
       
        if ("SP".equals(comb)||"SS".equals(comb)||"VS".equals(comb)||"SM".equals(comb)||"CS".equals(comb)||"VP".equals(comb)||"DS".equals(comb))
        
        {
       
            dinero = dinero + 100;
       
       }
        
            JOptionPane.showMessageDialog(null, "el salario total es "+dinero);
       
       
       
    }
    
    
}
