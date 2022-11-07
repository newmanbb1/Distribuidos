/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerparcialsis258.jerl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jhon Ramirez
 */
public class SitioComercioCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            try {
                // TODO code application logic here
                IPlataformaIntercambio op = (IPlataformaIntercambio) Naming.lookup("//127.0.0.1/PIntercambio");
                Scanner sc = new Scanner(System.in);
                Scanner scI = new Scanner(System.in);
                //op.realizarTransaccion("1", "2", 2, "3");
                //System.out.println(op.realizarTransaccion("1", "2", 2, "3"));

                //boolean verificacion =op.realizarTransaccion("3","1", 300,"bob") ;
                //boolean verificacion =op.realizarTransaccion("4","2", 40,"bob") ;
                //boolean verificacion =op.realizarTransaccion("2","3", 50,"bob") ;
                System.out.println("Inserte Id");
                String id = sc.nextLine();
                System.out.println("Inserte banco");
                String banco = sc.nextLine();
                System.out.println("Inserte el monto");
                float monto = scI.nextInt();
                boolean verificacion = op.realizarTransaccion(id, banco, monto, "bob");
                System.out.println(verificacion);

                if (verificacion == true) {
                    System.out.println("Transaccion realizada con exito");
                } else {
                    System.out.println("no se pudo realizar su transaccion");
                }
                System.out.println("Desea continuar S/N");
                String opcion = sc.nextLine();
                if (opcion == "N") {
                    flag = false;
                }

                //System.out.println(op.realizarTransaccion("1", "1", 455, "bob"));
            } catch (NotBoundException ex) {
                Logger.getLogger(SitioComercioCliente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MalformedURLException ex) {
                Logger.getLogger(SitioComercioCliente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (RemoteException ex) {
                Logger.getLogger(SitioComercioCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
