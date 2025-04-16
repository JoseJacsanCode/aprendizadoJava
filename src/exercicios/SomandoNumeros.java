package exercicios;
import java.util.Scanner;

public class SomandoNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 1;
        int soma = 0;
        while(x != 0) {
            System.out.println("Digite um número (0 para sair): ");
            x = sc.nextInt();
            soma = soma + x;
        }
        System.out.println("Soma total: " + soma);

        sc.close();
    }
}

/*
Peça pro usuário digitar números. Vá somando eles até que ele digite 0. Quando digitar 0, mostre a soma total.

Digite um número: 3
Digite um número: 2
Digite um número: 4
Digite um número: 0
Soma total: 9

 */