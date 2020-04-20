
package tema7ejercicio12;
import javax.swing.JOptionPane;
import java.util.regex.*;
public class Tema7ejercicio12 {

    public static void main(String[] args) {
       String dato=JOptionPane.showInputDialog("introduce un numero real negativo");
            if (realn(dato)) {
        JOptionPane.showMessageDialog(null,"el numero esta mamadisimo");
            }else{
         JOptionPane.showMessageDialog(null,"el numero REAL no es real ni negativo");
}   
    }
    public static boolean realn(String negativo){
        Pattern pat=Pattern.compile("^-[0-9]+[.,][0-9]+$");
            Matcher mat=pat.matcher(negativo);
            return mat.matches();
}
    
}
