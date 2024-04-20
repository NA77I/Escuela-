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
public class Grupo {
    static int contadorGrupo=0;
    int idGrupo;
    int curso;
    String division;
    ArrayList<Alumno> alumnos;
    Docente profe;

    public Grupo(int curso, String division) {
        contadorGrupo+=1;
        this.idGrupo=contadorGrupo;
        this.curso = curso;
        this.division = division;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public Docente getProfe() {
        return profe;
    }

    public void setProfe(Docente profe) {
        this.profe = profe;
    }

    @Override
    public String toString() {
        return "Grupo{" + "idGrupo=" + idGrupo + ", curso=" + curso + ", division=" + division + ", alumnos=" + alumnos + ", profe=" + profe + '}';
    }
    
    
    
}
