
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Map<String, String> dicionario = new HashMap<String, String>();
        Scanner input = new Scanner(System.in);

        dicionario.put("Bravo", "Angry");
        dicionario.put("Feliz", "Happy");
        dicionario.put("Medo", "Fear");
        dicionario.put("Peixe", "Fish");
        dicionario.put("Rato", "Rat");

        System.out.println("Digite uma palavra:");
        String palavra = input.nextLine();

        if (dicionario.containsKey(palavra)) {
            System.out.println("A tradução de '" + palavra + "' é: " + dicionario.get(palavra));
        } else {
            System.out.println("Palavra não encontrada no dicionário.");
        }
    }
}
