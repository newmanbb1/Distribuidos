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
public class Banco1 extends UnicastRemoteObject implements IBanco {

    public Banco1() throws RemoteException {
        super();
    }
    float cantidadCuenta = 0;

    @Override
    public boolean retirar(String idCliente, float monto) {
        if (idCliente.equals("1") && monto <= 455) {
            cantidadCuenta = 455 - monto;
            return true;
        } else if (idCliente.equals("3") && monto <= 300) {
            cantidadCuenta = 300 - monto;
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean abonar(String idCliente, float monto) {
        if (idCliente.equals("1") ) {
            cantidadCuenta = 455 + monto;
            return true;
        } else if (idCliente.equals("3")) {
            cantidadCuenta = 300 + monto;
            return true;
        } else {
            return false;
        }
    }

}
