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
public class MateriaPromocionable extends Materia{
    
    double promedio;
    
    public MateriaPromocionable(String nombre) {
        super(nombre);
    }

    public double getPromedio() {
        return promedio;
    }
    
    public void obtenerPromedio(){
        this.promedio=(this.nota1+this.nota2+this.nota3)/3;
    }

    @Override
    public String toString() {
        return "MateriaPromocionable{"+super.toString() + "promedio=" + promedio + '}';
    }

 
}
