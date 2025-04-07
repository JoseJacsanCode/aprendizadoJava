package exercicios;
import java.util.Scanner;

public class PositivoNegativoOuZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        if(numero > 0) {
            System.out.println("Positivo");
        }
        else if (numero < 0) {
            System.out.println("Negativo");
        }
        else {
            System.out.println("Zero");
        }


        sc.close();
    }
}

/*
 * Faça um programa que leia um número e determine se ele é 
 * positivo, negativo ou zero.
 */