
package tema7ejercicio1;
import java.util.regex.*;
import javax.swing.JOptionPane;
public class Tema7ejercicio1 {


    public static void main(String[] args) {
        String dato=JOptionPane.showInputDialog("introduce un numero entero");
        
         if (pat(dato)) {
           JOptionPane.showMessageDialog(null,"correcto");
         }else{
            JOptionPane.showMessageDialog(null,"NO");
         }
    }
     public static boolean pat (String texto){
             Pattern pat=Pattern.compile("^-?[0-9]+$");
             Matcher mat=pat.matcher(texto);
             return mat.matches();
         }
    
}
