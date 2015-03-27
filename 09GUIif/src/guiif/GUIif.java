/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guiif;

/**
 *
 * @author Mante-02
 */

import javax.swing.JOptionPane;

public class GUIif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroUno, numeroDos;
        
        String numero1 =
                JOptionPane.showInputDialog("Primer Numero:");
                numeroUno = Integer.parseInt(numero1);
        
        String numero2 =
                JOptionPane.showInputDialog("Segundo Numero:");
                numeroDos = Integer.parseInt(numero2);
                
        if (numeroUno < numeroDos)
        {
            String mensajeUno =
                    String.format("El numero %s es menor que %s", numeroUno,numeroDos);
            JOptionPane.showMessageDialog(null, mensajeUno);
        }
        
        if (numeroUno == numeroDos)
        {
            String mensajeDos =
                    String.format("El numero %s es igual a %s", numeroUno, numeroDos);
            JOptionPane.showMessageDialog(null, mensajeDos);
        }
        
        if (numeroUno > numeroDos)
        {
            String mensajeTres =
                    String.format("El numero %s es mayor que %s", numeroUno, numeroDos);
            JOptionPane.showMessageDialog(null, mensajeTres);
        }
    }
    
}
