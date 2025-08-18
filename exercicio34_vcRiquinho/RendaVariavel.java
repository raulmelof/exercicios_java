package exercicio34_vcRiquinho;

public class RendaVariavel extends ProdutoInvestimento {
    private double rendimentoEsperadoMensal;

    public RendaVariavel(String nome, String descricao, double rendimentoEsperadoMensal) {
        super(nome, descricao);
        this.rendimentoEsperadoMensal = rendimentoEsperadoMensal / 100.0;
    }

    @Override
    public double calcularRendimento(double valor, int dias) {
        double rendimentoDiario = rendimentoEsperadoMensal / 30.0;
        return valor * Math.pow(1 + rendimentoDiario, dias) - valor;
    }
}