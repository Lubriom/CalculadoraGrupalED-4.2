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

    public static void sumar(double angulo1, double angulo2) {
        System.out.println("La suma de los números es: " + angulo1 + angulo2);
    }

    public static void restar(double angulo1, double angulo2) {
        System.out.println("La resta de los números es: " + (angulo1 - angulo2));
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
    
    public static void calcularSenCosTan(double angulo){
        double seno = Math.sin(angulo);
        double coseno = Math.cos(angulo);
        double tangente = Math.tan(angulo);

        System.out.println("Seno de " + angulo + " es: " + seno);
        System.out.println("Coseno de " + angulo + " es: " + coseno);
        System.out.println("Tangente de " + angulo + " es: " + tangente);
    }
   
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    
    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }
    
    public static double raizCuadrada(double num) {
        return Math.sqrt(num);
    }
    
    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
    
}