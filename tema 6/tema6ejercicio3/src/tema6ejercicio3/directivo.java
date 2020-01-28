
package tema6ejercicio3;

import java.util.ArrayList;

public class directivo extends empleado{
   /*atributos*/
    private String categoria;
    private ArrayList<empleado> subordinados;
   /*constructor*/
    
    public directivo(String categoria, ArrayList<empleado> subordinados, int sueldobruto, int edad, String nombre) {
        super(sueldobruto, edad, nombre);
        this.categoria = categoria;
        this.subordinados = subordinados;
    }
    /*metodos*/

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<empleado> getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(ArrayList<empleado> subordinados) {
        this.subordinados = subordinados;
    }
    @Override
    public String mostrar(){
        return this.getNombre() + " " + this.getEdad() + " " + this.getSueldoBruto() + " " + this.getCategoria();
    }
    }
