package exercicios.poo;

public class Aluno {
    String nome;
    int matricula;
    String curso;
    String disciplina1, disciplina2, disciplina3;
    double nota1, nota2, nota3;


    void aprovar() {
        double media = (nota1 + nota2 + nota3) / 3;
        if (media >= 7) {
            System.out.printf("Nota: %.2f%n", media);
            System.out.println("O aluno foi aprovado");
        }
        else {
            System.out.printf("Nota: %.2f%n", media);
            System.out.println("O aluno foi reprovado");
        }
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