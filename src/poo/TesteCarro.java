package poo;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println("Marca: " + van.marca);
        System.out.println("Modelo: " + van.modelo);

        van.exibirAutonomia();

        double autonomiaDoCarro = van.obterAutonomia();
        System.out.printf("A autonomia do carro é de: %.2f km%n", autonomiaDoCarro);

        double qtdCombustivel10 = van.calcularCombustivel(10);
        double qtdCombustivel15 = van.calcularCombustivel(15);
        System.out.println("qtdCombustivel: " + qtdCombustivel10);
        System.out.println("qtdCombustivel15: " + qtdCombustivel15);
    }
}
