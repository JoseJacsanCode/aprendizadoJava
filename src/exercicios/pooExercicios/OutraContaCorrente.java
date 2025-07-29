package exercicios.pooExercicios;

public class OutraContaCorrente {
    private String numero;
    private String agencia;
    private boolean especial;
    private double limiteChequeEspecial;
    private double valorEspecialUsado;
    private double saldo;

    public OutraContaCorrente() {
    }

    public OutraContaCorrente(String numero, String agencia, boolean especial, double limiteChequeEspecial,
            double valorEspecialUsado, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.especial = especial;
        this.limiteChequeEspecial = limiteChequeEspecial;
        this.valorEspecialUsado = valorEspecialUsado;
        this.saldo = saldo;
    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getValorEspecialUsado() {
        return valorEspecialUsado;
    }

    public void setValorEspecialUsado(double valorEspecialUsado) {
        this.valorEspecialUsado = valorEspecialUsado;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    

    public boolean realizarSaque(double quantiaASacar) {

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

    public void depositar(double valorDepositado) {
        saldo += valorDepositado;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual da conta = " + saldo);
    }

    public boolean verificarUsoChequeEspecial() {
        return saldo < 0;
    }

}
