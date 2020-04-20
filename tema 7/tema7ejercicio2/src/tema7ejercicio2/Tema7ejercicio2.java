
package tema7ejercicio2;
import javax.swing.JOptionPane;
import java.util.regex.*;

public class Tema7ejercicio2 {

 
    public static void main(String[] args) {
        String dato=JOptionPane.showInputDialog("introduce un numero entero");
            if (pat(dato)) {
           JOptionPane.showMessageDialog(null,"estas bien compi");
                }else{
                   JOptionPane.showMessageDialog(null,"estas mal wey");
                }
    }

    private static boolean pat(String texto) {
         Pattern pat=Pattern.compile("^[0-9]+$");
             Matcher mat=pat.matcher(texto);
             return mat.matches();
    }
}
