/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg03_gracielacaceres_java;
import javax.swing.JOptionPane;

public class CuentaBancaria_03 {
    // Atributos de la clase CuentaBancaria
    private String titular;
    private String numeroCuenta;
    private double saldo;

    // Método para ingresar datos utilizando JOptionPane
    public void ingresarDatos() {
        titular = JOptionPane.showInputDialog("Ingrese el titular de la cuenta bancaria:");
        numeroCuenta = JOptionPane.showInputDialog("Ingrese el número de cuenta bancaria:");
        String saldoStr = JOptionPane.showInputDialog("Ingrese el saldo de la cuenta bancaria:");
        saldo = Double.parseDouble(saldoStr);
    }

    // Método para mostrar datos utilizando JOptionPane
    public void mostrarDatos() {
        String mensaje = """
                         Datos de la cuenta bancaria:
                         
                         Titular: """ + titular + "\n" +
                "Número de Cuenta: " + numeroCuenta + "\n" +
                "Saldo: $" + saldo;
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase CuentaBancaria_03
        CuentaBancaria_03 cuenta = new CuentaBancaria_03();

        // Ingresar datos de la cuenta bancaria
        cuenta.ingresarDatos();

        // Mostrar los datos de la cuenta bancaria
        cuenta.mostrarDatos();
    }
}

