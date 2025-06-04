package aprendizado;
import java.util.Scanner;

public class ArrayIrregular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o número de entrevistados: ");
        int numeroEntrevistados = sc.nextInt();

        String[][] nomesFilhos = new String[numeroEntrevistados][];
        for(int i = 0; i < nomesFilhos.length; i++) {
            System.out.println("Entre com a quantidade de filhos: ");
            int qtdFilhos = sc.nextInt();

            nomesFilhos[i] = new String[qtdFilhos];

            for(int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.println("Digite o nome do filho: " + (j+1));

                nomesFilhos[i][j] = sc.next();
            }
        }

        for(int i = 0; i < nomesFilhos.length; i++) {
            System.out.println("Pessoa " + i + " tem " + nomesFilhos.length + " filhos");
            for(int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.println(nomesFilhos[i][j]);
            }
        }

        sc.close();
    }
}
