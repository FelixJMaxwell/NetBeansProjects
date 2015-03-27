/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg05.cuenta;

/**
 *
 * @author Mante-02
 */

import java.util.Scanner;

public class PruebaCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta Cuenta1 = new Cuenta (50.00);
        Cuenta Cuenta2 = new Cuenta (-7.53);
        
        System.out.printf("Saldo de cuenta 1: $%.2f\n",
                Cuenta1.obtenerSaldo());
        System.out.printf("Saldo de cuenta 2: $%.2f\n",
                Cuenta2.obtenerSaldo());
        
        Scanner entrada = new Scanner (System.in);
        double montoDeposito;
        
        System.out.print("Escriba el monto a depositar para cuenta 1: ");
        montoDeposito = entrada.nextDouble();
        System.out.printf("\nSumando %.2f al saldo de cuenta 1\n\n",
                montoDeposito);
        Cuenta1.abonar(montoDeposito);
        
        System.out.printf("Saldo de cuenta 1: $%.2f\n",
                Cuenta1.obtenerSaldo());
        System.out.printf("Saldo de cuenta 2: $%.2f\n",
                Cuenta2.obtenerSaldo());
        
        System.out.print("Escriba el monto a depositar para cuenta 2: ");
        montoDeposito = entrada.nextDouble();
        System.out.printf("\nSumando %.2f al saldo de cuenta 2\n\n",
                montoDeposito);
        Cuenta2.abonar(montoDeposito);
        
        System.out.printf("Saldo de cuenta 1: $%.2f\n",
                Cuenta1.obtenerSaldo());
        System.out.printf("Saldo de cuenta 2: $%.2f\n",
                Cuenta2.obtenerSaldo());
    }
    
}
