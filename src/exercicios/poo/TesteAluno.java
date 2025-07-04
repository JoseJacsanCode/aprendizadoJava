package exercicios.poo;
import java.util.Scanner;
import java.util.Locale;

public class TesteAluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno: ");
        aluno.nome = sc.nextLine();

        System.out.println("Entre com o nome do curso");
        aluno.nomeCurso = sc.nextLine();

        System.out.println("Entre com a matrícula: ");
        aluno.matricula = sc.nextLine();

        aluno.nomeDisciplinas = new String[3];
        for(int i = 0; i < aluno.notasDisciplinas.length; i++) {
            System.out.println("Entre com o nome da disciplina " + i);
            aluno.nomeDisciplinas[i] = sc.next();
        }

        for(int i = 0; i < aluno.notasDisciplinas.length; i++) {
            System.out.println("Obtendo notas de disciplina " + aluno.nomeDisciplinas[i]);
            for(int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
                System.out.println("Entre com a nota: " + (j+1));
                aluno.notasDisciplinas[i][j] = sc.nextDouble();
            }
        }

        aluno.mostrarInfos();

        for(int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            if(aluno.verificarAprovado(i)) {
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi aprovado.");
            }
            else {
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi reprovado.");
            }

        }

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