/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

import java.util.Scanner;

public class ejercicio12 {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("introduce un numero: ");
            double numero = scanner.nextDouble();
            
            double valorAbsoluto = Math.abs(numero);
            
            System.out.println("el valor absoluto es: " + valorAbsoluto);
        }
    }
}
