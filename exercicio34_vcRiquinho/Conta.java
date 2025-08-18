package exercicio34_vcRiquinho;

public abstract class Conta {
    private static int contador = 1001;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(double saldo, Cliente cliente) {
        this.numeroConta = contador++;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract ResultadoSimulacao simularRendimento(int dias, double cdiAnual);
}
