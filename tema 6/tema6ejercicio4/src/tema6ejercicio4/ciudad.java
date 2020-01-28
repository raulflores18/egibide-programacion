
package tema6ejercicio4;

import java.util.Date;

public class ciudad extends vuelo {
    /*atributos*/
    private String codciudad;
    private String nombre;
    
    /*constructor*/

    public ciudad(String codciudad, String nombre, int nvuelo, String horasalida, String horallegada, String lugarorigen, String lugardestino, Date fechasalida, Date fechallegada, String tipodevuelo) {
        super(nvuelo, horasalida, horallegada, lugarorigen, lugardestino, fechasalida, fechallegada, tipodevuelo);
        this.codciudad = codciudad;
        this.nombre = nombre;
    }
    
    /*metodos*/

    public String getCodciudad() {
        return codciudad;
    }

    public void setCodciudad(String codciudad) {
        this.codciudad = codciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
