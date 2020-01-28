/*
 * Control de las falta de asistencia de los alumnos. Se dispone de los partes de faltas de los alumnos en el mes de noviembre y se pretende
contabilizar el total de faltas de cada alumno. Se teclearan los partes ´
diarios introduciendo, el codigo del alumno y el n ´ umero de faltas. ´
Cada vez que el usuario nos introduzca datos, le preguntaremos si
desea continuar. Al final daremos el resultado de las faltas obtenidas
excluyendo aquellos que no hayan tenido ninguna. Supondremos a
efectos practicos un m ´ aximo de 5 alumnos en clase. Cogeremos los 5 ´
primeros codigos distintos que introduzcan como correctos, no admi- ´
tiremos ninguno mas
 */
package tema4ejercicio8;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Tema4ejercicio8 {

   
    public static void main(String[] args) {
      /**try{
        int [][] faltas = new int [5][30];
        ingresarfaltas(faltas);
       }catch(NumberFormatException e){
           JOptionPane.showInputDialog("numero no valido");
        
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "faltas" + e.getClass());
       }
       
    
    }

    public static void ingresarfaltas(int[][] faltas) {**/
        boolean programa=false;
     while(!programa)
             {
       try{
        String[] codigos = new String[5];
        for(int x=0;x<5;x++)
        {
            codigos[x]="";
        }
                int[] faltas = new int[5];
                int falta=0;
                String codigo="";
                int contadorcodigos=0;
                String resultado="";
                int condi=0;
        do
        {
            codigo=JOptionPane.showInputDialog("introduce el código del alumno");
            falta=Integer.parseInt(JOptionPane.showInputDialog("introduce el número de faltas"));
            if(falta!=0)
            {
             if(Arrays.asList(codigos).contains(codigo)==false)
            {
                for(int x=0;x<codigos.length;x++)
                {
                    if(codigos[x].isEmpty())
                    {
                        codigos[x]=codigo;
                        contadorcodigos=contadorcodigos+1;
                        faltas[x]=faltas[x]+falta;
                        x=5;
                    }
                }
            }
             else
                 {
                        for(int x=0;x<codigos.length;x++)
                        {
                            if(codigo.equals(codigos[x]))
                            {
                                faltas[x]=faltas[x]+falta;
                           }
                       }
                  }
             
             
        }
            if(contadorcodigos!=5)
                {
                    condi = JOptionPane.showConfirmDialog(null, "¿Quieres continuar?");
                }
        }
        while(condi==0 && contadorcodigos!=5);
        for(int x=0;x<contadorcodigos;x++)
        {
          resultado=resultado+"El alumno con el codigo "+codigos[x]+"' tiene "+faltas[x]+" faltas\n\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
      catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, "ERROR DESCONOCIDO!");
    }
        programa=true;
       
    }
    }
}

