package EJERCICIOS;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class ejercicio6 {
    private static final double PI = Math.PI;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el radio de la circunferencia: ");
        
        if (scanner.hasNextDouble()) {
            double radio = scanner.nextDouble();
            
            if (radio < 0) {
                System.out.println("El radio no puede ser negativo. Intenta de nuevo.");
            } else {
                double longitud = calcularLongitud(radio);
                double area = calcularArea(radio);
                
                System.out.printf("La longitud de la circunferencia es: %.2f%n", longitud);
                System.out.printf("El área de la circunferencia es: %.2f%n", area);
            }
        } else {
            System.out.println("Por favor, introduce un número válido.");
        }
        
        scanner.close();
    }

    public static double calcularLongitud(double radio) {
        return 2 * PI * radio;
    }

    public static double calcularArea(double radio) {
        return PI * Math.pow(radio, 2);
    }
}
