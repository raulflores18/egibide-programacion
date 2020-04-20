
package tema7ejercicio19;
import javax.swing.JOptionPane;
import java.util.regex.*;
public class Tema7ejercicio19 {

    public static void main(String[] args) {
        String usuario=JOptionPane.showInputDialog("ingresa tu nombre de usuario de twitter");
                if (usuariovalido(usuario)) {
        JOptionPane.showMessageDialog(null,"el usuario si es conocido");
            }else{
         JOptionPane.showMessageDialog(null,"wey eso es de twitter?");
    }
    
}

    public static boolean usuariovalido (String usua){
        Pattern pat=Pattern.compile("^@([A-Za-z0-9_]{1,15})$");
            Matcher usu=pat.matcher(usua);
            return usu.matches();
    }
}
