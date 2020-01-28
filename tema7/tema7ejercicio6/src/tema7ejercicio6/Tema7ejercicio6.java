
package tema7ejercicio6;
import javax.swing.JOptionPane;
import java.util.regex.*;
public class Tema7ejercicio6 {

    
    public static void main(String[] args) {
        String dato=JOptionPane.showInputDialog("introduce una matricula");
            if (matricula(dato)) {
           JOptionPane.showMessageDialog(null,"la matricula es correctisima");
                }else{
                   JOptionPane.showMessageDialog(null,"te has equivocado mai frien");
                }
    }
    public static boolean matricula(String matricula) {
            Pattern pat=Pattern.compile("^[0-9]{4}[A-Z]{3}$");
            Matcher mat=pat.matcher(matricula);
            return mat.matches();
}
    
}
