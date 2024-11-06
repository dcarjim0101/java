/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package EJERCICIOS;

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce la nota del primer trimestre: ");
        int nota1 = scanner.nextInt();
        
        System.out.print("Introduce la nota del segundo trimestre: ");
        int nota2 = scanner.nextInt();
        
        System.out.print("Introduce la nota del tercer trimestre: ");
        int nota3 = scanner.nextInt();
        
        double mediaDecimal = (nota1 + nota2 + nota3) / 3.0;
        
        int mediaEntera = (int) mediaDecimal;
        
        System.out.println("nota del boletín de calificaciones : " + mediaEntera);
        System.out.println("nota del expediente académico : " + mediaDecimal);
        
        scanner.close();
    }
}
