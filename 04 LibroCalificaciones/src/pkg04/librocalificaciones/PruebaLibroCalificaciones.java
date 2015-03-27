/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg04.librocalificaciones;

/**
 *
 * @author Mante-02
 */
import java.util.Scanner;

public class PruebaLibroCalificaciones {
    
    public static void main (String[] args)
    {
        LibroCalificaciones libroCalificaciones1 = new LibroCalificaciones(
        "Programacion en Java 1");
        LibroCalificaciones libroCalificaciones2 = new LibroCalificaciones(
        "Programacion en Java 2");
        
        System.out.printf("El nombre del curso 1 es: %s\n", 
                libroCalificaciones1.obtenerNombreDelCurso());
        System.out.printf("El nombre del curso 2 es: %s\n",
                libroCalificaciones2.obtenerNombreDelCurso());
        
        /*
        Scanner entrada = new Scanner(System.in);
        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones();
        
        System.out.printf("El nombre del curso actual es: %s\n\n", 
                miLibroCalificaciones.obtenerNombreDelCurso() );
       
        System.out.println("Esibe el nombre del curso: ");
        String elNombre = entrada.nextLine();
        miLibroCalificaciones.establecerNombreDelCurso( elNombre );
        
        miLibroCalificaciones.mostrarMensaje();*/
    }
}
