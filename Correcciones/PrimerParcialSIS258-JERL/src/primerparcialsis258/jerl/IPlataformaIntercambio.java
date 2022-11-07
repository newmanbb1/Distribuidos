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
public interface IPlataformaIntercambio extends Remote {
    
    boolean realizarTransaccion(String idCliente,String idVendedor,float monto, String moneda)throws RemoteException;
    
}
