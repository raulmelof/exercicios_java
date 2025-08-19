package exercicio_classes_abstratas;

public class Gerente extends Funcionario {
    private String area;

    public Gerente(String nome, Data nascimento, float salario, String area) {
        super(nome, nascimento, salario);
        this.area = area;
    }

    @Override
    public float calculaImposto() {
        return this.salario * 0.05f;
    }

    @Override
    public void imprimeDados() {
        System.out.println("---- DADOS DO GERENTE ----");
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de Nascimento: " + this.nascimento.toString());
        System.out.println("Salário: R$ " + String.format("%.2f", this.salario));
        System.out.println("Área: " + this.area);
        System.out.println("Imposto a pagar: R$ " + String.format("%.2f", this.calculaImposto()));
        System.out.println("--------------------------\n");
    }
}
