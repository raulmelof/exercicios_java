
import java.util.HashMap;

public interface exercicio19 {
    public static void main(String[] args) {
        HashMap<String, Integer> texto = new HashMap<>();

        String frase = "bLa bla bla bla, word word word word, palavra palavra palavra palavra, corinthians corinthians corinthians corinthians, bla bla bla bla, word word word word, palavra palavra palavra palavra, corinthians corinthians corinthians corinthians";

        frase = frase.toLowerCase().replaceAll("[^a-zA-Z ]", "");
        String[] palavras = frase.split(" ");
        for (String palavra : palavras) {
            if (texto.containsKey(palavra)) {
                texto.put(palavra, texto.get(palavra) + 1);
            } else {
                texto.put(palavra, 1);
            }
        }

        System.out.println(texto);
    }
}
