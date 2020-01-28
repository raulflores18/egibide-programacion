
package tema4ejercicio6;
import javax.swing.JOptionPane;

public class Tema4ejercicio6 {

      public static void main(String[] args) {
          int mayusculas[] = new int[26];
        String cadena;
        for (int i = 65, j = 0; i <= 90; i++, j++) {
            mayusculas[j] = (char) i;
            boolean = correcto;
        try{
            JOptionPane.showInputDialog("ingresa la frase");
            
              
        }catch(isBlanco e){
             JOptionPane.showMessageDialog(null, "letras no numeros");
                correcto=true;
        }catch(NumberFormatException e){
             JOptionPane.showMessageDialog(null, "letras no numeros");
                 correcto=true;
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "ERRORES");
                 correcto=true;
        }
          
        
      
     
        
      
}
}

