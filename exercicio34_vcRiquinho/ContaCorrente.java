package exercicio34_vcRiquinho;

public class ContaCorrente extends Conta {

    public ContaCorrente(double saldo, Cliente cliente) {
        super(saldo, cliente);
    }

    @Override
    public ResultadoSimulacao simularRendimento(int dias, double cdiAnual) {
        return new ResultadoSimulacao(0, 0);
    }
}
