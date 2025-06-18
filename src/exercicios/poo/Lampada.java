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
    boolean ligada;

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void mostrarEstado() {
        if(ligada) {
            System.out.println("A lâmpada está ligada");
        }
        else {
            System.out.println("A lâmpada está desligada");
        }
    }

    void mudarEstado() {
        if(ligada) {
            desligar();
        }
    }
}


/*
 * Escreva uma classe para representar uma lâmpada 
 * que está à venda em um supermercado.
 */