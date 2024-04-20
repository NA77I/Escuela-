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
public class Trabajador extends Persona {
     protected double sueldo;

    public Trabajador(String nombres, String apellido, int dni,double sueldo) {
        super(nombres, apellido, dni);
        this.sueldo=sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}
