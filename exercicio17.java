import java.util.TreeSet;

public class exercicio17 {
    public static void main(String[] args) {
        TreeSet<Produto> produtos = new TreeSet<>();
        
        produtos.add(new Produto("Arroz", 20.50));
        produtos.add(new Produto("Feijão", 15.30));
        produtos.add(new Produto("Macarrão", 10.00));
        produtos.add(new Produto("Açúcar", 5.75));
        produtos.add(new Produto("Sal", 2.50));

        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " - R$ " + produto.getPreco());
        }
    }
}

class Produto implements Comparable<Produto> {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public int compareTo(Produto outro) {
        return Double.compare(this.preco, outro.preco);
    }
}