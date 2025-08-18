public class exercicio08 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João");
        conta.depositar(1000.0);
        System.out.println("Saldo atual: " + conta.getSaldo());

        try {
            conta.sacar(1500.0);
            System.out.println("Saque realizado com sucesso.");
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        try {
            conta.sacar(500.0);
            System.out.println("Saque realizado com sucesso.");
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Saldo final: " + conta.getSaldo());
    }
}

class ContaBancaria{
    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para sacar " + valor);
        }
        saldo -= valor;
        return true;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}