package exercicios;
import java.util.Scanner;

public class NumerosMultiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorA, valorB;
        valorA = sc.nextInt();
        valorB = sc.nextInt();

        if(valorA % valorB == 0 || valorB % valorA == 0) {
            System.out.println("São multiplos");
        }
        else {
            System.out.println("Não são multiplos");
        }

        sc.close();
    }
}

/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
ordem crescente ou decrescente. 

Entrada: 6 24
Saída: São multiplos

Entrada: 6 25
Saída: Não são multiplos

Entrada: 24 6
Saída: São multiplos

 */
