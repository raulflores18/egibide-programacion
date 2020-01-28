/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;
import javax.swing.JOptionPane;
/**
 *
 * @author Raul
 */
public class Ejercicio13 {

     private static int contador = 0;
    public static int contadorChicos = 0;
  
    static int contadorChicas = 0;
    static int peso;
    static int edad;
    static String nombre;
    static String sexo;
    static float estatura;
    
    public static void main(String[] args) {
         do
       {
           
            JOptionPane.showMessageDialog(null, "Teclea los datos de un alumno");
            peso = Integer.parseInt(JOptionPane.showInputDialog(null,"Teclea el peso"));
            edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Teclea la edad"));
            nombre = JOptionPane.showInputDialog(null,"Teclea el nombre");
            sexo = JOptionPane.showInputDialog(null,"Teclea el sexo");
            estatura = Float.parseFloat(JOptionPane.showInputDialog(null,"Teclea la estatura"));
            
            
            aptoNoApto();
            contador = contador + 1;
       }
       while (contador != 30);
       JOptionPane.showMessageDialog(null, contadorChicos + " " + contadorChicas);
    }
    
   
    public static void aptoNoApto(){
            
       
        if (sexo.compareToIgnoreCase("femenino")==0)
        {
            if (estatura > 1.6 && peso > 60)
                contadorChicas += 1;
        }
        else
          
            if (estatura > 1.7 && peso > 70)
                contadorChicos ++;
       
       
       
       
       
    }
    
}
