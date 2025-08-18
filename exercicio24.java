import java.util.LinkedList;
import java.util.Queue;

public class exercicio24 {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.offer("Documento1.pdf");
        fila.offer("Documento2.pdf");
        fila.offer("Documento3.pdf");
        fila.offer("Documento4.pdf");
        fila.offer("Documento5.pdf");

        while (!fila.isEmpty()) {
            String documento = fila.poll();
            System.out.println("Imprimindo: " + documento);
        }
        System.out.println(fila);
    }
}
