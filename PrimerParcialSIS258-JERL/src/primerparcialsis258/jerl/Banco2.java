/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcialsis258.jerl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Jhon Ramirez
 */
public class Banco2 extends UnicastRemoteObject implements IBanco2 {

    float cantidadCuenta = 0;

    public Banco2() throws RemoteException {
        super();
    }

    @Override
    public boolean retirar(String idCliente, float monto) throws RemoteException {
        if (idCliente.equals("4") && monto <= 40) {
            cantidadCuenta = 40 - monto;
            return true;

        } else {
            return false;
        }
    }

    @Override
    public boolean abonar(String idCliente, float monto) throws RemoteException {
        if (idCliente.equals("4")) {
            cantidadCuenta = 40 + monto;
            return true;

        } else {
            return false;
        }
    }

}
