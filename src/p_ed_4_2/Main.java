/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p_ed_4_2;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int opcion;
        
        do {

            System.out.println("Introduzca un número para activar la función deseada.");
            System.out.println("1. Sumar dos números");
            System.out.println("2. Restar dos números");
            System.out.println("3. Salir");

            opcion = scan.nextInt();
            double num1;
            double num2;

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el primer número: ");
                    num1 = scan.nextDouble();
                    System.out.println("Introduce el segundo número: ");
                    num2 = scan.nextDouble();
                    Calculadora.sumar(num1, num2);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Introduce el primer número: ");
                    num1 = scan.nextDouble();
                    System.out.println("Introduce el número a restar: ");
                    num2 = scan.nextDouble();
                    Calculadora.sumar(num1, num2);
                    System.out.println();
                    break;

                case 3:
                    break;
            }

        } while (opcion != 3);

    }
}
