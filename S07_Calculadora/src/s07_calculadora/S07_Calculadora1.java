/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s07_calculadora;

/**
 *
 * @author graciela
 */
public class S07_Calculadora1 {


    // Métodos
    public int suma(int num1, int num2) {
        return num1 + num2; // Valor de retorno
    }

   
    public int resta(int num1, int num2) {
        return num1 - num2; // Valor de retorno
    }

    public static void main(String[] args) {
        S07_Calculadora1 calculadora = new S07_Calculadora1();

        int resultadoSuma = calculadora.suma(5, 3); 
        int resultadoResta = calculadora.resta(10, 4); 

        System.out.println("Resultado de la suma: " + resultadoSuma);
        System.out.println("Resultado de la resta: " + resultadoResta);
    }
}


  

