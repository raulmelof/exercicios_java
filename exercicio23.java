import java.util.HashMap;
import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args) {
        HashMap<String, String> agenda = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.err.println("\nDigite 1 para adicionar um contato.");
            System.err.println("Digite 2 para buscar um telefone pelo nome.");
            System.err.println("Digite 3 para listar todos os contatos (nome e telefone).");
            System.err.println("Digite 0 para sair.");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do contato:");
                    String nome = scanner.next();
                    if (agenda.containsKey(nome)) {
                        System.out.println("Contato já existe.");
                    } else {
                        System.out.println("Digite o telefone do contato:");
                        String telefone = scanner.next();
                        if (agenda.containsValue(telefone)) {
                            System.out.println("Telefone já está associado a outro contato.");
                        } else {
                            agenda.put(nome, telefone);
                            System.out.println("Contato adicionado com sucesso!");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Digite o nome do contato que deseja buscar:");
                    String nomeBusca = scanner.next();
                    if (agenda.containsKey(nomeBusca)) {
                        System.out.println("Telefone de " + nomeBusca + ": " + agenda.get(nomeBusca));
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Lista de contatos:");
                    for (String key : agenda.keySet()) {
                        System.out.println("Nome: " + key + ", Telefone: " + agenda.get(key));
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
