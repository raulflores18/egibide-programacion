
package tema7ejercicio3;
import javax.swing.JOptionPane;
import java.util.regex.*;
public class Tema7ejercicio3 {

   
    public static void main(String[] args) {
        String dato=JOptionPane.showInputDialog("introduce un numero entero negativo");
            if (numeronegativo(dato)) {
           JOptionPane.showMessageDialog(null,"estas bien spartan");
                }else{
                   JOptionPane.showMessageDialog(null,"usted no entiende verdad?");
                }
    }
    
    private static boolean numeronegativo(String texto) {
         Pattern pat=Pattern.compile("^-[0-9]+$");
             Matcher mat=pat.matcher(texto);
             return mat.matches();
    }
}
