import java.util.LinkedList;

public class exercicio11 {
    public static void main(String[] args) {
        LinkedList<String> fila = new LinkedList<>();

        System.out.println("Adicionando pessoas à fila:");
        fila.addLast("João");
        fila.addLast("Maria");
        fila.addLast("José");
        fila.addLast("Raul");
        fila.addLast("Fábio");

        System.out.println("A serem atendidos: " + fila);

        System.out.println("Atendendo: " + fila.getFirst());
        fila.removeFirst();

        System.out.println("A serem atendidos: " + fila);

        System.out.println("Atendendo: " + fila.getFirst());
        fila.removeFirst();
        
        System.out.println("A serem atendidos: " + fila);

        System.out.println("Adicionando pessoas prioritárias a fila:");
        fila.addFirst("Duda");
        fila.addFirst("Carlos");

        System.out.println("A serem atendidos: " + fila);
    }
}
