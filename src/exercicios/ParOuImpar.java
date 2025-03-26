package exercicios;
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero;
        numero = sc.nextInt();

        if(numero % 2 == 0) {
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }


        sc.close();
    }
}

/*
 * Fazer um programa para ler um número inteiro e dizer 
 * se este número é par ou ímpar. 
 * 
 * Entrada: 12
 * Saída: PAR
 * 
 * Entrada: -27
 * Saída: IMPAR
 * 
 * Entrada: 0
 * Saída: PAR
 */