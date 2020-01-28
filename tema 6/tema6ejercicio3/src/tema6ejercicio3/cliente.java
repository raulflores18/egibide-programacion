package tema6ejercicio3;

public class cliente extends persona {
    /*atributos*/
    private String ntelefono;
    
    /*constructores*/
    public cliente(String ntelefono, int edad, String nombre) {
        super(edad, nombre);
        this.ntelefono = ntelefono;
    }
    /*metodos*/

    public String getNtelefono() {
        return ntelefono;
    }

    public void setNtelefono(String ntelefono) {
        this.ntelefono = ntelefono;
    }
    
    
    @Override
    public String mostrar(){
        return this.getNombre() + " " + this.getEdad() + " " + this.getNtelefono();
    }

}
