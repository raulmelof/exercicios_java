import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class exercicio13 {
    public static void main(String[] args) {
        List<Integer> numerosdups = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numerosdups.add(i);
            numerosdups.add(i);
        }

        System.out.println("Números duplicados: " + numerosdups);

        HashSet<Integer> numerosUnicos = new HashSet<>(numerosdups);
        System.out.println("Números únicos: " + numerosUnicos);
    }
}
