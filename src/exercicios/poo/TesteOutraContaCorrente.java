package exercicios.poo;

public class TesteOutraContaCorrente {
    public static void main(String[] args) {
        OutraContaCorrente conta = new OutraContaCorrente();
        conta.setAgencia("1234");
        conta.setNumero("123456");
        conta.setEspecial(true);
        conta.setLimiteChequeEspecial(500);
        conta.setSaldo(-10);

        System.out.println("Saldo da conta " + conta.getNumero() + " = " + conta.getSaldo());

        boolean saqueEfetuado = conta.realizarSaque(10);

        if(saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso");
            conta.consultarSaldo();
        }
        else {
            System.out.println("Não foi possível realizar saque, saldo insuficiente");
        }

        saqueEfetuado = conta.realizarSaque(500);

        System.out.println("Tetativa de saque de 500 reais");
        if(saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso");
            conta.consultarSaldo();
        }
        else {
            System.out.println("Não foi possível realizar saque, saldo insuficiente");
        }

        System.out.println("Depósito de 500 reais");
        conta.depositar(500);
    
        conta.consultarSaldo();

        if (conta.verificarUsoChequeEspecial()) {
            System.out.println("Está usando cheque especial");
        }
        else {
            System.out.println("Não está usando cheque especial");
        }

        conta.realizarSaque(600);
        conta.consultarSaldo();
        if (conta.verificarUsoChequeEspecial()) {
            System.out.println("Está usando cheque especial");
        }
        else {
            System.out.println("Não está usando cheque especial");
        }
    }
}
