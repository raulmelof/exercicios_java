package exercicio34_vcRiquinho;

public class RendaFixa extends ProdutoInvestimento {
    private double rendimentoMensal;
    private int carenciaMeses;

    public RendaFixa(String nome, String descricao, double rendimentoMensal, int carenciaMeses) {
        super(nome, descricao);
        this.rendimentoMensal = rendimentoMensal / 100.0;
        this.carenciaMeses = carenciaMeses;
    }

    @Override
    public double calcularRendimento(double valor, int dias) {
        if (dias < this.carenciaMeses * 30) {
            System.out.println("Aviso: Investimento '" + nome + "' não rendeu pois está no período de carência.");
            return 0;
        }
        
        double rendimentoDiario = rendimentoMensal / 30.0;
        return valor * Math.pow(1 + rendimentoDiario, dias) - valor;
    }
}
