public class Conta {
    private String nomeCliente;
    private int agencia;
    private int numero;
    private double saldo;

    public Conta(String nomeCliente, int agencia, int numero, double saldo) {
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }
}