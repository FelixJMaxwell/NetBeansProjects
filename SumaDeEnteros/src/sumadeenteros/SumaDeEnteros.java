/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sumadeenteros;

/**
 *
 * @author Mante-02
 */
import java.util.Scanner;
public class SumaDeEnteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        
        //Declaracion de variables
        int numero1;
        int numero2;
        int suma;
        
        //Petición del primer valor a sumar
        System.out.print("Escriba el primer numero:");
        numero1 = teclado.nextInt(); //nextInt() almacena lo que se obtiene del teclado en la variable "numero1"
        
        //Peticion del segundo valor a sumar
        System.out.print("Escriba el segundo numero:");
        numero2 = teclado.nextInt();
        
        //suma de ambas variables con valores ya asignados arriba
        suma = numero1 + numero2;
        
        //impresion de la suma de ambos numeros
        System.out.printf("La suma de %d mas %d es: %d\n", numero1, numero2, suma);
    }
    
}
