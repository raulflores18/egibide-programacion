/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecicioextra2;
import javax.swing.JOptionPane;
public class Ejecicioextra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      boolean visual , cobol, java, sql;
      visual=Boolean.parseBoolean(JOptionPane.showInputDialog("eres apto en visualnet? (true or false)"));
      cobol=Boolean.parseBoolean(JOptionPane.showInputDialog("eres apto en cobol?(true or false)"));
      java=Boolean.parseBoolean(JOptionPane.showInputDialog("eres apto en java?(true or false)"));
      sql=Boolean.parseBoolean(JOptionPane.showInputDialog("eres apto en sql?(true or false)"));
      if(visual==true && cobol==true && java== true && sql==true){
          JOptionPane.showMessageDialog(null, "Sobresaliente");
          
      }else{
            if((visual==false && cobol==true && java==true && sql==true)||(visual==true && cobol==true && java==false && sql==true)){
          JOptionPane.showMessageDialog(null, "notable");
        }else{
                 if(visual==false && cobol==true && java==false && sql==true){
                 JOptionPane.showMessageDialog(null, "bien");
                  }else{
                      if((visual==true && cobol==false && java==false && sql==true)||(visual==false && cobol==false && java==true && sql==true)||(visual==false && cobol==false && java==false && sql==true)){
                         JOptionPane.showMessageDialog(null, "suficiente");
                      }else{
                          if((visual==true && cobol==true && java==false && sql==false)||(visual==false && cobol==true && java==true && sql==false)||(visual==false && cobol==true && java==false && sql==false)){
                              JOptionPane.showMessageDialog(null, "suficiente");
                          }else{
                               JOptionPane.showMessageDialog(null,"los datos introducidos no son correctos");
                          }
                      }
                 }
                 
             }
        }

    }   
}