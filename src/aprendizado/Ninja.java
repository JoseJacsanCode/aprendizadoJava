package aprendizado;

public class Ninja {
    private String nome;
    private String aldeia;
    private int idade;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public void ataqueBase() {
        System.out.println("Sou um ninja e taquei uma kunai");
    }
}
