/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

import java.util.Scanner;


public class ejercicio2 {

    public static void main(String[] args) {
        //TODO Entrada
        try(Scanner scanner = new Scanner(System.in)){
        System.out.println("¿que edad tienes? ");
        int edadactual = scanner.nextInt();
        int edadfutura = edadactual + 1;
        System.out.println("el año que viene tendras " + edadfutura);
    }
}
}