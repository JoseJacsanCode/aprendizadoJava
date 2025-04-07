package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class NotaDoAluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double notaDoAluno = sc.nextDouble();

        if(notaDoAluno >= 7.0) {
            System.out.println("Aprovado");
        }
        else if (notaDoAluno >= 5.0 && notaDoAluno <= 6.9) {
            System.out.println("Recuperação");
        }
        else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}

/*
 * Crie um programa que leia a nota de um aluno e imprima:  
- "Aprovado" se a nota for maior ou igual a 7,  
- "Recuperação" se a nota for entre 5 e 6.9,  
- "Reprovado" se a nota for menor que 5.
 */