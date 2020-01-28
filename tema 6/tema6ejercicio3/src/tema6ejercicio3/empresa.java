
package tema6ejercicio3;

import java.util.ArrayList;

public class empresa extends persona {
    /*atributos*/
    private String nombre;
  
    /*constructor*/

    public empresa(String nombre, int edad) {
        super(edad, nombre);
        this.nombre = nombre;
    }

    /*metodos*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   @Override
    public String toString() {
        return "empresa{" + "nombre=" + nombre + '}';
    }

    void setListaClientes(ArrayList<cliente> listaClientes0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setListaEmpleados(ArrayList<empleado> listaEmpleados0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
