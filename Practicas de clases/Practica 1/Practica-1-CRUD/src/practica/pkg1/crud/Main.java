/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg1.crud;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author newma
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Docente cbm = new Docente("Carlos", "1111111");
        Materias SIS258 = new Materias("Sistemas Distribuidos", "SIS258", cbm);
        Materias SIS256 = new Materias("Desarrolo web", "SIS256", cbm);
        Materias[] soloSIS258= new Materias[1];
        soloSIS258[0]=SIS258;
        Materias[] soloSIS256 = new Materias[1];
        soloSIS256[0]=SIS256;
        Materias[] ambas = new Materias[2];
        ambas[0]=SIS258;
        ambas[1]=SIS256;
        List<Alumno> al = new ArrayList<Alumno>();

        Scanner sc = new Scanner(System.in);
        Scanner datos = new Scanner(System.in);

        int ch;
        do {
            System.out.println("1:Insertar Alumno");
            System.out.println("2:Mostrar Alumnos");
            System.out.println("3:Eliminar Alumno");
            System.out.println("4:Modificar Alumno");
            System.out.println("0:Salir");
            System.out.println("Indica la opcion que deseeas ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:

                    System.out.println("Insertar Nombre o Nombres del Alumno");
                    String nombre = datos.nextLine();
                    System.out.println("Insertar Apellidos del Alumno");
                    String apellidos = datos.nextLine();
                    System.out.println("Insertar CI");
                    String CI = datos.nextLine();
                    System.out.println("Insertar CU");
                    String CU = datos.nextLine();
                    System.out.println("Selccione las materias:");
                    System.out.println("1:SIS 256");
                    System.out.println("2:SIS 258");
                    System.out.println("3:Ambas");
                    int opc = sc.nextInt();
                    switch(opc){
                        case 1 -> al.add(new Alumno(nombre, apellidos, CI, CU, soloSIS258));
                        case 2 -> al.add(new Alumno(nombre, apellidos, CI, CU, soloSIS256));
                        case 3 -> al.add(new Alumno(nombre, apellidos, CI, CU, ambas));
                    
                    }
                
                    


                   
                    break;


                case 2:
                    System.out.println("-----------------------");
                    Iterator<Alumno> i = al.iterator();
                    while (i.hasNext()) {
                        Alumno a = i.next();
                        System.out.println(a);

                    }
                    System.out.println("-----------------------");
                    break;
                case 3:
                    boolean eliminar = false;
                    System.out.println("Insertar CI del alumno a eliminar");
                    String CIA = datos.nextLine();
                    System.out.println("--------------------------");
                    i = al.iterator();
                    while (i.hasNext()) {
                        Alumno a = i.next();
                        String datoA = a.getCI();
                        if (datoA.equals(CIA)) {
                            i.remove();
                            eliminar = true;
                        }
                    }
                    if (!eliminar) {
                        System.out.println("Alumno no encontrado");
                    } else {
                        System.out.println("Alumno Eliminado");
                    }
                    System.out.println("-----------------------");

                    break;
                case 4:
                    eliminar = false;
                    System.out.println("Insertar CI del alumno a Modificar");
                    CI = datos.nextLine();
                    System.out.println("--------------------------");
                    ListIterator<Alumno> li = al.listIterator();
                    while (li.hasNext()) {
                        Alumno a = li.next();
                        String datoA = a.getCI();

                        if (datoA.equals(CI)) {
                            System.out.println("Ingrese Nuevo Nombre");
                            nombre = datos.nextLine();
                            System.out.println("Ingrese nuevo apellido ");
                            apellidos = datos.nextLine();
                            System.out.println("Inserta Nuevo CI");
                            CI = datos.nextLine();
                            System.out.println("Inserta nuevo CU");
                            CU = datos.nextLine();

                            li.set(new Alumno(nombre, apellidos, CI, CU, soloSIS258));

                            eliminar = true;
                        }
                    }
                    if (!eliminar) {
                        System.out.println("Alumno no encontrado");
                    } else {
                        System.out.println("Alumno Actulizado");
                    }
                    System.out.println("-----------------------");

                    break;

            }

        } while (ch != 0);
    }

}
