package exercicios.poo;

public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.agencia = "1234";
        conta.numero = "123456";
        conta.especial = true;
        conta.limiteChequeEspecial = 500;
        conta.saldo = 10;

        System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);
    }
}
