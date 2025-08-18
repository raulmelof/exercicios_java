import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class exercicio28 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();

        String[] palavras = frase.split(" ");
        for (String palavra : palavras) {
            deque.addLast(palavra);
        }

        System.out.println("Frase invertida:");
        while (!deque.isEmpty()) {
            System.out.print(deque.removeLast());
            if (!deque.isEmpty()) {
                System.out.print(" ");
            }
        }
    }
}
