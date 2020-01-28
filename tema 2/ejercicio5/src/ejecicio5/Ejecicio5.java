/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecicio5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Ejecicio5 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        System.out.print("Introduce los grados centígrados: ");
        double gradosC = Double.parseDouble(br.readLine());
        
       
        Double gradosF = 1.8 * gradosC + 32;

        System.out.println(gradosC  + " ºC son " + gradosF + "ºF");
    }
    
}
