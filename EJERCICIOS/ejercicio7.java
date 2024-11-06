/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");

        boolean numero = scanner.hasNextInt();
        int edad = numero ? scanner.nextInt() : -1;

        boolean esMayorDeEdad = (edad >= 18) && (edad >= 0);

        System.out.println("¿Es mayor de edad? " + (numero && edad >= 0 ? esMayorDeEdad : "Entrada no válida"));

        scanner.close();
    }
}
