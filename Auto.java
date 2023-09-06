/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg03_gracielacáceres;

/**
 *
 * @author graciela
 */

import javax.swing.JOptionPane;
public class Auto {
    
//Atributos
    String modelo;
    String color;
    String kl;
 
    
//Metodos
    public void preguntar(){
    modelo = JOptionPane.showInputDialog("¿Qué modelo es? ") ;
    color = JOptionPane.showInputDialog("¿Qué color tiene el auto? ") ;
    kl = JOptionPane.showInputDialog("¿Cuantos kl recorre ? ") ;
    }
    
   public void responde(){
   JOptionPane.showMessageDialog(null,"El Auto es: " + modelo + " , recorre : "+ kl +"y es de color: " + color +".");
   }

   public static void main(String[] args) {
        Auto auto = new Auto();
        auto.preguntar();
        auto.responde();
    }
}
    

