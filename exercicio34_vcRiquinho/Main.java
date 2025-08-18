package exercicio34_vcRiquinho;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    private static EscritorioDeInvestimentos escritorio = new EscritorioDeInvestimentos();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("### Bem-vindo ao Sistema VcRiquinho ###");

        carregarDadosIniciais();

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    listarClientes();
                    break;
                case 3:
                    atualizarCliente();
                    break;
                case 4:
                    removerCliente();
                    break;
                case 5:
                    listarProdutos();
                    break;
                case 6:
                    simularRendimentosCliente();
                    break;
                case 0:
                    System.out.println("Saindo do sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println("\n--- MENU PRINCIPAL ---");
        System.out.println("1. Cadastrar Novo Cliente");
        System.out.println("2. Listar Clientes");
        System.out.println("3. Atualizar Cliente");
        System.out.println("4. Remover Cliente");
        System.out.println("5. Listar Produtos de Investimento");
        System.out.println("6. Simular Rendimentos para um Cliente");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarCliente() {
        System.out.print("Tipo de cliente (1- PF, 2- PJ): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        if (tipo == 1) {
            System.out.print("CPF: ");
            String cpf = scanner.nextLine();
            escritorio.adicionarCliente(new PessoaFisica(nome, email, cpf));
        } else {
            System.out.print("CNPJ: ");
            String cnpj = scanner.nextLine();
            escritorio.adicionarCliente(new PessoaJuridica(nome, email, cnpj));
        }
    }

    private static void listarClientes() {
        System.out.println("\n--- LISTA DE CLIENTES ---");
        List<Cliente> clientes = escritorio.listarClientes();
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (Cliente c : clientes) {
                String id = (c instanceof PessoaFisica) ? ((PessoaFisica) c).getCpf() : ((PessoaJuridica) c).getCnpj();
                System.out.printf("Nome: %s, Tipo: %s, ID: %s\n", c.getNome(), c.getTipo(), id);
            }
        }
    }

    private static void atualizarCliente() {
        System.out.print("Digite o CPF ou CNPJ do cliente que deseja atualizar: ");
        String id = scanner.nextLine();
        Optional<Cliente> clienteOpt = escritorio.buscarCliente(id);

        if (clienteOpt.isPresent()) {
            Cliente cliente = clienteOpt.get();
            System.out.println("Cliente encontrado: " + cliente.getNome());
            System.out.println("O que você deseja atualizar?");
            System.out.println("1. Nome");
            System.out.println("2. Email");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (escolha) {
                case 1:
                    System.out.print("Digite o novo nome: ");
                    String novoNome = scanner.nextLine();
                    cliente.setNome(novoNome);
                    System.out.println("Nome atualizado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o novo email: ");
                    String novoEmail = scanner.nextLine();
                    cliente.setEmail(novoEmail);
                    System.out.println("Email atualizado com sucesso!");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private static void removerCliente() {
        System.out.print("Digite o CPF ou CNPJ do cliente a ser removido: ");
        String id = scanner.nextLine();
        if (escritorio.removerCliente(id)) {
            System.out.println("Cliente removido com sucesso.");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
    
    private static void listarProdutos() {
        System.out.println("\n--- PRODUTOS DE INVESTIMENTO DISPONÍVEIS ---");
        for (ProdutoInvestimento p : escritorio.listarProdutos()) {
            System.out.println("- " + p.getNome());
        }
    }

    private static void simularRendimentosCliente() {
        System.out.print("Digite o CPF ou CNPJ do cliente para simulação: ");
        String id = scanner.nextLine();
        Optional<Cliente> clienteOpt = escritorio.buscarCliente(id);

        if (clienteOpt.isPresent()) {
            Cliente cliente = clienteOpt.get();
            if (cliente.getContas().isEmpty()) {
                System.out.println("Este cliente não possui contas para simulação. Adicione contas primeiro.");
                return;
            }
            
            System.out.print("Digite o período em dias para a simulação (ex: 30, 90, 180): ");
            int dias = scanner.nextInt();
            scanner.nextLine();
            
            double cdiAnual = 12.5;
            
            System.out.println("\n--- RESULTADO DA SIMULAÇÃO ---");
            executarSimulacao(cliente, new int[]{dias}, cdiAnual);
            
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
    
    private static void carregarDadosIniciais() {
        ProdutoInvestimento cdbSuper = new RendaFixa("CDB Super", "CDB prefixado", 1.1, 6);
        ProdutoInvestimento lciAgro = new RendaFixa("LCI Agro+", "LCI para agronegócio", 0.9, 3);
        ProdutoInvestimento fundoAcoes = new RendaVariavel("Fundo Ações Tech", "Fundo de ações de tecnologia", 1.8);
        escritorio.adicionarProduto(cdbSuper);
        escritorio.adicionarProduto(lciAgro);
        escritorio.adicionarProduto(fundoAcoes);

        PessoaFisica clientePF = new PessoaFisica("João da Silva", "joao@email.com", "111");
        clientePF.adicionarConta(new ContaInvestimentoAutomatico(20000, clientePF));
        escritorio.adicionarCliente(clientePF);
    }
    
    public static void executarSimulacao(Cliente cliente, int[] periodos, double cdiAnual) {
        for (int dias : periodos) {
            double rendimentoTotal = 0;
            double taxaTotal = 0;

            for (Conta conta : cliente.getContas()) {
                ResultadoSimulacao res = conta.simularRendimento(dias, cdiAnual);
                rendimentoTotal += res.rendimentoBruto;
                taxaTotal += res.taxaDeServico;
            }

            System.out.printf("Rendimento Bruto Total: R$ %.2f\n", rendimentoTotal);
            System.out.printf("Taxa de Serviço VcRiquinho: R$ %.2f\n", taxaTotal);
        }
    }
}