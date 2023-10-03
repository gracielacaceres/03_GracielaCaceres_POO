/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S05_00;

import javax.swing.JOptionPane;

/**
 *
 * @author graciela
 */
public class calculadora_03 {
   
    
    //atributos
    int a; 
    int b;
    int totals;
    int totalr;
    int totalm;
     
    //metodo
     
    public void preguntar(){
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número: "));
    }
     
    public void multiplicar (){
        totalm = a * b;
        JOptionPane.showMessageDialog(null, "La multiplicación es: " + totalm);
    }
    
    public void sumar (){
        totals = a + b;
        JOptionPane.showMessageDialog(null, "La suma es: " + totals);
    }
    
    public void resta(){
        totalr = a - b;
        JOptionPane.showMessageDialog(null, "La resta es: " + totalr);
    }
    
    
}
