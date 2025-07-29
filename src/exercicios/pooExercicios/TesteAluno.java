package exercicios.pooExercicios;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setCurso("Ciência da Computação");
        double[] notas = {10, 9, 8, 7};
        aluno.setNotas(notas);

        System.out.println(aluno);

        String s1 = "aasassa";
        String s2 = "aasassa";

        System.out.println(s1.equals(s2));

        Aluno aluno2 = new Aluno();
        aluno.setCurso("Ciência da Computação");
        double[] notas2 = {10, 9, 8, 7};
        aluno2.setNotas(notas2);

        System.out.println(aluno.equals(aluno2));

    }
}
