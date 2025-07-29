package exercicios.pooExercicios;

public class Peixe extends Animal{
    
    public Peixe() {
        this.setPatas(0);
        this.setAmbiente("mar");
        this.setCor("cinzenta");
    }
    
    private String caracteristicas;

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    
}
