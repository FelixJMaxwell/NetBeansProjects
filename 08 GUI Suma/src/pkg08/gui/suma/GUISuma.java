/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg08.gui.suma;

/**
 *
 * @author Mante-02
 */
import javax.swing.JOptionPane;
public class GUISuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int numeroUno, numeroDos, resultado;
            
            String numero1 = 
                    JOptionPane.showInputDialog("Primer número:");
            numeroUno = Integer.parseInt(numero1);
            
            String numero2 =
                    JOptionPane.showInputDialog("Segundo número:");
            numeroDos = Integer.parseInt(numero2);
            
            resultado = numeroUno + numeroDos;
            
            String mensaje =
                    String.format("El resultado es:%s", resultado);
            
            JOptionPane.showMessageDialog(null, mensaje);
    }
}
