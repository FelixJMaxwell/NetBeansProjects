/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg07.gui.nombre;

/**
 *
 * @author Mante-02
 */
import javax.swing.JOptionPane;
public class GUINombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre =
                JOptionPane.showInputDialog("¿Cuales es su nombre?");
        
        String mensaje =
                String.format("Bienvenido, %s, a la programacion en java ", nombre);
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
}
