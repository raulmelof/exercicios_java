import java.util.TreeSet;

public class exercicio16 {
    public static void main(String[] args) {
        TreeSet<String> nomes = new TreeSet<>();
        
        nomes.add("Carlos");
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Eduardo");
        nomes.add("Daniela");

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
