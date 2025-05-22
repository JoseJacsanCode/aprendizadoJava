package exercicios;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Vetor15ElementosRaizQuadrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[15];
        double[] vetorB = new double[vetorA.length];

        for(int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição: ");
            vetorA[i] = sc.nextInt();
            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        System.out.print("Vetor A: ");
        for(int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        DecimalFormat df = new DecimalFormat("###,###.###");
        System.out.println();
        System.out.print("Vetor B: ");
        for(int i = 0; i < vetorB.length; i++) {
            System.out.print(df.format(vetorB[i]) + " ");
        }

        sc.close();
    }
}

/*
Criar um vetor A com 15 elementos inteiros. Construir um vetor B de 
mesmo tamanho, sendo que cada elemento do vetor B deverá ser a 
raiz quadrada do respectivo elemento de A, ou seja: 
B[i] = sqrt(A[i]).  

 */