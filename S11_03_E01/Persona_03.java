/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_03_E01;

/**
 *
 * @author graciela
 */
public class Persona_03 {
   
    private String nombre;
    private int edad;

    public Persona_03(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }

    public void cumpleaños() {
        edad++;
        System.out.println("Feliz cumpleaños, ahora tengo " + edad + " años.");
    }
}

    
    
    
  
