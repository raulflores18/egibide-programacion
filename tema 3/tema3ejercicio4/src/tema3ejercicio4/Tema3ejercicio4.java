
package tema3ejercicio4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tema3ejercicio4 {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        String MM = null;
        String yyyy = null;
        String dd = null;
        {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                Date fechaInicial=dateFormat.parse("04-08-2019");
		Date fechaFinal=dateFormat.parse("06-09-2018");
                int dias=(int) ((fechaFinal.getTime()-fechaInicial.getTime())/86400000);
                System.out.println("Hay "+dias+" dias de diferencia");
        }
 
}
}