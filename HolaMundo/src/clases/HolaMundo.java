/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 *
 * @author Mante-02
 */
public class HolaMundo {
    
    public static void main (String [] args)
    {
        //Error: Main class not found, primero Guardar cambios #LOL
        //impresion de mensajes con variantes de print.
        System.out.printf("Hola Mundo!"); // se imprime en una linea
        System.out.println("Hola Mundo!"); // se imprime en una linea y da un salto de linea,
        System.out.print("Hola Mundo!");// se imprime una linea en pantalla.
        
        System.out.printf("\n"); // salto de linea;
        System.out.printf("\tTabulacion!");
        System.out.printf("\r Retorno de Carro");
        System.out.printf("\n");
        System.out.printf("\"Entre Comillas\"");
        System.out.printf("\n");
        
        System.out.printf ("Ejemplo, printf");
        System.out.println("-println");
        
        System.out.printf("%s\n%s\n","\nCorrecto", "uso de printf");
    }
    
}
