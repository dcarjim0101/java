/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Está lloviendo? (true/false): ");
        boolean estaLloviendo = scanner.nextBoolean();

        System.out.print("¿Has terminado tus tareas? (true/false): ");
        boolean tareasTerminadas = scanner.nextBoolean();

        System.out.print("¿Necesitas ir a la biblioteca? (true/false): ");
        boolean irABiblioteca = scanner.nextBoolean();

        boolean puedeSalir;
        if (irABiblioteca) {
            puedeSalir = true;
        } else {
            puedeSalir = !estaLloviendo && tareasTerminadas;
        }

        System.out.println("¿Se puede salir a la calle? " + puedeSalir);
        
        scanner.close();
    }
}
