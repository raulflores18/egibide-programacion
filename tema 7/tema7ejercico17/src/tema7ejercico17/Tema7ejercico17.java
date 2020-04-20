
package tema7ejercico17;
import javax.swing.JOptionPane;
import java.util.regex.*;
public class Tema7ejercico17 {

    public static void main(String[] args) {
         
       String nombre=JOptionPane.showInputDialog("introduce un nombre");
            if (nombrevalido(nombre)) {
        JOptionPane.showMessageDialog(null,"el nombre esta bien");
            }else{
         JOptionPane.showMessageDialog(null,"wey eso no es un nombre");
}   
    }
    public static boolean nombrevalido(String texto) {
            Pattern pat=Pattern.compile("^([A-Z]{1}[a-z]+[ ]?){1,2}$");
            Matcher mat=pat.matcher(texto);
            return mat.matches();
    
}   
}
