package exercicio34_lanchonete;

public abstract class Prato {
    protected double precoVenda;
    protected String dataValidade;
    protected double peso;

    public Prato(double precoVenda, String dataValidade, double peso) {
        this.precoVenda = precoVenda;
        this.dataValidade = dataValidade;
        this.peso = peso;
    }

    public double getPreco() {
        return this.precoVenda;
    }
}