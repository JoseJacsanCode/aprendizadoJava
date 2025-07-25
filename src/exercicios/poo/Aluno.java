package exercicios.poo;

import java.util.Arrays;

public class Aluno {
    
    private String curso;
    private double[] notas;

    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefoneCelular, String cpf) {
        //super(nome, endereco, telefoneCelular, cpf);
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

    public String obterEtiquetaEndereco() {

        String s ="Endereço do Aluno ";
        //s += super.getEndereco();
        return s;
    }

    //@Override
    public void imprimirEtiquetaEndereco() {
        System.out.println(this.obterEtiquetaEndereco());
    }

    @Override
    public String toString() {
        return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (curso == null) {
            if (other.curso != null)
                return false;
        } else if (!curso.equals(other.curso))
            return false;
        if (!Arrays.equals(notas, other.notas))
            return false;
        return true;
    }

    // public String toString() {
    //     String s = curso + "\n";
    //     for(double nota : notas) {
    //         s += nota + " ";
    //     }

    //     return s;
    // }

    

}