/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_03_E01;


public class Profesor_03 extends Persona_03 {
    private String materia;
    private String universidad;

    public Profesor_03(String nombre, int edad, String materia, String universidad) {
        super(nombre, edad);
        this.materia = materia;
        this.universidad = universidad;
    }

    public void darClase() {
        System.out.println("Soy profesor de " + materia + " en la Universidad " + universidad + " y estoy dando clases.");
    }

    public void realizarInvestigacion() {
        System.out.println("Estoy realizando investigaciones en el campo de " + materia + ".");
    }
}

