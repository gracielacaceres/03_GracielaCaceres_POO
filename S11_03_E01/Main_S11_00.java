package S11_03_E01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Main_S11_00 {
    public static void main(String[] args) {
        // Crear objetos de las clases
        Persona_03 persona = new Persona_03("Juan", 30);
        Estudiante_03 estudiante = new Estudiante_03("María", 20, "Escuela XYZ", 2);
        Profesor_03 profesor = new Profesor_03("Luis", 50, "Matemáticas", "Universidad ABC");

        // Llamar a métodos de las clases
        persona.saludar();
        persona.cumpleaños();

        estudiante.saludar();
        estudiante.estudiar();
        estudiante.avanzarGrado();
        
        profesor.saludar();
        profesor.darClase();
        profesor.realizarInvestigacion();
    }
}
