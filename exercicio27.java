import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class exercicio27 {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();
        
        listaNomes.add("Alice");
        listaNomes.add("Bob");
        listaNomes.add("Charlie");
        listaNomes.add("Alice");
        listaNomes.add("Bob");
        listaNomes.add("Daniel");
        listaNomes.add("Eva");

        List<String> ganhadores = sortearGanhadores(listaNomes, 3);
        System.out.println("Ganhadores:");
        for (String nome : ganhadores) {
            System.out.println(nome);
        }
    }

    public static List<String> sortearGanhadores(List<String> nomes, int quantidade) {
        Set<String> nomesUnicos = new HashSet<>(nomes);
        List<String> listaUnica = new ArrayList<>(nomesUnicos);

        List<String> ganhadores = new ArrayList<>();
        Random random = new Random();

        if (listaUnica.size() < quantidade) {
            throw new IllegalArgumentException("Não há participantes únicos suficientes para o sorteio.");
        }

        while (ganhadores.size() < quantidade) {
            int indice = random.nextInt(listaUnica.size());
            String sorteado = listaUnica.get(indice);
            if (!ganhadores.contains(sorteado)) {
                ganhadores.add(sorteado);
            }
        }
        return ganhadores;
    }
}
