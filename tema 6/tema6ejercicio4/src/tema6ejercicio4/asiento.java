
package tema6ejercicio4;

import java.util.Date;

public class asiento  extends vuelo{
    private int nasiento;
    private Boolean estado;
    private String comportamiento;
    
    /*constructor*/

    public asiento(int nasiento, Boolean estado, String comportamiento, int nvuelo, String horasalida, String horallegada, String lugarorigen, String lugardestino, Date fechasalida, Date fechallegada, String tipodevuelo) {
        super(nvuelo, horasalida, horallegada, lugarorigen, lugardestino, fechasalida, fechallegada, tipodevuelo);
        this.nasiento = nasiento;
        this.estado = estado;
        this.comportamiento = comportamiento;
    }
    /*metodos*/

    public int getNasiento() {
        return nasiento;
    }

    public void setNasiento(int nasiento) {
        this.nasiento = nasiento;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }
    
}
