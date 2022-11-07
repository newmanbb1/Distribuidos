/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialsis258.jerl;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author Carlos
 */
public class Banco3UDP {

    

    public static void main(String args[]) {
        int port = 6789;

        try {

            DatagramSocket socketUDP = new DatagramSocket(port);
            byte[] bufer = new byte[3000];
            System.out.println("Servidor Iniciado");
            while (true) {
                // Construimos el DatagramPacket para recibir peticiones
                DatagramPacket peticion
                        = new DatagramPacket(bufer, bufer.length);

                // Leemos una petición del DatagramSocket
                socketUDP.receive(peticion);

                System.out.print("Datagrama recibido del host: "
                        + peticion.getAddress());
                System.out.println(" desde enl puerto remoto: "
                        + peticion.getPort());

                String cadena = new String(peticion.getData());
                //int valor = Integer.valueOf(cadena.trim());
                String[] separador = cadena.split(",");
                String id = separador[0];
                String monto = separador[1];
                String accionA = separador[2];
               // String accionR = separador[3];

               // System.out.println(" valor enviado: " + monto
              //  );
                // Construimos el DatagramPacket para enviar la respuesta
                boolean resp = Accion(id, monto, accionA);

                String response = String.valueOf(resp);
                byte[] mensaje = response.getBytes();

                DatagramPacket respuesta
                        = new DatagramPacket(mensaje, response.length(),
                                peticion.getAddress(), peticion.getPort());

                // Enviamos la respuesta, que es un eco
                socketUDP.send(respuesta);
            }

        } catch (SocketException e) {
            System.out.println("Socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        }
    }

    public static boolean Accion(String id, String monto, String accion) {
        if (id.equals("2") ) {

          // int  total = Integer.valueOf(monto) + 55;

            return true;
        } else if (id.equals("2") && accion.equals("retirar") && Integer.valueOf(monto) <= 55) {
            //int total = Integer.valueOf(monto) - 55;
            return true;
        } else {
            return false;
        }

    }

}
