/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerparcialsis258.jerl;

import java.net.MalformedURLException;
import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jhon Ramirez
 */
public class ServidorRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here

            /*
            Registry registro = java.rmi.registry.LocateRegistry.createRegistry(1099);
            registro.bind("PIntercambio", new PlataformaIntercambio());
            System.out.println("Servidor Iniciado");
            
             */
            PlataformaIntercambio emisor;
            emisor = new PlataformaIntercambio();
            Naming.bind("PIntercambio", emisor);
            System.out.println("El servidor De la plataforma de intercambio  esta listo\n");

        } catch (RemoteException ex) {
            Logger.getLogger(ServidorRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(ServidorRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ServidorRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
