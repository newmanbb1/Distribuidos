/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg2.cadenas.de.caracteres;

import java.util.Scanner;

/**
 *
 * @author newma
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Inserte cadena a Invertir");
        InvertirCadena invertir = new InvertirCadena();
        Scanner sc =new Scanner (System.in);
        String cadena = sc.nextLine();
        
          System.out.println("Cadena Invertida: ");
          invertir.invertir(cadena);
    }
    
}
