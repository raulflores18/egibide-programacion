
package tema7ejercicio20;
import javax.swing.JOptionPane;
import java.util.regex.*;
public class Tema7ejercicio20 {

    public static void main(String[] args) {
        String ISBN=JOptionPane.showInputDialog("ingresa el isbn");
            if(ISBNValido(ISBN)){
                JOptionPane.showMessageDialog(null,"el libro que buscas esta disponible");
            }else{
                JOptionPane.showMessageDialog(null,"ese libro ni existe en este mundo");
            }
    }
    
    public static boolean ISBNValido (String i){
        Pattern pat=Pattern.compile("^(978|979)[0-9]{10}$");
            Matcher usu=pat.matcher(i);
            return usu.matches();
    } 
    
}
