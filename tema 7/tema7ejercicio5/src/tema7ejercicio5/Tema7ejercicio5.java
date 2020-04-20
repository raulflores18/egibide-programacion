
package tema7ejercicio5;
import javax.swing.JOptionPane;
import java.util.regex.*;
public class Tema7ejercicio5 {

   
    public static void main(String[] args) {
       String dato=JOptionPane.showInputDialog("introduce una ip");
            if (escogerip(dato)) {
           JOptionPane.showMessageDialog(null,"la ip es correctisima");
                }else{
                   JOptionPane.showMessageDialog(null,"me estas desesperando");
                }
    }
    public static boolean escogerip(String ip){
     Pattern pat=Pattern.compile("^(([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]).){3}([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
     Matcher mat=pat.matcher(ip);
     return mat.matches();

}
    
}
