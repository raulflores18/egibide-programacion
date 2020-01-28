
package tema7ejercicio11;
import javax.swing.JOptionPane;
import java.util.regex.*;
public class Tema7ejercicio11 {

   
    public static void main(String[] args) {
      String dato=JOptionPane.showInputDialog("introduce un numero real positivo");
            if (realp(dato)) {
        JOptionPane.showMessageDialog(null,"el numero esta mamadisimo");
            }else{
         JOptionPane.showMessageDialog(null,"el numero REAL no es real");
}  
    }
    
    public static boolean realp(String texto) {
         Pattern pat=Pattern.compile("^[0-9]+([\\.,][0-9]+)?$");
            Matcher mat=pat.matcher(texto);
            return mat.matches();
}
    
}
