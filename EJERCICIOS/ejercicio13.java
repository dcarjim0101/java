/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

import java.util.Scanner;

public class ejercicio13 {

    public static void main(String[] args) {
        // Expresión 1
        boolean resultado1 = 10 + 5 * 2 > 20 && 4 == 4;
        System.out.println("Expresión 1: 10 + 5 * 2 > 20 && 4 == 4 -> " + resultado1);

        // Expresión 2
        boolean resultado2 = (7 + 3 > 10) || 3 * 2 <= 6;
        System.out.println("Expresión 2: (7 + 3 > 10) || 3 * 2 <= 6 -> " + resultado2);

        // Expresión 3
        boolean resultado3 = 10 / 2 + 3 * 5 == 19 && true;
        System.out.println("Expresión 3: 10 / 2 + 3 * 5 == 19 && true -> " + resultado3);

        // Expresión 4
        int x = 5;
        x += 3 * 2;
        System.out.println("Expresión 4: int x = 5; x += 3 * 2 -> x = " + x);

        // Expresión 5
        boolean b = false;
        b = b || 7 % 2 == 1;
        System.out.println("Expresión 5: boolean b = false; b = b || 7 % 2 == 1 -> b = " + b);
    }
}
