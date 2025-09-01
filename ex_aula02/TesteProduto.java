import java.util.ArrayList;
import java.util.List;

public class TesteProduto {
	public static List<Produto> listaDeProdutos() {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Celular", 700.00, "Eletrônicos"));
        produtos.add(new Produto("Notebook", 3500.00, "Eletrônicos"));
        produtos.add(new Produto("Teclado", 500.00, "Eletrônicos"));
        produtos.add(new Produto("Mouse", 200.00, "Eletrônicos"));
        produtos.add(new Produto("Memórias do Subsolo", 55.00, "Livros"));
        produtos.add(new Produto("Uma Criatura Dócil", 40.00, "Livros"));
        produtos.add(new Produto("Os Irmãos Karamazov", 60.00, "Livros"));
        produtos.add(new Produto("Shinsetsu", 30.00, "Livros"));
        return produtos;
    }
}