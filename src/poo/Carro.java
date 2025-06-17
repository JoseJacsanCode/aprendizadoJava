package poo;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros; // Número de passageiros
    double capCombustivel; // Capacidade do tanque de combustível
    double consumoCombustivel; // Consumo de combustível por km

    // Método sem retorno
    void exibirAutonomia() {
        double autonomia = capCombustivel * consumoCombustivel;
        System.out.printf("A autonomia do " + modelo + " é %.2f km%n", autonomia);
    }

    // Método com retorno
    double obterAutonomia() {
        double autonomiaObtida = capCombustivel * consumoCombustivel;
        return autonomiaObtida;
    }

    // Método com parâmetro
    double calcularCombustivel(double km) {
        double qtdCombustivel = km / consumoCombustivel;
        return qtdCombustivel;
    }
    
}
