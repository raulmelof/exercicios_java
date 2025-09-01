import java.util.ArrayList;
import java.util.List;

public class exercicio02 {
    public static void main(String[] args) {
    	List<Produto> produtos = TesteProduto.listaDeProdutos();
    	List<Double> precos500 = new ArrayList<>();
    	produtos.stream()
	        .filter(produto -> produto.getPreco() > 500.00)
	        .map(Produto::getPreco)
	        .forEach(preco -> precos500.add(preco));
    	precos500.stream()
    		.forEach(preco -> System.out.println(preco));
    }
}
