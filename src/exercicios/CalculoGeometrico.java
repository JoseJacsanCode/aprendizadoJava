package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class CalculoGeometrico {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double pi = 3.14159;

        double areaTrianguloRetangulo = A * C / 2;
        double areaCirculo = pi * C * C;
        double areaTrapezio = (B + A) * C / 2;
        double areaQuadrado = Math.pow(2, B);

        System.out.printf("TRIANGULO RETANGULO: %.3f%n", areaTrianguloRetangulo);
        System.out.printf("CÍRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPÉZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);

        sc.close();
    }
}

/*
 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: 
 * A, B e C. Em seguida, calcule e mostre:
 * a) A área do triângulo retângulo que tem A por base e C por altura.
 * b) A área do círculo de raio C. (pi = 3.14159)
 * c) A área do trapézio que tem A e B por bases e C por altura.
 * d) A área do quadrado que tem lado B.
 * e) A área do retângulo que tem lados A e B.
 * 
 * Entrada:
 * 3.0 4.0 5.2
 * Saída:
 * TRIANGULO: 7.800
 * CIRCULO: 84.949
 * TRAPEZIO: 18.200
 * QUADRADO: 16.000
 * RETANGULO: 12.000
 * 
 * Entrada:
 * 12.7 10.4 15.2
 * Saída:
 * TRIANGULO: 96.520
 * CIRCULO: 725.833
 * TRAPEZIO: 175.560
 * QUADRADO: 108.160
 * RETANGULO: 132.080
 */