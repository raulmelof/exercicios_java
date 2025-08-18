import java.util.HashSet;
import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        HashSet<String> emails = new HashSet<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Digite os emails (digite 'sair' para encerrar):");
        while (true) {
            String email = input.nextLine();
            if (email.equalsIgnoreCase("sair")) {
                break;
            }
            emails.add(email);
        }

        System.out.println("Emails únicos: " + emails);
        System.out.println("Quantidade de emails únicos: " + emails.size());
    }
}