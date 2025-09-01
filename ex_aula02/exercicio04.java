import java.util.List;
import java.util.Optional;

public class exercicio04 {
    public static Optional<Produto> buscarProdutoPorNome(List<Produto> produtos, String nome) {
        return produtos.stream()
        		.filter(produto -> produto.getNome() == nome)
                .findFirst();
    }
}
