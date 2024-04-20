/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelamejorado;

import java.util.Scanner;

/**
 *
 * @author Pc-03
 */
public class PruebaIIConcepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op=0;
        MateriaPromocionable mp;
        MateriaNoPromocionable mnp;
        Alumno al;
        while (op!=999){
            op=menu();
            switch (op){
                case 1:
                    System.out.println("1.-Materia Promocionable    2.- Materia no promocionable");
                    op=leeEntero();
                    if(op==1){
                        mp=creaMateriaPromocionable();
                        System.out.println(mp.toString());
                    }
                    if(op==2){
                        mnp=creaMateriaNoPromocionable();
                        System.out.println(mnp.toString());
                    }
                    
                    
                    break;
                case 2:
                    al=creaAlumno();
                    System.out.println(al.toString());
            }
        }
        
        
    }
    public static int leeEntero(){
        int n=0;
        Scanner entradaEntero =new Scanner(System.in);
        n=entradaEntero.nextInt();
        return n; 
    }
    public static String leeCadena(){
        String l;
        Scanner entradaCadena =new Scanner(System.in);
        l=entradaCadena.nextLine();
        return l; 
    }
        public static double leeDouble(){
        double d;
        Scanner entradaDouble =new Scanner(System.in);
        d=entradaDouble.nextDouble();
        return d; 
    }
        
    public static int menu(){
        
        System.out.println("Menu");
        System.out.println("1.- Crear materia");
        System.out.println("2.- Crear alumno");
        System.out.println("Dame opcion");
        return leeEntero();
    }
    
    public static  MateriaPromocionable creaMateriaPromocionable(){
        String n;
        System.out.println("Dame el nombre de la materia");
        n=leeCadena();
        MateriaPromocionable m= new MateriaPromocionable(n);
        return m;      
    }
    
     public static  MateriaNoPromocionable creaMateriaNoPromocionable(){
        String n;
        System.out.println("Dame el nombre de la materia");
        n=leeCadena();
        MateriaNoPromocionable m= new MateriaNoPromocionable(n);
        return m;      
    }
     
    public static Alumno creaAlumno(){
        String n;
        String a;
        int dni;
        System.out.println("Dame el nombre del alumno");
        n=leeCadena();
        System.out.println("Dame el apellido del alumno");
        a=leeCadena();
        System.out.println("Dame el dni del alumno");
        dni=leeEntero();
        Alumno al=new Alumno(n,a,dni);
        return al;
                
    }
}