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
public class libro_03 {
  



    // Atributos
    private String titulo;
    private String autor;
    private int añoPublicacion;

    // Métodos
    public void ingresarDatos() {
        titulo = JOptionPane.showInputDialog("Ingrese el título del libro:");
        autor = JOptionPane.showInputDialog("Ingrese el autor del libro:");
        String añoStr = JOptionPane.showInputDialog("Ingrese el año de publicación del libro:");
        añoPublicacion = Integer.parseInt(añoStr);
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Información del libro: " +
                "Título: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Año de Publicación: " + añoPublicacion);
    }

    public static void main(String[] args) {

        libro_03 libro = new libro_03();
        libro.ingresarDatos();
        libro.mostrarDatos();
    }
}

}
