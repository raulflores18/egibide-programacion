//Desarrolla un programa que solicite al usuario el mes en letra y que
//luego lo valide, es decir, que muestre un mensaje indicando si el mes
//tecleado es correcto o no.
package tema4ejercicio4;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class Tema4ejercicio4 {

    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String[]Array = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
       String mes = JOptionPane.showInputDialog("introduce un mes");
       
       {
           boolean contener = Arrays.asList(Array).contains(mes);
           if(contener)
           {
               JOptionPane.showMessageDialog(null,"el mes " + mes + " es correcto");
           }
           else
           {
               JOptionPane.showMessageDialog(null,"El mes" + mes + " es incorrecto");
           }
          contener = true;
          
          
          
                   
       }
    }
    
}
