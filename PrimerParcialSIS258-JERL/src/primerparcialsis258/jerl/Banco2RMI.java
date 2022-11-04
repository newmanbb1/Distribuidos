/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerparcialsis258.jerl;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jhon Ramirez
 */
public class Banco2RMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            // TODO code application logic heren
            Banco2 emisor;
            emisor = new Banco2();
            Naming.bind("Banco2", emisor);
            //System.out.println("El servidor De la plataforma de intercambio  esta listo\n");
            System.out.println("Servidor Banco 2 Iniciado");
            
            
        } catch (RemoteException ex) {
            Logger.getLogger(Banco2RMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(Banco2RMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Banco2RMI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
