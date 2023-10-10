/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_03_E01;

public class Estudiante_03 extend Persona_03 {
    
    private final String escuela;
    private int grado;
    private String especialidad;

    public Estudiante_03(String nombre, int edad, String escuela, int grado) {
        super(nombre, edad);
        this.escuela = escuela;
        this.grado = grado;
        this.especialidad = especialidad;
    }

    public void estudiar() {
        System.out.println("Soy estudiante de la escuela " + escuela + " y estoy estudiando " + especialidad + ".");
    }

    public void avanzarGrado() {
        grado++;
        System.out.println("Avancé al grado " + grado + ".");
    }

    void saludar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

    
