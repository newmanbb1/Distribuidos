/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package primerparcialsis258.jerl;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Jhon Ramirez
 */
public interface IBanco2 extends Remote{
    
    boolean retirar(String idCliente,float monto) throws RemoteException;
    boolean abonar(String idCliente,float monto) throws RemoteException;
    
}
