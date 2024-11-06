/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package EJERCICIOS;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ingresa el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("ingresa el segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.print("ingresa el tercer numero: ");
        int num3 = scanner.nextInt();

        int[] numeros = {num1, num2, num3};

        Arrays.sort(numeros);

        System.out.println("los numeros de mayor a menor son: " + numeros[2] + ", " + numeros[1] + ", " + numeros[0]);

        scanner.close();
    }
}
