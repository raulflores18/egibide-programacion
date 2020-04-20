
package tema7ejercicio9;
import javax.swing.JOptionPane;
import java.util.regex.*;
public class Tema7ejercicio9 {

    
    public static void main(String[] args) {
        String dato=JOptionPane.showInputDialog("introduce un numero hexadecimal");
            if (hexadecimal(dato)) {
        JOptionPane.showMessageDialog(null,"el numero hexadecimal esta correctisima");
            }else{
         JOptionPane.showMessageDialog(null,"te has equivocado por decimocuarta vez");
}
    }
    public static boolean hexadecimal(String hexa){
            Pattern pat=Pattern.compile("^[0-9A-F]+$");
            Matcher mat=pat.matcher(hexa);
            return mat.matches();
}
}
