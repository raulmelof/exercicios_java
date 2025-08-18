package exercicio34_vcRiquinho;

import java.util.ArrayList;
import java.util.List;

public class ContaInvestimentoAutomatico extends Conta {
    private static final double TAXA_SERVICO_PF = 0.0010;
    private static final double TAXA_SERVICO_PJ = 0.0015;

    private List<ProdutoInvestimento> produtosInvestidos;

    public ContaInvestimentoAutomatico(double saldo, Cliente cliente) {
        super(saldo, cliente);
        this.produtosInvestidos = new ArrayList<>();
    }
    
    public void adicionarProduto(ProdutoInvestimento produto) {
        this.produtosInvestidos.add(produto);
    }

    @Override
    public ResultadoSimulacao simularRendimento(int dias, double cdiAnual) {
        double rendimentoBrutoTotal = 0;
        
        for (ProdutoInvestimento produto : produtosInvestidos) {
            double valorPorProduto = this.saldo / produtosInvestidos.size();
            rendimentoBrutoTotal += produto.calcularRendimento(valorPorProduto, dias);
        }

        double taxaAplicavel = cliente.getTipo().equals("PF") ? TAXA_SERVICO_PF : TAXA_SERVICO_PJ;
        double taxaCobrada = rendimentoBrutoTotal * taxaAplicavel;

        return new ResultadoSimulacao(rendimentoBrutoTotal, taxaCobrada);
    }
}