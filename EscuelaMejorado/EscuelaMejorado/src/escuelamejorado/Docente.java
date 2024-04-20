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
public class Docente extends Trabajador{
    
    int horasCatedra;
    
    public Docente(String nombres, String apellido, int dni, double sueldo) {
        super(nombres, apellido, dni, sueldo);
    }

    public int getHorasCatedra() {
        return horasCatedra;
    }

    public void setHorasCatedra(int horasCatedra) {
        this.horasCatedra = horasCatedra;
    }

    @Override
    public String toString() {
        return "Docente{" +super.toString()+ "horasCatedra=" + horasCatedra + '}';
    }
    
    
    
}
