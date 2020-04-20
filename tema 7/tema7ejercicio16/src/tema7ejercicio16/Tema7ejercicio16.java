
package tema7ejercicio16;
import javax.swing.JOptionPane;
import java.util.regex.*;

public class Tema7ejercicio16 {

    public static void main(String[] args) {
       String dato=JOptionPane.showInputDialog("introduce una fecha");
            if (fecha(dato)) {
        JOptionPane.showMessageDialog(null,"la fecha esta bien");
            }else{
         JOptionPane.showMessageDialog(null,"wey eso no es una fecha");
}   
    }
    
    public static boolean fecha(String texto) {
        Pattern pat=Pattern.compile("^(0?[1-9]|[12][0-9]|3[01])[\\/](0?[1-9]|1[012])[/\\/](19|20)\\d{2}$");
            Matcher mat=pat.matcher(texto);
            return mat.matches();
}
    
}
