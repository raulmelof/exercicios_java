package exercicio_classes_abstratas;

public class Funcionario extends Pessoa {
    protected float salario;

    public Funcionario(String nome, Data nascimento, float salario) {
        super(nome, nascimento);
        this.salario = salario;
    }

    public float calculaImposto() {
        return this.salario * 0.03f;
    }

    @Override
    public void imprimeDados() {
        System.out.println("--- DADOS DO FUNCIONÁRIO ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de Nascimento: " + this.nascimento.toString());
        System.out.println("Salário: R$ " + String.format("%.2f", this.salario));
        System.out.println("Imposto a pagar: R$ " + String.format("%.2f", this.calculaImposto()));
        System.out.println("--------------------------\n");
    }
}
