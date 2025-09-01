import java.util.ArrayList;
import java.util.List;

public class exercicio06 {
    public static void main(String[] args) {
    	List<Produto> produtos = TesteProduto.listaDeProdutos();
    	List<String> produtosNomesLambda = new ArrayList<>();
    	List<String> produtosNomesMetodo = new ArrayList<>();
    	produtos.stream()
	        .map(p ->p.getNome())
	        .forEach(p -> produtosNomesLambda.add(p));
    	produtosNomesLambda.stream()
			.forEach(nome -> System.out.println(nome));
    	produtos.stream()
	        .map(Produto::getNome)
	        .forEach(nome -> produtosNomesMetodo.add(nome));
    	produtosNomesMetodo.stream()
			.forEach(nome -> System.out.println(nome));
    }
}
