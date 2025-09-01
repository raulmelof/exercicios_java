import java.util.List;

public class exercicio05 {
    public static void main(String[] args) {
    	List<Produto> produtos = TesteProduto.listaDeProdutos();
        exercicio04.buscarProdutoPorNome(produtos, "Notebook")
        	.ifPresent(produto -> System.out.println(produto));
        exercicio04.buscarProdutoPorNome(produtos, "Câmera")
        	.orElseThrow(() -> new RuntimeException("Produto não encontrado!"));
    }
}
