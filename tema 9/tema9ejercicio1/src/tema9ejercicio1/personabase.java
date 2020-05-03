package tema9ejercicio1;

import java.sql.*;
import java.util.ArrayList;


public class personabase {
    private Connection con;
    
     public personabase(Connection con)
    {
        this.con = con;
    }
     
     public void registrarP(personas p) throws Exception
    {
        String plantilla = "INSERT INTO personas VALUES (?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        
        ps.setString(1, p.getNombre());
        ps.setInt(2,p.getEdad());
        ps.setString(3, p.getProfesion());
        ps.setInt(4,p.getTelefono());
        
        int n = ps.executeUpdate();
  
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
     
     public personas buscarp(String nombre) throws Exception
   {
       personas persona=null;
 
       PreparedStatement consul = con.prepareStatement("SELECT * FROM personas where nombre = ? ");
       consul.setString(1, nombre);
       ResultSet resultado = consul.executeQuery();
       if(resultado.next())
       {
          persona=crearObjeto(resultado);
       }
       else
            throw new Exception ("sin resultado");
 
       return persona;
    }
     
     public personas crearObjeto(ResultSet res) throws Exception
    {
           personas persona= new personas();
           persona.setNombre(res.getString("nombre"));
           persona.setEdad(res.getInt("edad"));
           persona.setProfesion(res.getString("profesion"));
           persona.setTelefono(res.getInt("telefono"));
           return persona;
    }
     
     public ArrayList<personas> listaDePersonas() throws Exception
    {
        ArrayList< personas> listaPersonas = new ArrayList();
        Statement consul = con.createStatement();
        ResultSet resultado = consul.executeQuery("Select * from personas"); 
        while(resultado.next())
        {
         listaPersonas.add(crearObjeto(resultado));
        }
        return listaPersonas;
 }
}
