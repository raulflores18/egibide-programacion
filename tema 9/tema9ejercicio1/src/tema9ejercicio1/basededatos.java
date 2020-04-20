/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9ejercicio1;
    import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ZEUS
 */
public class basededatos {
   private Connection con;
    
    public basededatos(){
    }
    
    public void conectar() throws Exception{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String bd ="personas";
            String url ="jdbc:mysql://localhost:3307/"+bd;
            String login ="root";
            String password ="usbw";
            con = DriverManager.getConnection(url,login,password);
            
            if(con==null){
                throw new Exception("problemas");
            }
        }
        catch(Exception e)
    {
        JOptionPane.showInputDialog(e.getMessage());
    }
    } 
    
    public void desconectar(){
        try
        {
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showInputDialog("problema al cerrar");
        }
    }
    
    public Connection getcon(){
        return con;
    }
}
