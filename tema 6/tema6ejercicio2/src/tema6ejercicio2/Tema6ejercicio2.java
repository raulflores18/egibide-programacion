
package tema6ejercicio2;

import excepciones.*;
import alumno.Alumno;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Tema6ejercicio2 {

    public static void main(String[] args) {
    try
        {
            ArrayList<Alumno> listaClase;
            listaClase = obtenerDatosAlumnos();
            buscarPorCodigo(listaClase);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"error");
        }   
    }
    
     public static void buscarPorCodigo(ArrayList<Alumno> lista) throws Exception{
        String codigo = JOptionPane.showInputDialog("ingresa el código del alumno");
      
        validarCodigo(codigo);
     
        int x;
        for(x = 0; x < lista.size() && lista.get(x).getCodigo().equals(codigo)== false; x++){}
        if( x == lista.size())
            JOptionPane.showMessageDialog(null,"Alumno desconocido");
        else
            JOptionPane.showMessageDialog(null,"Objeto alumno: " + lista.get(x) + "\n" + lista.get(x).toString());
            
    }
     
    public static ArrayList<Alumno> obtenerDatosAlumnos(){
        ArrayList<Alumno> lista = new ArrayList();
        do
        {
            try
            {
                String codigo = JOptionPane.showInputDialog("ingresa el código del alumno");
                validarCodigo(codigo);
                String nombre = JOptionPane.showInputDialog("ingresa el nombre del alumno");
                validarNombre(nombre);
                String domicilio = JOptionPane.showInputDialog("ingresa el domicilio del alumno");
                validarDomicilio(domicilio);
                String telefono = JOptionPane.showInputDialog("ingresa el teléfono del alumno");
                validarTelefono(telefono);
            
                Alumno a = new Alumno(codigo,nombre,domicilio,telefono);
                
                lista.add(a);
            }
            catch(Novalido e){
              JOptionPane.showMessageDialog(null,"El dato introducido es incorrecto.");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Problemas");
            }
        }
        while(JOptionPane.showConfirmDialog(null,"¿ Quieres ingresar mas alumnos?")==0);
        return lista;
    }
    
    public static void validarCodigo(String codigo)throws Exception{
      
        boolean error=false;
        if (codigo.length()!= 5)
            error = true;
        else
            for (int x = 0; x < codigo.length() && error == false;x++)
                if (Character.isAlphabetic(codigo.charAt(x)))
                    error = true;
        if (error)
            throw new Novalido();
                    
    }
    
    public static void validarNombre(String nombre)throws Exception{
        
        boolean error=false;
        if (nombre.length()<= 2)
            error = true;
        else
            
            for (int x = 0; x < nombre.length() && error == false;x++)
                if (Character.isDigit(nombre.charAt(x)))
                    error = true;
        if (error)
            throw new Novalido();
                    
    }
    
    public static void validarDomicilio(String domicilio)throws Exception{
        if (domicilio.length()<= 10)
            throw new Novalido();
                    
    }
    
    public static void validarTelefono(String telefono) throws Exception{
       
        boolean error=false;
        if (telefono.length()!= 9)
            error = true;
        else
            if (telefono.charAt(0)!= '6' && telefono.charAt(0)!= '7' && telefono.charAt(0)!= '8' && telefono.charAt(0)!= '9' )
                error = true;
            else
                for (int x = 0; x < telefono.length() && error == false;x++)
                    if (Character.isAlphabetic(telefono.charAt(x)))
                        error = true;
        if (error)
            throw new Novalido();
    } 
    
    
}
