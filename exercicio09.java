import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        List<String> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(
                    "Digite um número para selecionar uma opção:\n1. Adicionar tarefa\n2. Remover tarefa\n3. Listar tarefas\n4. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a tarefa a ser adicionada:");
                    String tarefaAdicionar = scanner.next();
                    tarefas.add(tarefaAdicionar);
                    System.out.println("Tarefa adicionada com sucesso.");
                    break;
                case 2:
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa para remover.");
                        break;
                    }
                    System.out.println("Lista de tarefas:");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println(i + ": " + tarefas.get(i));
                    }
                    System.out.println("Digite o índice da tarefa a ser removida:");
                    int indice = scanner.nextInt();
                    scanner.nextLine();
                    if (indice >= 0 && indice < tarefas.size()) {
                        String removida = tarefas.remove(indice);
                        System.out.println("Tarefa \"" + removida + "\" removida com sucesso.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 3:
                    System.out.println("Lista de tarefas:");
                    for (String tarefa : tarefas) {
                        System.out.println("- " + tarefa);
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
