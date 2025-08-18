package exercicio34_lanchonete;

public class Main {
    public static void main(String[] args) {
        Pizza pizzaCalabresa = new Pizza(45.00, "20/08/2025", 0.8, "Calabresa", "Catupiry", "Tomate");
        Lanche xTudo = new Lanche(25.50, "19/08/2025", 0.5, "Baguete", "Hambúrguer e Salada", "Maionese");
        Salgadinho coxinha = new Salgadinho(8.00, "18/08/2025", 0.15, "Frito", "Mandioca", "Frango");
        Salgadinho esfiha = new Salgadinho(7.50, "21/08/2025", 0.18, "Assado", "Trigo", "Carne");

        Pedido pedidoCliente = new Pedido("Maria Souza", 10.0);

        pedidoCliente.adicionarItem(pizzaCalabresa);
        pedidoCliente.adicionarItem(xTudo);
        pedidoCliente.adicionarItem(coxinha);
        pedidoCliente.adicionarItem(esfiha);

        double total = pedidoCliente.calcularTotal();
        System.out.printf("O valor total do pedido é: R$ %.2f\n\n", total);
        
        double valorPagoPeloCliente = 100.00;
        pedidoCliente.mostrarFatura(valorPagoPeloCliente);
    }
}
