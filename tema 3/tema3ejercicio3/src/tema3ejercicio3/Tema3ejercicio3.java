
package tema3ejercicio3;
import java.util.Scanner;

public class Tema3ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cadena:");
        String cadena = sc.nextLine();
        System.out.println("Ingrese el caracter a buscar:");
        String caracter = sc.next();
        char car = caracter.charAt(0);
        int cantidadRepeticiones = 0;
        for (int i = 0 ; i < cadena.length() ; i++) {
            char aux = cadena.charAt(i);
             if (aux == car) {
                cantidadRepeticiones++;
          }
        }

        System.out.println("La cantidad de repeticiones es: " + cantidadRepeticiones);
  }
}
