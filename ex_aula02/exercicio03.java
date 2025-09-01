import java.util.List;

public class exercicio03 {
    public static void main(String[] args) {
    	List<Produto> produtos = TesteProduto.listaDeProdutos();
    	System.out.print(produtos.stream()
    		.filter(produto -> produto.getCategoria() == "Livros")
	        .mapToDouble(Produto::getPreco)
	        .sum());
    }
}
