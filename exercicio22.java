import java.util.TreeMap;

public class exercicio22 {
    public static void main(String[] args) {
        TreeMap<String, Double> notas = new TreeMap<>();
        notas.put("João", 8.5);
        notas.put("Maria", 9.0);
        notas.put("Pedro", 7.5);
        notas.put("Ana", 8.0);
        notas.put("Carlos", 9.5);

        for (String key : notas.keySet()) {
            System.out.println("Aluno: " + key + ", Nota: " + notas.get(key));
        }
    }
}
