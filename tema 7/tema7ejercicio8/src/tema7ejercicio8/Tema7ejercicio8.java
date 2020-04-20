
package tema7ejercicio8;
import javax.swing.JOptionPane;
import java.util.regex.*;
public class Tema7ejercicio8 {

    public static void main(String[] args) {
        String dato=JOptionPane.showInputDialog("introduce un numero octal");
            if (octal(dato)) {
        JOptionPane.showMessageDialog(null,"el numero octal correctisima");
            }else{
         JOptionPane.showMessageDialog(null,"te has equivocado por decimotercera vez");
}
 }
    public static boolean octal(String octal){
     Pattern pat=Pattern.compile("^[0-7]+$");
            Matcher mat=pat.matcher(octal);
            return mat.matches();
     
}
}
