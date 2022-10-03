/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg3.invertir.cadenas.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author newma
 */
public class ClienteTCP {

    public static void main(String[] args) {
        int port = 5002;
        Scanner sc = new Scanner(System.in);
        try {
            Socket client = new Socket("localhost", port);
            PrintStream toServer = new PrintStream(client.getOutputStream());
            BufferedReader fromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            //toServer.println("SIS-258");
            System.out.println("Inserte cadena a Invertir");
            String cadena = sc.nextLine();
            toServer.println(cadena);
            String result = fromServer.readLine();
            System.out.println("cadena devuelta es: " + result);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
