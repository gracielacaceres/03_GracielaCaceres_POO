/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s07_calculadora;

/**
 *
 * @author graciela
 */
public class S07_Calculadora {

    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

   
    public int restar(int num1, int num2) {
        return num1 - num2;
    }

    public static void main(String[] args) {
        S07_Calculadora calculadora = new S07_Calculadora();

        int resultadoSuma = calculadora.sumar(5, 3); 
        int resultadoResta = calculadora.restar(10, 4); 

        System.out.println("Resultado de la suma: " + resultadoSuma);
        System.out.println("Resultado de la resta: " + resultadoResta);
    }
    
}
