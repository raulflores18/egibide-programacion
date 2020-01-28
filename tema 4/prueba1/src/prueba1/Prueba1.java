/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Raul
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int DNI = 23;
       
           int opcion=Integer.parseInt(JOptionPane.showInputDialog("introduce que quieres hacer"
                    + "\n 1-validacionDNI"
                    + "\n 2-fecha"
                    + "\n 3-hora"
                    + "\n 4-frase"
                    + "\n 5-nota"
                   +  "\n 6-salir"));
        
        
        switch(opcion){
            case 1:validacionDNI();
                break;
            case 2:fecha();
                break;
            case 3:hora();
                break;
            case 4:frase();
                break;
            case 5:notas();
                break;
            case 6:Salir();                
        }
        
    }
    
    public static void validacionDNI(){
       try{
            String dni=JOptionPane.showInputDialog("introduce el dni");
                if (dni.length()!=9){
                    throw new dninovalido();
                }
                JOptionPane.showMessageDialog(null,"el dni es correcto");
        }catch(dninovalido e){
              JOptionPane.showMessageDialog(null, "el dni no es valido");
        }catch(Exception e){
            
        }  
    }
    public static void fecha(){
        try{
            
        }catch(Exception e){
            
        }
        
    }
    public static void hora(){
        try{
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
            
            String hora1String = JOptionPane.showInputDialog("Introduzca la primera hora con el formato: HH:mm");
            
            String hora2String = JOptionPane.showInputDialog("Introduzca la primera hora con el formato: HH:mm");
            
            

        }catch(Exception e) {
            
        }
    }
    public static void frase(){
        
            String cadena = JOptionPane.showInputDialog("introduce una frase");
            invertirCadena(cadena);
    }
     public static void invertirCadena(String cadena){
        String cadenaInvertida="";
        for(int y = cadena.length()-1; y >= 0; y--)
        {
            cadenaInvertida = cadenaInvertida + cadena.charAt(y);
        }
        JOptionPane.showMessageDialog(null, " La cadena invertida es " + cadenaInvertida);
    }
   
    
    public static void notas(){
      int continuar = 0;
        int media = 0;
        int cont = 0 ;
        do{
            int nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota del alumno"));
            media = media + nota;
            cont ++;
            continuar = JOptionPane.showConfirmDialog(null, "Quieres continuar?");
        }while(continuar != 1);
        
        JOptionPane.showMessageDialog(null, "La media es: " + (media/cont));   
    }
    public static void Salir(){
        System.exit(0);
    }
}
