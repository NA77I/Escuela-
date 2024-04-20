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
public class Alumno extends Persona{
    ArrayList<Materia> carga;

    public Alumno(String nombres, String apellido, int dni) {
        super(nombres, apellido, dni);
    }

    public ArrayList<Materia> getCarga() {
        return carga;
    }

    public void setCarga(ArrayList<Materia> carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Alumno{"+super.toString() + "carga=" + carga + '}';
    }
    
}
