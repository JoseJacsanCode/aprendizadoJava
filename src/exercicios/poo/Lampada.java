package exercicios.poo;

public class Lampada {
    String modelo;
    String tensao;
    String cor;
    String tipoLuz;
    int potencia;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;

    void ligarLampada() {
        System.out.println("A lâmpada está ligada.");
        
    }

    void desligarLampada() {
        System.out.println("A lampada está desligada.");
    }
}


/*
 * Escreva	uma	classe	para representar uma lâmpada	que	está à	venda	em um supermercado.
 */