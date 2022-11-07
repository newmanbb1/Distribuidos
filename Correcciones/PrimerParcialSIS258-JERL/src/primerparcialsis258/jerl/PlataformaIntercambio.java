/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcialsis258.jerl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jhon Ramirez
 */
public class PlataformaIntercambio extends UnicastRemoteObject implements IPlataformaIntercambio {

    public PlataformaIntercambio() throws RemoteException {
        super();
    }

    @Override
    public boolean realizarTransaccion(String idCliente, String idVendedor, float monto, String moneda) throws RemoteException {
        //declaramos los puertos para TCP y UDP
        //
        int puerto = 6789;
        int port = 5002;
        boolean respuestaT = false;
        int opcion = Integer.valueOf(idCliente);
        try {

            switch (opcion) {
                case 1:
                    //RMI
                    IBanco banco1 = (IBanco) Naming.lookup("//127.0.0.1/Banco1");

                    System.out.println(banco1.abonar(idCliente, monto));
                    //System.out.println(banco1.retirar(idCliente, monto));
                    //respuestaT=banco1.retirar(idCliente, monto);
                    respuestaT = banco1.abonar(idCliente, monto);
                    break;
                case 2:
                    //SOKETS UDP
                    Scanner sc = new Scanner(System.in);
                    String dato = "";
                    String ip = "localhost";
                    DatagramSocket socketUDP = new DatagramSocket();
                    InetAddress hostServidor = InetAddress.getByName(ip);
                    System.out.println("Desea retirar o abonar\n 1.Abonar \n 2.Retirar");

                    String accion = sc.nextLine();
                    if (accion.equals("1")) {
                        dato = idCliente + "," + monto + "," + "abonar";
                    } else {
                        dato = idCliente + "," + monto + "," + "retirar";
                    }

                    byte[] datobanco3 = dato.getBytes();
                    // Construimos un datagrama para enviar el mensaje al servidor
                    DatagramPacket peticion
                            = new DatagramPacket(datobanco3, dato.length(), hostServidor,
                                    puerto);

                    // Enviamos el datagrama
                    socketUDP.send(peticion);

                    // Construimos el DatagramPacket que contendrá la respuesta
                    byte[] bufer = new byte[1000];
                    DatagramPacket respuesta
                            = new DatagramPacket(bufer, bufer.length);
                    socketUDP.receive(respuesta);
                    //System.out.println("Respuesta: " + new String(respuesta.getData()));
                    String dato2 = new String(respuesta.getData());
                    
                    System.out.println(dato2);
                    if (dato2.equals("true")) {
                        respuestaT = true;
                    }else{
                     respuestaT = false;
                    }

                    System.out.println(respuestaT);
                    break;
                case 3:
                    //RMI
                    IBanco banco10 = (IBanco) Naming.lookup("//127.0.0.1/Banco1");

                    System.out.println(banco10.abonar(idCliente, monto));
                    //System.out.println(banco1.retirar(idCliente, monto));
                    //respuestaT=banco1.retirar(idCliente, monto);
                    respuestaT = banco10.abonar(idCliente, monto);
                    break;

                case 4:
                    //RMI
                    IBanco2 banco2 = (IBanco2) Naming.lookup("//127.0.0.1/Banco2");
                    System.out.println(banco2.abonar(idCliente, monto));
                    //System.out.println(banco2.retirar(idCliente, monto));
                    //respuestaT=banco2.retirar(idCliente, monto);
                    respuestaT = banco2.abonar(idCliente, monto);
                    break;

                default:
            }
            //RMI 

            //Sokects TCP
            Socket client = new Socket("localhost", port);
            PrintStream toServer = new PrintStream(client.getOutputStream());
            BufferedReader fromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            String fecha = "03/11/2022";
            toServer.println(fecha);
            String result = fromServer.readLine();

            System.out.println(result);

        } catch (NotBoundException ex) {
            Logger.getLogger(PlataformaIntercambio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(PlataformaIntercambio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SocketException ex) {
            Logger.getLogger(PlataformaIntercambio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex) {
            Logger.getLogger(PlataformaIntercambio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PlataformaIntercambio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuestaT;

    }

}
