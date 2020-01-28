
package alumno;

public class Alumno {
    private String codigo;
    private String nombre;
    private String domicilio;
    private String telefono;
    
    public Alumno (String codigo,String nombre,String domicilio, String telefono){
        this.codigo = codigo;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }
    
    public String getCodigo(){
        return codigo;
    }
    public void setcodigo(){
        this.codigo = codigo;
    }
    public String getnombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString() {
        return "Alumno{" + "codigo primero=" + codigo + ", nombre=" + nombre + ", domicilio=" + domicilio + ", telefono=" + telefono + '}';
    }
}
