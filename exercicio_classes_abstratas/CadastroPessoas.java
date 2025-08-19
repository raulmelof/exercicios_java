package exercicio_classes_abstratas;

public class CadastroPessoas {
    private Pessoa[] pessoas;
    private int qtdAtual;

    public CadastroPessoas() {
        this.pessoas = new Pessoa[100];
        this.qtdAtual = 0;
    }

    public void cadastraPessoa(Pessoa pessoa) {
        if (qtdAtual < pessoas.length) {
            this.pessoas[qtdAtual] = pessoa;
            this.qtdAtual++;
        } else {
            System.out.println("Erro: O cadastro está cheio!");
        }
    }

    public void imprimeCadastro() {
        System.out.println("========= RELATÓRIO DE CADASTROS =========");
        for (int i = 0; i < qtdAtual; i++) {
            pessoas[i].imprimeDados();
        }
        System.out.println("==========================================");
    }
}
