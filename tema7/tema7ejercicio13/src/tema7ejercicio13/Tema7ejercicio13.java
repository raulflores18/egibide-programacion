
package tema7ejercicio13;

import javax.swing.JOptionPane;
import java.util.regex.*;

public class Tema7ejercicio13 {

    public static void main(String[] args) {
        int num_decimales = 0;
        String texto=JOptionPane.showInputDialog("introduce un numero real con decimales");
            if (realdecimales(texto,num_decimales)) {
        JOptionPane.showMessageDialog(null,"el numero esta overpower");
            }else{
         JOptionPane.showMessageDialog(null,"el numero REAL no tiene ningun decimal");
}      
    }
    
    public static boolean realdecimales(String texto, int num_decimales) {
    if (num_decimales > 0) {
        return texto.matches("^-?[0-9]+[.,][0-9]{1," + num_decimales + "}?$");
    } else {
        return false;
    }
 
}
}
