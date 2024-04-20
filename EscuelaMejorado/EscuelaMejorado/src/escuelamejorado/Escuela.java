/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelamejorado;

import java.util.ArrayList;

/**
 *
 * @author Pc-03
 */
public class Escuela {
    int idEscuela;
    String nombre;
    int cue;
    ArrayList<Grupo> cursos;
    Administrativo director;

    
    public Escuela(String nombre, int cue, Administrativo director) {
        this.nombre = nombre;
        this.cue = cue;
        this.director = director;
    }

    public int getIdEscuela() {
        return idEscuela;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCue() {
        return cue;
    }

    public ArrayList<Grupo> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Grupo> cursos) {
        this.cursos = cursos;
    }

    public Administrativo getDirector() {
        return director;
    }

    public void setDirector(Administrativo director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Escuela{" + "idEscuela=" + idEscuela + ", nombre=" + nombre + ", cue=" + cue + ", cursos=" + cursos + ", director=" + director + '}';
    }
    
    
    
}
