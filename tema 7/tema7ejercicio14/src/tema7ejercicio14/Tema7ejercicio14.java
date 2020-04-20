
package tema7ejercicio14;
import javax.swing.JOptionPane;
import java.util.regex.*;

public class Tema7ejercicio14 {

    public static void main(String[] args) {
        int num_decimales = 0;
        String texto=JOptionPane.showInputDialog("introduce un numero real con decimales positivo");
            if (realdecimalesp(texto,num_decimales)) {
        JOptionPane.showMessageDialog(null,"el numero esta overpower");
            }else{
         JOptionPane.showMessageDialog(null,"el numero REAL no tiene ningun decimal");
}      
    }
    
    public static boolean realdecimalesp(String texto, int num_deciamales) {
    if (num_deciamales > 0) {
        return texto.matches("^[0-9]+[\\.,][0-9]{1," + num_deciamales + "}?$");
    } else {
        return false;
    }
    
    }
    
}
