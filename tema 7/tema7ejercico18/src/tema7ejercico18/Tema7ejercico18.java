
package tema7ejercico18;
import javax.swing.JOptionPane;
import java.util.regex.*;
public class Tema7ejercico18 {

    public static void main(String[] args) {
     String nombre=JOptionPane.showInputDialog("introduce un email");
            if (emailvalido(nombre)) {
        JOptionPane.showMessageDialog(null,"el email esta bien");
            }else{
         JOptionPane.showMessageDialog(null,"wey eso no es un email");
}      
    }
    
    public static boolean emailvalido(String email) {
            Pattern pat=Pattern.compile("^([\\w-]+\\.)*?[\\w-]+@[\\w-]+\\.([\\w-]+\\.)*?[\\w]+$");
            Matcher mat=pat.matcher(email);
            return mat.matches();
}
}
