/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelamejorado;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Natalia ibanez
 */
public class PruebaIIConcepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
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
        al.toStrin();
        
        String n;
        String a;
        int dni;
        double sueldo;
        System.out.println("Dame el nombre del docente");
        n=leeCadena();
        System.out.println("Dame el apellido del docente");
        a=leeCadena();
        System.out.println("Dame el dni del docente");
        dni=leeEntero();
        System.out.println("Dame el salario del docente");
        sueldo=leeDouble();
        Docente doc=new Docente(n,a,dni,sueldo);
        doc.toString();
        
        
        
        
        
        
        */
        
        
        
        
        
        int op=0;
        MateriaPromocionable mp;
        MateriaNoPromocionable mnp;
        Alumno al;
        Docente doc;
        Grupo gr;
        Administrativo ad;
        Escuela es;
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
                    break;
                case 3:
                    doc=creaDocente();
                    System.out.println(doc.toString());
                    break;
                case 4:
                    gr=creaGrupo();
                    System.out.println(gr.toString());
                    break;
                case 5:
                    ad=creaAdmin();
                    System.out.println(ad.toString());
                    break;
                case 6:
                    es=creaEscuela();
                    System.out.println(es.toString());
                    
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
        System.out.println("3.- Crear docente");
         System.out.println("4.- Crear grupo");
         System.out.println("5.- Crear admin");
         System.out.println("6.-Crear escuela");
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
    
    public static Docente creaDocente(){
        String n;
        String a;
        int dni;
        double sueldo;
        System.out.println("Dame el nombre del docente");
        n=leeCadena();
        System.out.println("Dame el apellido del docente");
        a=leeCadena();
        System.out.println("Dame el dni del docente");
        dni=leeEntero();
        System.out.println("Dame el salario del docente");
        sueldo=leeDouble();
        Docente doc=new Docente(n,a,dni,sueldo);
        return doc;           
    }
    
     public static Administrativo creaAdmin(){
        String n;
        String a;
        int dni;
        double sueldo;
        String cargo;
        System.out.println("Dame el nombre del admin");
        n=leeCadena();
        System.out.println("Dame el apellido del admin");
        a=leeCadena();
        System.out.println("Dame el dni del admin");
        dni=leeEntero();
        System.out.println("Dame el salario del admin");
        sueldo=leeDouble();
        System.out.println("Dame el cargo del admin");
        cargo=leeCadena();
        Administrativo ad=new Administrativo(n,a,dni,sueldo,cargo);
        return ad;           
    }
    
    
    public static Grupo creaGrupo(){
        int c;
        String d;
        ArrayList<Alumno> estudiantes=new ArrayList<Alumno>();
        Alumno a;
        Docente doc;
        System.out.println("Dame grado del curso");
        c=leeEntero();
        System.out.println("Dame la division");
        d=leeCadena();
        estudiantes.add(creaAlumno());
        estudiantes.add(creaAlumno());
        doc= creaDocente();
        Grupo gr= new Grupo(c,d);
        
        gr.setAlumnos(estudiantes);
        gr.setProfe(doc);
        return gr;
        
        
    }
    public static Escuela creaEscuela(){
        String n;
        int cue;
        Administrativo ad;
        ArrayList<Grupo> cursos=new ArrayList<Grupo>();
        System.out.println("Dame el nombre de la escuela");
        n=leeCadena();
        System.out.println("Dame el cue de la escuela");
        cue=leeEntero();
        ad=creaAdmin();
        Escuela es =new Escuela (n,cue,ad);
        cursos.add(creaGrupo());
        cursos.add(creaGrupo());
        es.setCursos(cursos);
        return es;
        
    }
    
    
    
}