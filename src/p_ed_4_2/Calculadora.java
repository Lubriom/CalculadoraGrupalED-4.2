/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p_ed_4_2;

/**
 *
 * @author Linkm
 */
public abstract class Calculadora {

    public static void sumar(double numero1, double numero2) {
        System.out.println("La suma de los números es: " + numero1 + numero2);
    }

    public static void restar(double numero1, double numero2) {
        System.out.println("La resta de los números es: " + (numero1 - numero2));
    }
    
     public static void ecuacionSegundoGrado(double a, double b, double c) {

        if ((Math.pow(b, 2) - 4 * a * c) < 0) {
            System.err.println("No tiene soluciones reales");
        } else if ((Math.pow(b, 2) - 4 * a * c) == 0) {
            System.out.println("Tiene una solución: " + (-b / (2 * a)));
        } else {
            System.out
                    .println("Tiene dos soluciones: " + (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a) + " y " +
                            (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
        }
    }
}