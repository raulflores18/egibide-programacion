
package tema6ejercicio3;


public class persona {
    /*atributos*/
    private int edad;
    private String nombre;
    
    
    /*constructores*/

    public persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    /*metodos*/

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
