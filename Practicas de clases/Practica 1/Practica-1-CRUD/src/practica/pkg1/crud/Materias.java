/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg1.crud;

/**
 *
 * @author newma
 */
class Materias {
    private String nombre;
    private String sigla;
    private Docente docente;

    public Materias(String nombre, String sigla, Docente docente) {
        this.nombre = nombre;
        this.sigla = sigla;
        this.docente = docente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    @Override
    public String toString() {
        return "Materias{" + "nombre=" + nombre + ", sigla=" + sigla + ", docente=" + docente + '}';
    }
    
}
