package exercicios;
import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano de sua preferência");
        int ano = sc.nextInt();

        if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println("Ano Bissexto");
        }
        else {
            System.out.println("O ano não é bissexto");
        }


        sc.close();
    }
}

/*
Peça ao usuário um ano e diga se é bissexto.
Dica: Um ano é bissexto se for divisível por 4 **e** não por 100, **ou** se for divisível por 400.
 */