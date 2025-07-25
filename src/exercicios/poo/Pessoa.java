package exercicios.poo;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefoneCelular;
    private String cpf;

    public Pessoa() {
        super();
    }
    
    public Pessoa(String nome, String endereco, String telefoneCelular, String cpf) {
        super();
        this.nome = nome;
        this.endereco = endereco;
        this.telefoneCelular = telefoneCelular;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefoneCelular() {
        return telefoneCelular;
    }
    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // public abstract String obterEtiquetaEndereco();
    
    // public abstract void imprimirEtiquetaEndereco();

}
