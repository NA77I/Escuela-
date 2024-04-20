/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelamejorado;

/**
 *
 * @author Pc-03
 */
public class Persona {
    
    protected String idPersona;
    protected String nombres;
    protected String apellido;
    protected int dni;

    public Persona(String nombres, String apellido, int dni) {
        this.nombres = nombres;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public int getDni() {
        return dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombres=" + nombres + ", apellido=" + apellido + ", dni=" + dni + '}';
    }
    
    
}
