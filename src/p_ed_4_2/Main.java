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
            System.out.println("3. Ecuación de segundo grado");
            System.out.println("4. Calcular Sen Cos Tan de un angulo");
            System.out.println("5. Multiplicación");
            System.out.println("6. División");
            System.out.println("7. Salir");

            opcion = scan.nextInt();
            double num1;
            double num2;
            double num3;

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
                    System.out.println("Para una ecuación ax2 bx c = 0 ");
                    System.out.println("Introduce a: ");
                    num1 = scan.nextDouble();
                    System.out.println("Introduce b: ");
                    num2 = scan.nextDouble();
                    System.out.println("Introduce c: ");
                    num3 = scan.nextDouble();
                    Calculadora.ecuacionSegundoGrado(num1, num2, num3);
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Para calcular el seno, el coseno y la tangente");
                    System.out.println("Introduzca el angulo");
                    num1 = scan.nextDouble();
                    Calculadora.calcularSenCosTan(num1);
                    System.out.println();
                    break;
                    
                case 5:
                    System.out.println("Introduzca el primer numero: ");
                    int numero1 = scan.nextInt();
                    System.out.println("Introduzca el segundo numero: ");
                    int numero2 = scan.nextInt();
                    System.out.println("Resultado de la multiplicacion: " + 
                            Calculadora.multiplicar(numero1, numero2));
                    System.out.println();
                    break;
                    
                case 6:
                    System.out.println("Introduzca el primer numero: ");
                    num1 = scan.nextDouble();
                    System.out.println("Introduzca el segundo numero: ");
                    num2 = scan.nextDouble();
                    System.out.println("Resultado de la division: " + 
                            Calculadora.dividir(num1, num2));
                    System.out.println();
                    break;

                case 7:
                    
                    break;
            }

        } while (opcion != 8);

    }
}
