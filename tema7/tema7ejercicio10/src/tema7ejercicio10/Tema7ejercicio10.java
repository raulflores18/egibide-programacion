
package tema7ejercicio10;
import javax.swing.JOptionPane;
import java.util.regex.*;
public class Tema7ejercicio10 {

    public static void main(String[] args) {
      String dato=JOptionPane.showInputDialog("introduce un numero real");
            if (real(dato)) {
        JOptionPane.showMessageDialog(null,"el numero esta mamadisimo");
            }else{
         JOptionPane.showMessageDialog(null,"el numero REAL no es real");
}  
    }
   public static boolean real(String texto){
     Pattern pat=Pattern.compile("^-?[0-9]+([\\.,][0-9]+)?$");
            Matcher mat=pat.matcher(texto);
            return mat.matches();
} 
}
