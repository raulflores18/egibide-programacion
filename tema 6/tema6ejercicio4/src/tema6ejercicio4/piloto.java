package tema6ejercicio4;

import java.util.Date;

public class piloto extends vuelo{
    /*atributos*/
    private String codigopiloto;
    private String nombre;
    private String apellido;
    private Integer numlicencia;
    
    /*constructor*/

    public piloto(String codigopiloto, String nombre, String apellido, Integer numlicencia, int nvuelo, String horasalida, String horallegada, String lugarorigen, String lugardestino, Date fechasalida, Date fechallegada, String tipodevuelo) {
        super(nvuelo, horasalida, horallegada, lugarorigen, lugardestino, fechasalida, fechallegada, tipodevuelo);
        this.codigopiloto = codigopiloto;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numlicencia = numlicencia;
    }
    /*metodos*/

    public String getCodigopiloto() {
        return codigopiloto;
    }

    public void setCodigopiloto(String codigopiloto) {
        this.codigopiloto = codigopiloto;
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

    public Integer getNumlicencia() {
        return numlicencia;
    }

    public void setNumlicencia(Integer numlicencia) {
        this.numlicencia = numlicencia;
    }
    
}
