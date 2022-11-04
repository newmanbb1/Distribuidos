/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcialsis258.jerl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author newma
 */
public class CotizadorTCP {

    public static void main(String[] args) {
        int port = 5002;

        try {
            ServerSocket server = new ServerSocket(port);
            System.out.println("Se inicio el servidor con exito");
            Socket client;
            PrintStream toClient;
            client = server.accept(); //conexion
            BufferedReader fromClient = new BufferedReader(new InputStreamReader(client.getInputStream())); // el lector
            System.out.println("Cliente se conecto");
            String cadena = fromClient.readLine();
            
            toClient = new PrintStream(client.getOutputStream());
            String respuesta= "7";
            toClient.println(respuesta);

            //System.out.println("Cliente se conecto");
            

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }



}
