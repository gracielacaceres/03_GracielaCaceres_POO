/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg03_gracielacáceres;

/**
 *
 * @author graciela
 */

import java.util.Scanner;

public class Persona {
    String nombre;
    int edad;

    public void pedirDatos() {
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre: ");
        nombre = scanner.nextLine();
        
        System.out.print("Ingrese la edad: ");
        edad = scanner.nextInt();
        
        scanner.close();
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.pedirDatos();
        
        System.out.println("Nombre: " + persona1.nombre);
        System.out.println("Edad: " + persona1.edad);
    }
}


