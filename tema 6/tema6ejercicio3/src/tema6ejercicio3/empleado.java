
package tema6ejercicio3;

public class empleado extends persona{
    /*atributos*/
    private int sueldobruto;
    /*constructor*/
        public empleado(int sueldobruto, int edad, String nombre) {
        super(edad, nombre);
        this.sueldobruto = sueldobruto;
    }
    /*metodos*/

    public int getSueldobruto() {
        return sueldobruto;
    }

    public void setSueldobruto(int sueldobruto) {
        this.sueldobruto = sueldobruto;
    }
     
    @Override
    public String mostrar(){
        return this.getNombre()+""+this.getEdad()+""+this.getSueldobruto();  
    }
    
    public Double calcularsalarioneto(){
        return null;
    }
    
}
