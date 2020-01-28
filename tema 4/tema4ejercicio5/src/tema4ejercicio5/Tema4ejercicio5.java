/*Desarrolla un programa que pida los litros de agua ca´ıdos durante un
ano determinado (d ˜ ´ıa, mes y litros). Cuando el usuario nos indique
que no quiere continuar, debemos mostrar lo que ha llovido en cada
uno de los meses del ano. Todos lo datos de entrada son num ˜ ericos y ´
suponemos que correctos.
 *
 */
package tema4ejercicio5;
import javax.swing.JOptionPane;


public class Tema4ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean programa = false;
              while(!programa){
        try{
        double[] arraylitros = new double[12]; 
        String cadena="";
        String[]meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        
            int[] myArray = new int[11];
            for(int x = 0; x < 11; x++)
               do
                {
                    int dia = Integer.parseInt(JOptionPane.showInputDialog("introduce el dia"));
                    int mes = Integer.parseInt(JOptionPane.showInputDialog("introduce el mes"));
                    double litros= Double.parseDouble(JOptionPane.showInputDialog("total de litros llovidos"));
                    arraylitros[mes-1]=arraylitros[mes-1]+litros;       
                 }
                while(JOptionPane.showInputDialog("quieres añadir mas informacion?").equalsIgnoreCase("si"));
                
            for(int x=0; x<meses.length; x++)
        {
            cadena = cadena +"En el mes de "+meses[x]+" ha llovido "+arraylitros[x]+" litros\n\n";
        }
                    JOptionPane.showMessageDialog(null, cadena); 
                   programa=true;
                       }
                catch(Exception e){
            }
        JOptionPane.showMessageDialog(null, "ERROR!");
        }
    }
}