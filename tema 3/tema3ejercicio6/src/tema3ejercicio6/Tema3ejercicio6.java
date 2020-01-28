/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3ejercicio6;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.DateTimeException;
public class Tema3ejercicio6 {

  
    public static void main(String[] args) {
        final LocalDate PRIMAVERA = LocalDate.of(2019,3,21);
        final LocalDate VERANO = LocalDate.of(2019,6,21);
        final LocalDate OTOÑO = LocalDate.of(2019,9,21);
        final LocalDate INVIERNO = LocalDate.of(2019,12,21);
        
        boolean error = false;
       do
       {
           try
           {
                int dia = Integer.parseInt(JOptionPane.showInputDialog("ingresa el dia"));
                int mes = Integer.parseInt(JOptionPane.showInputDialog("ingresa el mes"));
                LocalDate fecha = LocalDate.of(2019,mes,dia);
                
                if (fecha.isBefore(PRIMAVERA))
                   JOptionPane.showMessageDialog(null,"Invierno");
               else
                     if (fecha.isBefore(VERANO))
                        JOptionPane.showMessageDialog(null,"Primavera");
                    else
                           if (fecha.isBefore(OTOÑO))
                                JOptionPane.showMessageDialog(null,"Verano");
                           else
                                JOptionPane.showMessageDialog(null,"Otoño");
               error = false;
       
           }
           catch(DateTimeException e)
           {
               JOptionPane.showMessageDialog(null," Valores invalidos para convertirlos en fecha");
               error = true;
           }
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(null,"Problemas");
               error = true;
           }
       }
       while(error);
    }
    
}
