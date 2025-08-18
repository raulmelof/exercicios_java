import java.util.LinkedHashSet;

public class exercicio15 {
    public static void main(String[] args) {
        LinkedHashSet<String> diasSemana = new LinkedHashSet<>();
        diasSemana.add("Quarta");
        diasSemana.add("Segunda");
        diasSemana.add("Sexta");
        diasSemana.add("Quinta");
        diasSemana.add("Domingo");
        diasSemana.add("Sabado");
        diasSemana.add("Terca");

        for (String dia : diasSemana) {
            System.out.println(dia);
        }
    }
}
