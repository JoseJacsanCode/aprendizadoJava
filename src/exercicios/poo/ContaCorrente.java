package exercicios.poo;

public class ContaCorrente {
    String numero;
    String agencia;
    boolean especial;
    double limiteChequeEspecial;
    double valorEspecialUsado;
    double saldo;

    boolean realizarSaque(double quantiaASacar) {

        // Tem saldo na conta
        if (saldo >= quantiaASacar) {
            saldo -= quantiaASacar;
            return true;
        }
        else { // Não tem saldo na conta
            if(especial) {
                // Verificar se o limite especial tem saldo
                double limite = limiteChequeEspecial + saldo;
                if(limite >= quantiaASacar) {
                    saldo -= quantiaASacar;
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
    }

    void depositar(double valorDepositado) {
        saldo += valorDepositado;
    }

    void consultarSaldo() {
        System.out.println("Saldo atual da conta = " + saldo);
    }

    boolean verificarUsoChequeEspecial() {
        return saldo < 0;
    }

}

/*
Cria uma classe para representar uma conta corrente que possui um	
número,	um	saldo, um status que informa se ela	é especial ou não, um	
limite.
*/