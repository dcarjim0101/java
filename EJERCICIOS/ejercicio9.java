/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double precio_manzana = 2.35;
        final double precio_pera = 1.95;

        double ventasManzanasPrimerSemestre, ventasManzanasSegundoSemestre;
        double ventasPerasPrimerSemestre, ventasPerasSegundoSemestre;

        System.out.print("Ingrese las ventas de manzanas (en kilos) del primer semestre: ");
        ventasManzanasPrimerSemestre = scanner.nextDouble();

        System.out.print("Ingrese las ventas de manzanas (en kilos) del segundo semestre: ");
        ventasManzanasSegundoSemestre = scanner.nextDouble();

        System.out.print("Ingrese las ventas de peras (en kilos) del primer semestre: ");
        ventasPerasPrimerSemestre = scanner.nextDouble();

        System.out.print("Ingrese las ventas de peras (en kilos) del segundo semestre: ");
        ventasPerasSegundoSemestre = scanner.nextDouble();

        double totalManzanas = (ventasManzanasPrimerSemestre + ventasManzanasSegundoSemestre) * precio_manzana;
        double totalPeras = (ventasPerasPrimerSemestre + ventasPerasSegundoSemestre) * precio_pera;

        double importeTotal = totalManzanas + totalPeras;

        System.out.printf("El importe total de las ventas anuales es: %.2f€%n", importeTotal);
        
        scanner.close();
    }
}
