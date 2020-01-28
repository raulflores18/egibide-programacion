
package tema6ejercicio3;
    import java.util.ArrayList;

public class Tema6ejercicio3 {

    public static void main(String[] args) {
      empresa [] listaempre = new empresa[3];
      
      listaempre[0] = new empresa("sony");
      listaempre[0].setListaClientes(getListaClientes0());
      listaempre[0].setListaEmpleados(getListaEmpleados0());
      
      listaempre[1] = new empresa("apple",getListaClientes1());
      listaempre[1].setListaEmpleados(getListaempleados1());
        
      listaEmpresas[2] = new Empresa("microsoft",getListaClientes2());
      añadirEmpleados(listaEmpresas[2]);
        
     buscarDirectivoConMasSubordinados(listaempre);

    }
    public static void añadirEmpleados(empresa empresa){
        empleado e = new empleado("Nieves",50,1000);
        empresa.setempleado(e);
        e = new empleado("Pepe",50,1000);
        empresa.setempleado(e);
        
    }
    public static ArrayList<cliente> getListaClientes0(){
        ArrayList<cliente> lista = new ArrayList();
        // Clientes con nombre, edad y teléfono
        lista.add(new cliente("c1",21,"111"));
        lista.add(new cliente("c2",31,"411"));
        lista.add(new cliente("c3",41,"611"));
        return lista;
    }
    public static ArrayList<cliente> getListaClientes2(){
        ArrayList<Cliente> lista = new ArrayList();
        // Clientes con nombre, edad y teléfono
        lista.add(new Cliente("Alumno1",21,"111"));
        lista.add(new Cliente("Alumno2",31,"411"));
        lista.add(new Cliente("Alumno3",41,"611"));
        return lista;
    }
    public static ArrayList<empleado> getListaEmpleados0(){
        ArrayList<empleado> lista = new ArrayList();
        // Empleados con nombre, edad y sueldoBruto
        lista.add(new empleado("e1",21,10000));
        lista.add(new empleado("e2",31,20000));
        lista.add(new empleado("e3",41,30000));
        
        // Uno de los empleados será el jefe
        directivo objD = new directivo("Jefe1",45,50000,"Categoria uno");
        
        // Un directivo también es un empleado???
        lista.add(objD);
        
        // El directivo todavía no está completo
        ArrayList<empleado> listaSubordinados = new ArrayList();
        listaSubordinados.add(lista.get(0));
        objD.setSubordinados(listaSubordinados);
    
        
        objD = new directivo("Jefe2",45,50100,"Categoria uno");
        listaSubordinados = new ArrayList();
        listaSubordinados.add(lista.get(1));
        listaSubordinados.add(lista.get(2));
        objD.setSubordinados(listaSubordinados);
        lista.add(objD);
        
        return lista;
    }
    
    public static ArrayList<cliente> getListaClientes1(){
        ArrayList<cliente> lista = new ArrayList();
        lista.add(new cliente("Pepe",27,"118"));
        lista.add(new cliente("Juan",37,"418"));
        lista.add(new cliente("Imanol",47,"618"));
        lista.add(new cliente("Maria",61,"111"));
        lista.add(new cliente("Teresa",39,"411"));
        return lista;
    }
    
    public static ArrayList<empleado> getListaempleados1(){
        ArrayList<empleado> lista = new ArrayList();
        lista.add(new empleado("e11",21,10500));
        lista.add(new empleado("e21",31,20500));
        lista.add(new empleado("e31",41,30500));
        lista.add(new empleado("e51",21,100500));
        lista.add(new empleado("e61",36,40000));
        
        directivo objD = new directivo("Jefe 56",45,50000,"Categoria uno");
        ArrayList<empleado> listaSubordinados = new ArrayList();
        listaSubordinados.add(lista.get(0));
        listaSubordinados.add(lista.get(1));
        listaSubordinados.add(lista.get(2));
        listaSubordinados.add(lista.get(3));
        objD.setSubordinados(listaSubordinados);
        lista.add(objD);
        
        objD = new directivo("Jefe 67",45,50100,"Categoria uno");
        listaSubordinados = new ArrayList();
        listaSubordinados.add(lista.get(2));
        listaSubordinados.add(lista.get(3));
        listaSubordinados.add(lista.get(4));
        objD.setSubordinados(listaSubordinados);
        lista.add(objD);
        
        return lista;
    }
    public static void buscarDirectivoConMasSubordinados(empresa [] lista){
        int max = 0;
        directivo objetoMaximo = null;
        
        for(int x = 0; x < lista.length; x++)
        {
            // empleados de una empresa
            for (int y = 0; y < lista[x].getListaEmpleados().size();y++)
            {
                // Es o no es un directivo
               if ( lista[x].getListaEmpleados().get(y) instanceof directivo)
               {
                   directivo objeto = (directivo) lista[x].getListaEmpleados().get(y);
                   if (objeto.getSubordinados().size() > max)
                   {
                       objetoMaximo = objeto;
                       max = objeto.getSubordinados().size();
                   }
               }
                
            }
        }
        javax.swing.JOptionPane.showMessageDialog(null, " El directivo que más subordinados tiene es " + objetoMaximo.getNombre() + " y tiene " + max + " empleados a su cargo");
    }
    
    
}
