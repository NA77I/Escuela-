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
public class MateriaNoPromocionable extends Materia {
    
    double notaFinal;
    
    public MateriaNoPromocionable(String nombre) {
        super(nombre);
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return "MateriaNoPromocionable{"+super.toString() + "notaFinal=" + notaFinal + '}';
    }
    
    
}
