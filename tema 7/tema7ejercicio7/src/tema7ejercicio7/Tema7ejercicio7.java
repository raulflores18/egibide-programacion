
package tema7ejercicio7;
import javax.swing.JOptionPane;
import java.util.regex.*;
public class Tema7ejercicio7 {

    
    public static void main(String[] args) {
       String dato=JOptionPane.showInputDialog("introduce un numero binario");
            if (binario(dato)) {
           JOptionPane.showMessageDialog(null,"la ip es correctisima");
                }else{
                   JOptionPane.showMessageDialog(null,"me estas desesperando");
                }
    
    }
    
    public static boolean binario(String binario){
     Pattern pat=Pattern.compile("^[0-1]+$");
            Matcher mat=pat.matcher(binario);
            return mat.matches();
   
}
}
