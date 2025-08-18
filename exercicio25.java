import java.util.ArrayDeque;
import java.util.Scanner;

public class exercicio25 {
    public static void main(String[] args) {
        ArrayDeque<String> pilha = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adicione 3 livros a pilha");
        for (int i = 0; i < 3; i++) {
            String livro = scanner.nextLine();
            pilha.push(livro);
        }

        String livro = pilha.pop();
        System.out.println("Último livro adicionado: " + livro);

        String livroTopo = pilha.peek();
        System.out.println("Livro no topo da pilha: " + livroTopo);
    }
}
