import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        List<String> cidades = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        cidades.add("Sao Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Belo Horizonte");
        cidades.add("Curitiba");
        cidades.add("Porto Alegre");

        System.out.println("Digite o nome de uma cidade (sem acentos):");
        String cidade = input.nextLine();
        if (cidades.contains(cidade)) {
            System.out.println("A cidade " + cidade + " está na lista.");
            int index = cidades.indexOf(cidade);
            System.out.println("A cidade " + cidade + " está na posição " + index + " da lista.");
        } else {
            System.out.println("A cidade " + cidade + " não está na lista.");
        }
    }
}
