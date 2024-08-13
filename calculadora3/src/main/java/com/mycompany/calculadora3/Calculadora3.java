/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora3;

import java.util.Scanner;

/*
 @author Juan David Ruiz Gomez y Elkin Santiago Ruiz Rodriguez.
 */
public class Calculadora3 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continuar = true; 
            
            while (continuar) {
                System.out.println("\nSeleccione una operación:");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicacion");
                System.out.println("4. Division");
                System.out.println("5. Seno");
                System.out.println("6. Coseno");
                System.out.println("7. Tangente");
                System.out.println("8. Raiz enesima");
                System.out.println("9. Potencia enesima");
                System.out.println("10. Calcular IVA");
                System.out.println("0. Salir");
                
                int opcion = scanner.nextInt();
                scanner.nextLine();
                
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingrese el primer numero: ");
                        double num1 = scanner.nextDouble();
                        System.out.print("Ingrese el segundo numero: ");
                        double num2 = scanner.nextDouble();
                        System.out.println("Resultado: " + suma(num1, num2));
                    }
                    case 2 -> {
                        System.out.print("Ingrese el primer numero: ");
                        double num1 = scanner.nextDouble();
                        System.out.print("Ingrese el segundo numero: ");
                        double num2 = scanner.nextDouble();
                        System.out.println("Resultado: " + resta(num1, num2));
                    }
                    case 3 -> {
                        System.out.print("Ingrese el primer numero: ");
                        double num1 = scanner.nextDouble();
                        System.out.print("Ingrese el segundo numero: ");
                        double num2 = scanner.nextDouble();
                        System.out.println("Resultado: " + multiplicacion(num1, num2));
                    }
                    case 4 -> {
                        System.out.print("Ingrese el primer numero: ");
                        double num1 = scanner.nextDouble();
                        System.out.print("Ingrese el segundo numero: ");
                        double num2 = scanner.nextDouble();
                        if (num2 == 0) {
                            System.out.println("Error: No se puede dividir entre cero.");
                        } else {
                            System.out.println("Resultado: " + division(num1, num2));
                        }
                    }
                    case 5 -> {
                        System.out.print("Ingrese el angulo en radianes: ");
                        double angulo = scanner.nextDouble();
                        System.out.println("Resultado: " + seno(angulo));
                    }
                    case 6 -> {
                        System.out.print("Ingrese el angulo en radianes: ");
                        double angulo = scanner.nextDouble();
                        System.out.println("Resultado: " + coseno(angulo));
                    }
                    case 7 -> {
                        System.out.print("Ingrese el angulo en radianes: ");
                        double angulo = scanner.nextDouble();
                        System.out.println("Resultado: " + tangente(angulo));
                    }
                    case 8 -> {
                        System.out.print("Ingrese el numero: ");
                        double num1 = scanner.nextDouble();
                        System.out.print("Ingrese el indice de la raíz: ");
                        int indiceRaiz = scanner.nextInt();
                        System.out.println("Resultado: " + raizEnesima(num1, indiceRaiz));
                    }
                    case 9 -> {
                        System.out.print("Ingrese la base: ");
                        double num1 = scanner.nextDouble();
                        System.out.print("Ingrese el exponente: ");
                        double num2 = scanner.nextDouble();
                        System.out.println("Resultado: " + potenciaEnesima(num1, num2));
                    }
                    case 10 -> {
                        System.out.print("Ingrese el valor: ");
                        double num1 = scanner.nextDouble();
                        System.out.print("Ingrese el porcentaje de IVA: ");
                        double porcentajeIva = scanner.nextDouble();
                        System.out.println("IVA: " + calcularIVA(num1, porcentajeIva));
                    }
                    case 0 -> continuar = false;
                    default -> System.out.println("Opcion invalida.");
                }
            }
        }
    }

    public static double suma(double num1, double num2) {
        return num1 + num2;
    }

    public static double resta(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        return num1 / num2;
    }

    public static double seno(double angulo) {
        return Math.sin(angulo);
    }

    public static double coseno(double angulo) {
        return Math.cos(angulo);
    }

    public static double tangente(double angulo) {
        return Math.tan(angulo);
    }

    public static double raizEnesima(double num, int indice) {
        return Math.pow(num, 1.0 / indice);
    }

    public static double potenciaEnesima(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public static double calcularIVA(double valor, double porcentaje) {
        return valor * (porcentaje / 100);
    }
}


