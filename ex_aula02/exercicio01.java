import java.util.List;

public class exercicio01 {
    public static void main(String[] args) {
    	List<Produto> produtos = TesteProduto.listaDeProdutos();
    	for (Produto p : produtos) {
            if (p.getCategoria().equals("Eletrônicos")) {
                System.out.println(p.getNome());
            }
        }
    	produtos.stream()
	        .filter(produto -> produto.getCategoria() == "Eletrônicos")
	        .forEach(produto -> System.out.println(produto.getNome()));
    }
}
