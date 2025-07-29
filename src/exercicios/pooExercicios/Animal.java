package exercicios.pooExercicios;

public class Animal {
    private String nome;
    private double comprimento;
    private int patas;
    private String cor;
    private String ambiente;
    private double velocidade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getComprimento() {
        return comprimento;
    }
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    public int getPatas() {
        return patas;
    }
    public void setPatas(int patas) {
        this.patas = patas;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getAmbiente() {
        return ambiente;
    }
    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }
    public double getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Animal: ").append(nome).append("\n");
        sb.append("Comprimento: ").append(comprimento).append(" cm").append("\n");
        sb.append("Patas: ").append(patas).append("\n");
        sb.append("Cor: ").append(cor).append("\n");
        sb.append("Ambiente: ").append(ambiente).append("\n");
        sb.append("Velocidade: ").append(velocidade).append(" m/s");
        return sb.toString();
    }

    

}
