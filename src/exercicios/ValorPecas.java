package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class ValorPecas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codePeca1 = sc.nextInt();
        int numPecas1 = sc.nextInt();
        double valorPecas1 = sc.nextDouble();

        int codPeca2 = sc.nextInt();
        int numPecas2 = sc.nextInt();
        double valorPecas2 = sc.nextDouble();

        double valorPago = numPecas1 * valorPecas1 + numPecas2 * valorPecas2;

        System.out.println("CÓDIGO DA PEÇA 1: " + codePeca1);
        System.out.println("CÓDIGO DA PEÇA 2: " + codPeca2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPago);
        

        sc.close();
    }
}

/*
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor
 * unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor
 * unitário de cada peça 2. Mostre o código das peças 1 e 2, calcule e mostre o valor a
 * ser pago.
 * 
 * Entrada:
 * 12 1 5.30
 * 16 2 5.10
 * Saída:
 * VALOR A PAGAR: R$ 15.50
 * 
 * Entrada:
 * 13 2 15.30
 * 161 4 5.20
 * Saída:
 * VALOR A PAGAR: R$ 51.40
 * 
 * Entrada:
 * 1 1 15.10
 * 2 1 15.10
 * Saída:
 * VALOR A PAGAR: R$ 30.20
 */