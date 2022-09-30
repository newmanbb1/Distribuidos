/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg1;

/**
 *
 * @author Jhon Ramirez
 */
public class Fibonaci {
    
    public void CalculoFibo(int n){
                
        int a = 0;
        int b = 1;
        int c = 0;

        if (n != 1 || n != 0) {
            
            for (int i = 1; i <= n; i++) {
                System.out.print(a + ",");
                c = a + b;
                a = b;
                b = c;

            }
        } else {

            System.out.println("0, 1");

        }
    
    }
    
}
