import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class exercicio10 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            numeros.add(random.nextInt(100));
        }

        System.out.println("Números gerados: " + numeros);

        Collections.sort(numeros);
        System.out.println("Números ordenados: " + numeros);
    }
}
