/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg03_gracielacaceres_java;
 import javax.swing.JOptionPane;
/**
 *
 * @author graciela
 */
public class Estudiante_03 {
 

    // Atributos 
    private String nombre;
    private int edad;
    private String libroFavorito;

    // Métodos
    public void ingresarDatos() {
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        String edadStr = JOptionPane.showInputDialog("Ingrese la edad del estudiante:");
        edad = Integer.parseInt(edadStr);
        libroFavorito = JOptionPane.showInputDialog("Ingrese el libro favorito del estudiante:");
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Datos del estudiante: " +
                "Nombre: " + nombre + "" +
                "Edad: " + edad + " años" +
                "Libro Favorito: " + libroFavorito);
    }

    public static void main(String[] args) {
  
        Estudiante_03 estudiante = new Estudiante_03();
        estudiante.ingresarDatos();
        estudiante.mostrarDatos();
    }
}


