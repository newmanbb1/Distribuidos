/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg1.crud;

/**
 *
 * @author Jhon Ramirez
 */
public class Alumno {

    private String nombres;
    private String Apellidos;
    private String CI;
    private String Cu;
    Materias[] materias;

    public Alumno() {
    }

    public Alumno(String nombres, String Apellidos, String CI, String Cu, Materias[] materias) {
        this.nombres = nombres;
        this.Apellidos = Apellidos;
        this.CI = CI;
        this.Cu = Cu;
        this.materias = materias;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public String getCu() {
        return Cu;
    }

    public void setCu(String Cu) {
        this.Cu = Cu;
    }

    public Materias[] getMaterias() {
        return materias;
    }

    public void setMaterias(Materias[] materias) {
        this.materias = materias;
    }

    @Override
    public String toString() {
        String cadena =" ";
        for (Materias aux: materias){
        cadena += aux.getNombre()+",";
        }
        return "Alumno{" + "nombres=" + nombres + ", Apellidos=" + Apellidos + ", CI=" + CI + ", Cu=" + Cu + ", materias=" + cadena + '}';
    }

  

}
