package exercicios;
import java.util.Scanner;

public class NumeroNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int numero;
        numero = sc.nextInt();

        if(numero < 0) {
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("NÃO NEGATIVO");
        }

        sc.close();
    }
}

/* Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

Entrada: -10  
Saída: NEGATIVO 

Entrada: 8
Saída: NÃO NEGATIVO

Entrada: 0
Saída: NÃO NEGATIVO

 */