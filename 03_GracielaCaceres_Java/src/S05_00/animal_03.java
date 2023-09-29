/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S05_00;
import javax.swing.JOptionPane;
/**
 *
 * @author graciela
 */
public class animal_03 {
 
    String nombre;
    String raza;
    int edad;
    String color;

    public void preguntar() {
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del gato: ");
        raza = JOptionPane.showInputDialog("Ingrese la raza del gato: ");
        String edadStr = JOptionPane.showInputDialog("Ingrese la edad del gato: ");
        edad = Integer.parseInt(edadStr);
        color = JOptionPane.showInputDialog("Ingrese el color del gato: ");
    }

    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null, "Nombre del gato: " + nombre);
        JOptionPane.showMessageDialog(null, "Raza del gato: " + raza);
        JOptionPane.showMessageDialog(null, "Edad del gato: " + edad);
        JOptionPane.showMessageDialog(null, "Color del gato: " + color);
    }
}
 

