package exercicios.pooExercicios;

public class TesteZoologico {
    public static void main(String[] args) {
        System.out.println("Zoo:");
        System.out.println("*******");

        Animal camelo = new Mamifero();
        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        camelo.setPatas(4);
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(2.0);

        System.out.println(camelo);

    }
}
