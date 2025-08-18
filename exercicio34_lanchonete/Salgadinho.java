package exercicio34_lanchonete;

public class Salgadinho extends Prato {
    private String tipo;
    private String massa;
    private String recheio;

    public Salgadinho(double precoVenda, String dataValidade, double peso, String tipo, String massa, String recheio) {
        super(precoVenda, dataValidade, peso);
        this.tipo = tipo;
        this.massa = massa;
        this.recheio = recheio;
    }
}
