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

public class Calculadora {
   
//atributos
     int a; 
     int b;
     int totals;
     int totalr;
     int totalm;
     
//metodo
     
    public void preguntar(){
        Scanner o =new Scanner(System.in);
     System.out.println("Ingrese el primer número: ");   
     a = o.nextInt();
   
    System.out.println("Ingrese el segundo número: ");
     b = o.nextInt();
    
    }
     
   
    public void multiplicar (){
      totalm = a * b;
      System.out.println("La multiplicaion es" + totalm);
    }
    
      public void sumar (){
      totals = a + b;
      System.out.println("la suma es" + totals);
    }
    
    public void resta(){
    totalr = a+b;
        System.out.println("La resta es: "+totalr);
    }
      
    
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.preguntar();
        calculadora.sumar();
        calculadora.resta();
        calculadora.multiplicar();
    }
      
  } 

