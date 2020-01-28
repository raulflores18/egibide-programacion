/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Raul
 */
public class Ejercico7 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduce los dos catetos: ");
        double c1 = Double.parseDouble(br.readLine());
        double c2 = Double.parseDouble(br.readLine());
        Double hipotenusa = Math.sqrt(Math.pow(c1,2)+Math.pow(c2,2));
        hipotenusa = Math.rint(hipotenusa);
        System.out.println("La hipotenusa es: " + hipotenusa);
    }
    
}
