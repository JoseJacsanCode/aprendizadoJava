package exercicios;
import java.util.Scanner;

public class ValidacaoDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean infosValidas = false;
        String nome;
        int idade;

        do {
            System.out.println("Entre com o nome");
            nome = sc.next();

            if(nome.length() >= 3) {
                infosValidas = true;
            }
            else {
                System.out.println("Nome precisa de pelo menos 3 caracteres");
            }
        } while(!infosValidas);

        infosValidas = false;
        
        do {
            System.out.println("Entre com a idade");
            idade = sc.nextInt();

            if(idade >= 0 && idade <= 150) {
                infosValidas = true;
            }
            else {
                System.out.println("Idade precisa ser entre 0 e 150");
            }
        } while (!infosValidas);

        sc.close();
    }
}