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
public class Cuenta {
    
    private double saldo;
    
    public Cuenta (double SaldoInicial)
    {
        if (SaldoInicial > 0.0)
            saldo = SaldoInicial;
        
    }
    
    public void abonar(double monto)
    {
        saldo = saldo + monto;
    }
    
    public double obtenerSaldo()
    {
        return saldo;
    }
}
