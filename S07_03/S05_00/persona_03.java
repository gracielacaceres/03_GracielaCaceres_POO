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
public class persona_03 {
    
    String nombre;
    int edad;
    String ciudadOrigen;

    public void preguntar() {
        nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona: ");
        String edadStr = JOptionPane.showInputDialog("Ingrese la edad de la persona: ");
        edad = Integer.parseInt(edadStr);
        ciudadOrigen = JOptionPane.showInputDialog("Ingrese la ciudad de origen de la persona: ");
    }

    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null, "Nombre de la persona: " + nombre);
        JOptionPane.showMessageDialog(null, "Edad de la persona: " + edad);
        JOptionPane.showMessageDialog(null, "Ciudad de origen de la persona: " + ciudadOrigen);
    }

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.preguntar();
        persona.mostrarInfo();

        int edadPersona = persona.edad;
        int edadEnMeses = edadPersona * 12;
        int edadEnDias = edadPersona * 365; 

        JOptionPane.showMessageDialog(null, "Edad de la persona en meses: " + edadEnMeses);
        JOptionPane.showMessageDialog(null, "Edad de la persona en días: " + edadEnDias);
    }
}

    

