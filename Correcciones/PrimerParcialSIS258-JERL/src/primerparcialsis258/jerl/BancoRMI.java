/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerparcialsis258.jerl;

import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jhon Ramirez
 */
public class BancoRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            
            Registry registro = java.rmi.registry.LocateRegistry.createRegistry(1099);
            registro.bind("Banco1", new Banco1());
            System.out.println("Servidor Bnaco 1 Iniciado");
            
            
        } catch (RemoteException | AlreadyBoundException ex) {
            Logger.getLogger(BancoRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
