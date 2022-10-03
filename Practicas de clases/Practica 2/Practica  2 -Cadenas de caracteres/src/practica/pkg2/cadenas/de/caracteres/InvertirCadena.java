/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg2.cadenas.de.caracteres;

import java.util.Arrays;

/**
 *
 * @author newma
 */
public class InvertirCadena {

    public void invertir(String cadena) {
        char[] invertir = cadena.toCharArray();
        for (int i = cadena.length() - 1; i >= 0; i--) {
            System.out.println(invertir[i]);
            
        }
        System.out.println("");
        System.out.println("cadena :" + cadena );
    }

}
