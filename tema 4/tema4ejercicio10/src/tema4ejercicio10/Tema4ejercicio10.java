
package tema4ejercicio10;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Tema4ejercicio10 {

  private static int matriz[][];
  
    public static void main(String[] args) {
           try{
                matriz = new int[4][4];
                int opcion=0;
                boolean inserta = false;
                while(opcion != 7)
                {
                    opcion=menu();
                       switch(opcion)
                     {
                           case 1:
                               insertar();
                               inserta = true;
                               break;
                           case 2:
                               if (inserta)
                                   sumarfila();
                               else
                                   throw new Datoerroneo();
                               break;
                           case 3:
                               if (inserta)
                                   sumarcolumna();
                               else
                                   throw new Datoerroneo();
                               break;
                           case 4:
                               if (inserta)
                                   sumardiagonalprimaria();
                                else
                                   throw new Datoerroneo();
                               break;
                           case 5:
                               if (inserta)
                                 sumardiagonalsecundaria();
                                else
                                   throw new Datoerroneo();
                               break;
                           case 6:
                               if (inserta)
                                 calcularmedia();
                                else
                                   throw new Datoerroneo();
                               break;
                           default:
                               throw new Datoerroneo();
                                   
                           
                       }
                }
            }catch(Exception e)
            {
            JOptionPane.showMessageDialog(null, "Problemas desconocidos " + e.getMessage());
            }
    }
    public static int menu() throws Exception
    {
        int opcion = 0;
        boolean correcto;
        do
        {
            try
            {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"1.introduce los numeros "
                        + "\n 2.sumar fila"
                        + "\n 3.sumar columna"
                        + "\n 4.sumar diagonal primaria"
                        + "\n 5.sumar diagonal secundaria"
                        + "\n 6.la media de los valores de la matriz"
                        + "\n 7.salir"));
                correcto = true;
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Debes escribir un número");
                correcto = false;
            }
        }
        while (!correcto);
        return opcion;
    }
    public static void insertar() throws Exception
    {
        for(int x = 0; x < matriz.length; x++)
            for(int y=0; y < matriz[x].length; y++)
            matriz[x][y] = pedirnumero("ingresa el número de la fila " + x + " y columna " + y);
    }
    
     public static int pedirnumero(String mensaje) throws Exception{
       boolean correcto;
       int num=0;
       do{
           try
           {
               num=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                correcto = true;
           }catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "tiene que ser un numero");
                correcto = false;
       }
          
       }while(!correcto);
       
       return num;
       }
  
    public static void sumarfila() throws Exception{
        
       boolean error = false;
        do
           {
               try
               {
                int fila=pedirnumero ("dame un numero de (0-3)");
                 if (fila < 0 || fila > 3)
                     throw new Datoerroneo();
                 int suma = 0;
                 for(int x = 0; x < matriz[fila].length; x++)
                     suma+=matriz[fila][x];
                 JOptionPane.showMessageDialog(null, "la suma total" + "es igual a" +suma);
                 error = false;
               }
               catch(Datoerroneo e)
               {    
                   JOptionPane.showMessageDialog(null, "La columna pedida no es correcta o no existe");
                error = true;
               }  
            }
        while(error);
        }
    
    
    public static void sumarcolumna() throws Exception{
        boolean error = false;
        do
        {
            try
            {
                 int col=pedirnumero("introduce el número de la columna (0-3)");
                 if (col < 0 || col > 3)
                     throw new Datoerroneo();
                 int suma = 0;
                 for(int x = 0; x < matriz[0].length; x++)
                     suma+=matriz[x][col];
                 JOptionPane.showMessageDialog(null, " La suma de todos los números de la columna " + col + " es igual a " + suma);
                 error = false;
            }
            catch(Datoerroneo e)
            {
                JOptionPane.showMessageDialog(null, "La columna indicada no es correcta");
                error = true;
            }
        }
        while(error);
    }
   

    public static void sumardiagonalprimaria() throws Exception {
    int suma = 0;
    for(int x = 0;x < matriz.length; x++)
        suma+=matriz[x][x];
    JOptionPane.showMessageDialog(null, " La suma de la diagonal primaria es igual a " + suma);
    }
    
    public static void sumardiagonalsecundaria() throws Exception{
        int suma = 0;
        for(int x = 0,y=3; x <=0; x++,y--)
            suma+=matriz[x][y];
        JOptionPane.showMessageDialog(null, " La suma de la diagonal inversa es igual a " + suma);
    }
    
    public static void calcularmedia() throws Exception{
        int suma = 0;
        for(int x = 0; x < matriz.length; x++)
            for(int y = 0; y < matriz[x].length; y++)
                suma+=matriz[x][y];
        int media = suma/(matriz.length * matriz[0].length);
        JOptionPane.showMessageDialog(null, " La media es igual a " + media);
    }
    
    public static void Salir(){
        System.exit(0);
    }
}
                
            
                
        
    

            
                
                
            
        
        
