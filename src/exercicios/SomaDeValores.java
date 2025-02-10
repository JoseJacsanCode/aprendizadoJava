package exercicios;
import java.util.Scanner;

public class SomaDeValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        int soma = x + y;

        System.out.println("Saída: " + soma);


        sc.close();
    }
}

/*
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.
 * 
 * Entrada:
 * 10
 * 3
 * Saída:
 * SOMA = 40
 * 
 * 
 * Entrada: 
 * -30
 * 10
 * Saída:
 * SOMA = -20
 * 
 * 
 * Entrada: 
 * 0
 * 0
 * Saída:
 * SOMA = 0
 * 
 */