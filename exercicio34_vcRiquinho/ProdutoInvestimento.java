package exercicio34_vcRiquinho;

public abstract class ProdutoInvestimento {
    protected String nome;
    protected String descricao;

    public ProdutoInvestimento(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    
    public String getNome() {
        return nome;
    }

    public abstract double calcularRendimento(double valor, int dias);
}
