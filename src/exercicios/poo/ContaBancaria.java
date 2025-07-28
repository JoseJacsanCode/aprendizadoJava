package exercicios.poo;

public class ContaBancaria {
    private String nomeCliente;
    private String numConta;
    private double saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }
    
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // @Override
    // public String toString() {
    //     String s = "";
    //     s += "nomeCliente: " + nomeCliente + "; ";
    //     s += "numConta: " + numConta + "; ";
    //     s += "saldo: " + saldo;
    //     return s;
    // }

    @Override
    public String toString() {
        return new StringBuilder()
            .append("nomeCliente: ").append(nomeCliente).append("; ")
            .append("numConta: ").append(numConta).append("; ")
            .append("saldo: ").append(saldo)
            .toString();
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if((valor - saldo) >= 0) {
            saldo -= valor;
            return true;
        }
        return false;
    }

}
