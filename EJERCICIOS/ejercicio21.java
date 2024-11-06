/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package EJERCICIOS;

import java.util.Scanner;

public class ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese el numero del mes (1-12): ");
        int mes = scanner.nextInt();
        System.out.print("ingrese el año: ");
        int año = scanner.nextInt();

        
        
        int dias;
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                break;
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
            case 2:
                dias = (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) ? 29 : 28;
                break;
            default:
                dias = -1;
        }

        if (dias == -1) {
            System.out.println("mes no valido.");
        } else {
            System.out.println("el mes " + mes + " del año " + año + " tiene " + dias + " dias");
        }
        
        scanner.close();
    }
}
