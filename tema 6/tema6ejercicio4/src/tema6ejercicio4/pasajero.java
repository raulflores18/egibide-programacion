
package tema6ejercicio4;

import java.util.Date;

public class pasajero extends vuelo{
   
    /*atributos*/
    private String cedula;
    private String nombre;
    private String apellido;
    private String sexo;
    private int edad;
    
    /*constructor*/
    public pasajero(String cedula, String nombre, String apellido, String sexo, int edad, int nvuelo, String horasalida, String horallegada, String lugarorigen, String lugardestino, Date fechasalida, Date fechallegada, String tipodevuelo) {
        super(nvuelo, horasalida, horallegada, lugarorigen, lugardestino, fechasalida, fechallegada, tipodevuelo);
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
    }
    
    /*metodos*/

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
