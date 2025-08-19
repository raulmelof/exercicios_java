package exercicio_classes_abstratas;

public class Main {
    public static void main(String[] args) {
        CadastroPessoas cadastro = new CadastroPessoas();

        Cliente cliente1 = new Cliente("Ana Beatriz", new Data(15, 3, 1995), 101);
        Funcionario func1 = new Funcionario("Carlos de Andrade", new Data(22, 7, 1988), 3500.0f);
        Gerente gerente1 = new Gerente("Mariana Costa", new Data(10, 12, 1980), 8000.0f, "Tecnologia");

        cadastro.cadastraPessoa(cliente1);
        cadastro.cadastraPessoa(func1);
        cadastro.cadastraPessoa(gerente1);

        cadastro.imprimeCadastro();
    }
}
