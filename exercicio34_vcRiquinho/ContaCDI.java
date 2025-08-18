package exercicio34_vcRiquinho;

public class ContaCDI extends Conta {
    private static final double TAXA_SERVICO = 0.0007;

    public ContaCDI(double saldo, Cliente cliente) {
        super(saldo, cliente);
    }

    @Override
    public ResultadoSimulacao simularRendimento(int dias, double cdiAnual) {
        double cdiDiario = (cdiAnual / 100.0) / 360.0;
        double rendimentoBruto = this.saldo * Math.pow(1 + cdiDiario, dias) - this.saldo;
        
        double taxaCobrada = rendimentoBruto * TAXA_SERVICO;
        return new ResultadoSimulacao(rendimentoBruto, taxaCobrada);
    }
}
