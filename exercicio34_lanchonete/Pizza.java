package exercicio34_lanchonete;

public class Pizza extends Prato {
    private String recheio;
    private String borda;
    private String molho;

    public Pizza(double precoVenda, String dataValidade, double peso, String recheio, String borda, String molho) {
        super(precoVenda, dataValidade, peso);
        this.recheio = recheio;
        this.borda = borda;
        this.molho = molho;
    }
}
