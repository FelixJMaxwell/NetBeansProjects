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
public class LibroCalificaciones {
    
    private String nombreDelCurso;
    
    public LibroCalificaciones (String nombre)
    {
        nombreDelCurso = nombre;
    }
    
    public void establecerNombreDelCurso(String nombre)
    {
        nombreDelCurso = nombre;
    }
    
    public String obtenerNombreDelCurso()
    {
        return nombreDelCurso;
    }
    
    public void mostrarMensaje()
    {
        System.out.printf("Bienvenido al Libro de Calificaciones para\n%s!\n", 
                obtenerNombreDelCurso() );
    }
}
