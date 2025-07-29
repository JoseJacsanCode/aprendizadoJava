package exercicios.pooExercicios;

public class Mamifero extends Animal{
    
    public Mamifero() {
        this.setAmbiente("Terra");
    }
    
    private String alimento;

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    

}
