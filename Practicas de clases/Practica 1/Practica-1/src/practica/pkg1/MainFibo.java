/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg1;

import java.util.Scanner;

/**
 *
 * @author Jhon Ramirez
 */
public class MainFibo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
         Fibonaci fibo = new Fibonaci();
         System.out.println("Introduzca numero");
         int n = sc.nextInt();
         System.out.println("el fibonaci de "+n+" es: ");
          fibo.CalculoFibo(n);
         
        
    }
    
}
