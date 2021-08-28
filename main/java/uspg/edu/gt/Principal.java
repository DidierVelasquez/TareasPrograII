/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu.gt;


import java.util.Scanner;
import uspg.edu.model.Estudiante;
import uspg.edu.model.Persona;



public class Principal {


    public static  Scanner sc  = new  Scanner (System.in);

     public  static void main (String[] args){
        
        System.out.println("Ingrese los Estudiantes a grabar");
        
        int tamañoArreglo = sc.nextInt();
        
        Estudiante ArregloDeEstudiante [] = new Estudiante [tamañoArreglo];
        
        for (int i = 0 ; i < ArregloDeEstudiante.length; i++){
        
        Estudiante estudiante = new Estudiante();
 
        System.out.println("Ingrese Carnet");
        estudiante.setCarnet (sc.nextInt());
        
        System.out.println ("===================================");
        
        System.out.println("Ingrese Nombre");
        estudiante.setNombre(sc.next());
        System.out.println("Ingrese Apellido");
        estudiante.setApellido(sc.next());
        System.out.println("Ingrese Edad");
        estudiante.setEdad(sc.next());
        System.out.println("Ingrese Carnet");
        estudiante.setCarnet(sc.nextInt());
        
        
        System.out.println ("===================================");
        
        ArregloDeEstudiante [i] = estudiante;
        
    }
        for (int i = 0 ; i < ArregloDeEstudiante.length; i++){
            
            ArregloDeEstudiante [i].Datos();
            System.out.println ("===================================");
    }
        
    }
    
    public static void main(Integer[] args) {
       
      
        System.out.println("Ingrese los ID a grabar");
        
        int tamañoArreglo = sc.nextInt();
        
        Persona ArregloDePersona [] = new Persona [tamañoArreglo];
        
        for (int i = 0 ; i < ArregloDePersona.length; i++){
        
        Persona persona1 = new Persona();
 
        System.out.println("Ingrese ID");
        persona1.setID (sc.nextInt());
        
        System.out.println ("===================================");
        
        System.out.println("Ingrese Nombre");
        persona1.setNombres(sc.next());
        System.out.println("Ingrese Apellido");
        persona1.setApellidos(sc.next());
        System.out.println("Ingrese FechaNac");
        persona1.setFechaDeNac(sc.next());
        System.out.println("Ingrese DPI");
        persona1.setDPI(sc.nextInt());
        System.out.println("Ingrese Sexo");
        persona1.setSexo(sc.next());
        System.out.println("Ingrese Telefono");
        persona1.setTelefono(sc.nextInt());
        
        System.out.println ("===================================");
        
        ArregloDePersona [i] = persona1;
        
    }
        for (int i = 0 ; i < ArregloDePersona.length; i++){
            
            ArregloDePersona [i].Datos();
            System.out.println ("===================================");
    }
  }

    
    
}

  
