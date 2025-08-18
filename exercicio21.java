import java.util.LinkedHashMap;

public class exercicio21 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> produtos = new LinkedHashMap<>();
        produtos.put(1, "Arroz");
        produtos.put(3, "Feijão");
        produtos.put(2, "Macarrão");
        produtos.put(5, "Batata");
        produtos.put(4, "Carne");

        for (Integer key : produtos.keySet()) {
            System.out.println("ID: " + key + ", Nome: " + produtos.get(key));
        }
    }
}
