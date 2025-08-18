import java.util.List;
import java.util.Map;

public class exercicio26 {
    public static void main(String[] args) {
        Map<String, List<Produto>> catalogo = Map.of(
            "Eletrônicos", List.of(
                new Produto("Smartphone", 1500.00),
                new Produto("Notebook", 3500.00)
            ),
            "Eletrodomésticos", List.of(
                new Produto("Geladeira", 2500.00),
                new Produto("Máquina de Lavar", 2000.00)
            )
        );
        for (String categoria : catalogo.keySet()) {
            System.out.println("Categoria: " + categoria);
            for (Produto produto : catalogo.get(categoria)) {
                System.out.println(" - " + produto.getNome() + ": R$" + produto.getPreco());
            }
        }
    }
}
