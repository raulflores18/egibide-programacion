
package tema9ejercicio1;
import ventanas.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;


public class Tema9ejercicio1 {
    
    private static principal v;
    private static segunda vs;
    private static basededatos bsd; 
    private static personabase personabase;
    private static ArrayList<personas> listap;
    private static int posicion;
    
    
    public static void main(String[] args) {
     try{
         bsd = new basededatos();
         bsd.conectar();
         personabase = new personabase(bsd.getcon());
         v = new principal();
         v.setLocationRelativeTo(null);
         v.setVisible(true);
     } 
     catch(Exception e)
     {
         JOptionPane.showInputDialog("Error");
     }
    }
    
    public static void obtenerDatos() throws Exception
    {
        //Se obtiene la lista de personas
        listap = personabase.listaDePersonas();
        //Se comprueba si hay información
        if (listap.size()>0) 
        {
            // Paso a la ventana los datos del primero
            posicion = 0;
            v = new segunda(listap.get(0).getNombre(),listap.get(0).getEdad(),listap.get(0).getProfesion(),listap.get(0).getTelefono());
            v.setVisible(true);
        }
        else
            throw new Exception("No hay personas");
 }
    
    public static void altaper(){
        v.setVisible(false);
        vs = new segunda();
        vs.setVisible(true);
    }
    
    public static void ingresarPersona(String n, Integer e, String pr, Integer t)throws Exception
    {
         personas datosPersona=new personas();
         datosPersona.setNombre(n);
         datosPersona.setEdad(e);
         datosPersona.setProfesion(pr);
         datosPersona.setTelefono(t);

         personabase.registrarP(datosPersona);
    }
    
    public static void salir()
    {
        v.dispose();
        vs.setVisible(true);
    }
    
    public static void cerrar() throws Exception
    {
        bsd.desconectar();
        System.exit(0);
    }
    
    public static boolean isSiguiente()
    {
        if (posicion == listap.size()-1)
        return false;
        return true;
    }
    
    public static boolean isAnterior()
    {
        if (posicion == 0)
        return false;
        return true;
    }
    
    
    public static void ingresarPersona(String nombre) throws Exception
    {
        personas persona = personabase.buscarp(nombre);
        visualizar(persona);
    }
    
    public static void visualizar(personas p)
  {
        JOptionPane.showInputDialog("Nombre: "+p.getNombre());
        JOptionPane.showInputDialog("Edad: "+p.getEdad());
        JOptionPane.showInputDialog("Profesión: "+p.getProfesion());
        JOptionPane.showInputDialog("Telefono: "+p.getTelefono());
        JOptionPane.showInputDialog("*************************************************\n");
  }
    
    public static String getSiguienteNombre()
  {
      posicion = posicion + 1;
      return listap.get(posicion).getNombre();
  }
  
  public static Integer getEdad()
  {
     return listap.get(posicion).getEdad();
  }
   
  public static String getProfesion()
  {
      return listap.get(posicion).getProfesion();
  }
    
  public static Integer getTelefono()
  {
      return listap.get(posicion).getTelefono();
  }
  
  public static String getAnteriorNombre()
  {
      posicion = posicion - 1;
      return listap.get(posicion).getNombre();
  }
}
