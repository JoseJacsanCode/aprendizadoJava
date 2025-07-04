package exercicios;
import java.util.Scanner;

public class VetorDe10Elementos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for(int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição: ");
            vetorA[i] = sc.nextInt();
            vetorB[i] = vetorA[i] * i;
        }

        System.out.print("Vetor A: ");
        for(int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i] + " ");
        }

        System.out.println();

        System.out.print("Vetor A: ");
        for(int i = 0; i < vetorB.length; i++) {
            System.out.println(vetorB[i] + " ");
        }

        sc.close();
    }
}

/*
 * Criar um vetor A com 10 elementos inteiros. Construir um vetor B de 
 * mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá 
 * ser o respectivo elemento de A multiplicado por sua posição (ou 
 * índice), ou seja: 
 * B[i] = A[i] * i. 

 */