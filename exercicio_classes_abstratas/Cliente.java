package exercicio_classes_abstratas;

public class Cliente extends Pessoa {
    private int codigo;

    public Cliente(String nome, Data nascimento, int codigo) {
        super(nome, nascimento);
        this.codigo = codigo;
    }

    @Override
    public void imprimeDados() {
        System.out.println("----- DADOS DO CLIENTE -----");
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de Nascimento: " + this.nascimento.toString());
        System.out.println("Código: " + this.codigo);
        System.out.println("--------------------------\n");
    }
}
