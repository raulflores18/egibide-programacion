/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;
    import java.util.Scanner;
/**
 *
 * @author Raul
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner Sc= new Scanner  (System.in);
     System.out.println("introduce el numero dia");
     int dia= Sc.nextInt();
     switch(dia){
         case 1:
             System.out.println("Lunes");
             break;
         case 2:
             System.out.println("Martes");
             break;
         case 3:
             System.out.println("Miercoles");
             break;
         case 4:
             System.out.println("Jueves");
             break;
         case 5:
             System.out.println("Viernes");
             break;
         case 6:
             System.out.println("Sabado");
             break;
         case 7:
             System.out.println("Domingo");
             break;
         default:
             System.out.println("el dia introducido no es correcto");
     }
    }
    
}
