package exercicio34_lanchonete;

public class Lanche extends Prato {
    private String tipoPao;
    private String recheio;
    private String molho;

    public Lanche(double precoVenda, String dataValidade, double peso, String tipoPao, String recheio, String molho) {
        super(precoVenda, dataValidade, peso);
        this.tipoPao = tipoPao;
        this.recheio = recheio;
        this.molho = molho;
    }
}
