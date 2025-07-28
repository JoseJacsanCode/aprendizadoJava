package exercicios.poo;

public class TesteContas {
    public static void main(String[] args) {
        System.out.println("*** Teste ContaBancaria ***");

        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Cliente Conta Simples");
        contaSimples.setNumConta("12345-8");
        //contaSimples.depositar(50.3);

        System.out.println(contaSimples);

    }
}
