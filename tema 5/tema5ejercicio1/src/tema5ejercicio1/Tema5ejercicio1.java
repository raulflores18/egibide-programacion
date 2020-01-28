
package tema5ejercicio1;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;


public class Tema5ejercicio1{
    
        public static ArrayList <Float> menu = new ArrayList();
   
    public static void main(String[] args) {
        
        llenarArrayList();
       
        int menu = Integer.parseInt( JOptionPane.showInputDialog("Escoge la operacion a realizar"
                + "\n 1.Visualizar el valor maximo y minimo"
                + "\n 2.Buscar numero"
                + "\n 3.Borrar numero"
                + "\n 4.Convertir el arraylist en array"
                + "\n 5.Mostrar  numeros de elementos que contiene el array"
                + "\n 6.Insertar nuevo elemento en la posicion indicada"
                + "\n 7.Borrar un elemento de una posicion concreta"
                + "\n 8.Calcular la suma y la media arimetica de los valores contenidos"
                + "\n 9.Finalizar"));
        
        
        
        switch(menu){
                case 1: llenarArrayList();
                    break;
                
                case 2: buscarnumero();
                    break;
                    
                case 3: borrarnumero();
                    break;
                    
                case 4: convertirarray();
                    break;
                  
                 case 5: mostrar();
                    break;
                    
                case 6: insertar();
                    break;
                    
                 case 7: borrar();
                    break;
                    
                 case 8: calcularsuma();
                    break;
                        
                 case 9: salir();
                    break;
   
    }
    }

    public static void llenarArrayList() {
         int contador = 0;
        do {
        menu.add(Float.parseFloat(JOptionPane.showInputDialog("Introduce un numero")));
        contador =  JOptionPane.showConfirmDialog(null, "quieres continuar");
        
        } while (contador ==0);
        }

    public static void buscarnumero() {
        
        int buscar = Integer.parseInt( JOptionPane.showInputDialog("ingresa numero a buscar"))-1;
          Float numero= menu.get(buscar); 
          JOptionPane.showMessageDialog(null, "el numero esta " + numero);
       
    }

    public static void borrarnumero() {
        int borrar = Integer.parseInt(JOptionPane.showInputDialog("ingresa la posicion a borrar"));
            Float numero= menu.remove(borrar);  
            JOptionPane.showMessageDialog(null, "el numero a eliminar es " + numero);
            JOptionPane.showMessageDialog(null, "el numero a sido eliminado");
    }

    public static void convertirarray() {
       Object[]miarray = menu.toArray();
        JOptionPane.showMessageDialog(null, Arrays.toString(miarray));
    }

    public static void mostrar() {
        JOptionPane.showMessageDialog(null,menu.size());
    }

    public static void insertar() {
        float Final=Float.parseFloat(JOptionPane.showInputDialog("introduce la posicion donde ingresar el numero"));
            menu.add(Final);
    }

    public static void borrar() {
        int borrar = Integer.parseInt(JOptionPane.showInputDialog("ingresa la posicion a eliminar"));
        menu.remove(borrar);
    }

    public static void calcularsuma() {
        float suma=0;
        for(int x=0;x<menu.size();x++){
            suma += menu.get(0);
            JOptionPane.showMessageDialog(null, "la suma dee todo es " + suma);
        }
     
    }
    
    public static void salir() {
        System.exit(0);
    }
    }
    

