package exercicios.poo;
import java.util.Scanner;
import java.util.Locale;

public class TesteAluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        aluno.nome = sc.nextLine();
        aluno.matricula = sc.nextInt();
        sc.nextLine();
        aluno.curso = sc.nextLine();
        aluno.disciplina1 = sc.nextLine();
        aluno.disciplina2 = sc.nextLine();
        aluno.disciplina3 = sc.nextLine();
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();      
        
        System.out.println("Nota de " + aluno.disciplina1 + " = " + aluno.nota1);
        System.out.println("Nota de " + aluno.disciplina2 + " = " + aluno.nota2);
        System.out.println("Nota de " + aluno.disciplina3 + " = " + aluno.nota3);
        
        aluno.aprovar();

        sc.close();
    }
}

/*
Escreva uma classe para representar um Aluno. 
Adicione atributos relacionados às caracteristicas de um Aluno, 
como nome, matricula, curso que está matriculado, nome 
de 3 disciplinas que está cursando e as notas dessas 3 disciplinas. 
Desenvolva um método para verificar se o aluno está aprovado 
(nota maior ou igual a 7) em uma determinada disciplina. 
Escreva um programa para testar essa classe, que pede as 
informações do aluno ao usuário e ao final informa o nome das disciplinas, 
mostra as notas e mostra se o aluno foi aprovado ou não.
 */