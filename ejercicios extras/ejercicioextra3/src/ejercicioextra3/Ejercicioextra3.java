/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra3;
import javax.swing.JOptionPane;
/**
 *
 * @author Raul
 */
public class Ejercicioextra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n1= 0, n2= 2, n3= 0,n4= 0;
        int n5=0, dividiendo=0, divisor=0;
       int opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu de operaciones"
               + "\n 1-sumar dos numeros"
               + "\n 2-restar dos numeros"
               + "\n 3-Visualizar la tabla de multiplicar de un numero"
               + "\n 4-Visualizar el cociente y el resto de una division"
               + "\n 5-Salir del programa"));
            
       try{      
       switch(opcion){
           case 1:
               double suma= suma(n1,n2);
               JOptionPane.showInputDialog(null, suma);
               break;
            case 2:
               double resta= resta(n3,n4);
               JOptionPane.showInputDialog(null, resta);
               break;
            case 3:
               String tabla= tablamultiplicar(n5);
               break;
            case 4:
             cocienteResto(dividendo,divisor);
               break;
            case 5: 
                break;
            default:
                throw new Exception("numero equivocado");
            }
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e.getMessage());
       }
       
    }
    
}
