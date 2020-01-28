package tema6ejercicio4;

import java.util.Date;

public class vuelo {
    
    private int nvuelo;
    private String horasalida;
    private String horallegada;
    private String lugarorigen;
    private String lugardestino;
    private Date fechasalida;
    private Date fechallegada;
    private String tipodevuelo;

    public vuelo(int nvuelo, String horasalida, String horallegada, String lugarorigen, String lugardestino, Date fechasalida, Date fechallegada, String tipodevuelo) {
        this.nvuelo = nvuelo;
        this.horasalida = horasalida;
        this.horallegada = horallegada;
        this.lugarorigen = lugarorigen;
        this.lugardestino = lugardestino;
        this.fechasalida = fechasalida;
        this.fechallegada = fechallegada;
        this.tipodevuelo = tipodevuelo;
    }

    public int getNvuelo() {
        return nvuelo;
    }

    public void setNvuelo(int nvuelo) {
        this.nvuelo = nvuelo;
    }

    public String getHorasalida() {
        return horasalida;
    }

    public void setHorasalida(String horasalida) {
        this.horasalida = horasalida;
    }

    public String getHorallegada() {
        return horallegada;
    }

    public void setHorallegada(String horallegada) {
        this.horallegada = horallegada;
    }

    public String getLugarorigen() {
        return lugarorigen;
    }

    public void setLugarorigen(String lugarorigen) {
        this.lugarorigen = lugarorigen;
    }

    public String getLugardestino() {
        return lugardestino;
    }

    public void setLugardestino(String lugardestino) {
        this.lugardestino = lugardestino;
    }

    public Date getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(Date fechasalida) {
        this.fechasalida = fechasalida;
    }

    public Date getFechallegada() {
        return fechallegada;
    }

    public void setFechallegada(Date fechallegada) {
        this.fechallegada = fechallegada;
    }

    public String getTipodevuelo() {
        return tipodevuelo;
    }

    public void setTipodevuelo(String tipodevuelo) {
        this.tipodevuelo = tipodevuelo;
    }
    
}

