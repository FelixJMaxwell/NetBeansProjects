/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package comparacion;

/**
 *
 * @author Mante-02
 */

import java.util.Scanner;

public class Comparacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        
        int numero1;
        int numero2;
        
        System.out.print("Escriba el primer numero: ");
        numero1 = teclado.nextInt();
        
        System.out.print("Escriba el segundo numero: ");
        numero2 = teclado.nextInt();
        
        if (numero1 == numero2)
            System.out.printf("\n%d es igual a %d", numero1, numero2);
        
        if (numero1 != numero2)
            System.out.printf("\n%d es diferente de %d", numero1, numero2);
        
        if (numero1 < numero2)
            System.out.printf("\n%d es menor a %d", numero1, numero2);
        
        if (numero1 > numero2)
            System.out.printf("\n%d es mayor que %d", numero1, numero2);
        
        if (numero1 <= numero2)
            System.out.printf("\n%d es menor o igual a %d", numero1, numero2);
        
        if (numero1 >= numero2)
            System.out.printf("\n%d es mayor o igual que %d", numero1, numero2);
        
        System.out.printf("\n");
    }
    
}
