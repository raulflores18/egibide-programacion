
package tema6ejercicio1;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import circunferencia.*;
import excepcion.*;
public class Tema6ejercicio1 {

    public static void main(String[] args) {
      try
      {
          double r = Double.parseDouble(JOptionPane.showInputDialog("teclea un numero"));
          if ( r <= 0)
              throw new novalido();
          
          Radio c = new Radio();
          c.setRadio(r);
          
          DecimalFormat df = new DecimalFormat("#.00");
          JOptionPane.showMessageDialog(null,"los datos de la circunferencia son:"+
                  "\n longitud: "+ df.format(c.getLongitud())+
                  "\n Area:" + df.format(c.getArea())+
                  "\n volumen: "+ c.getVolumen());
      }
      catch(NumberFormatException e)
      {
           JOptionPane.showMessageDialog(null,"error, el dato es de tipo numerico");
      }
      catch(novalido e)
      {
          JOptionPane.showMessageDialog(null,"error, el dato es incorrecto");
      }
      catch(Exception e)
      {
         JOptionPane.showMessageDialog(null,"error" + e.getMessage()); 
      }
    }
    
}
