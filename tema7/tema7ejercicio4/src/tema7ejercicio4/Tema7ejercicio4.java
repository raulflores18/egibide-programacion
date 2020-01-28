
package tema7ejercicio4;
import javax.swing.JOptionPane;
import java.util.regex.*;

public class Tema7ejercicio4 {


    public static void main(String[] args) {
         String dato=JOptionPane.showInputDialog("introduce un dni");
            if (numeronegativo(dato)) {
           JOptionPane.showMessageDialog(null,"estas bien spartan");
                }else{
                   JOptionPane.showMessageDialog(null,"usted no entiende verdad?");
                }
    }
    
    private static boolean numeronegativo(String texto) {
         Pattern pat=Pattern.compile("^[0-9]{8}[a-z]+$");
             Matcher mat=pat.matcher(texto);
             return mat.matches();
    }
    
    
}
