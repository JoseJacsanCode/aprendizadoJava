package exercicios;
import java.util.Scanner;

public class VetorDe15Elementos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for(int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor da posição i: " + i);
            vetorA[i] = sc.nextInt();
            vetorB[i] = vetorA[i] * vetorA[i];
        }

        System.out.print("Vetor A: ");
        for(int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();
        System.out.print("Vetor B: ");
        for(int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}


/*
 * Criar um vetor A com 15 elementos inteiros. Construir um vetor B de 
 * mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá 
 * ser o quadrado do respectivo elemento de A, ou seja: 
 * B[i] = A[i] * A[I]. 

 */