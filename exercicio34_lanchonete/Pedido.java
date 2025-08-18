package exercicio34_lanchonete;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String nomeCliente;
    private double taxaServico;
    private List<Prato> itensConsumidos;

    public Pedido(String nomeCliente, double taxaServico) {
        this.nomeCliente = nomeCliente;
        this.taxaServico = taxaServico;
        this.itensConsumidos = new ArrayList<>();
    }

    public void adicionarItem(Prato item) {
        this.itensConsumidos.add(item);
    }

    public double calcularTotal() {
        double subtotal = 0.0;
        for (Prato item : itensConsumidos) {
            subtotal += item.getPreco();
        }
        double valorTaxa = subtotal * (taxaServico / 100.0);
        return subtotal + valorTaxa;
    }

    public void mostrarFatura(double valorPago) {
        System.out.println("=====================================");
        System.out.println("      Lanchonete Quase Três Lanches");
        System.out.println("=====================================");
        System.out.println("Cliente: " + this.nomeCliente);
        System.out.println("\nItens Consumidos:");
        double subtotal = 0.0;
        for (Prato item : itensConsumidos) {
            System.out.printf("- %-20s R$ %6.2f\n", item.getClass().getSimpleName(), item.getPreco());
            subtotal += item.getPreco();
        }
        
        double valorTaxa = subtotal * (taxaServico / 100.0);
        double totalAPagar = subtotal + valorTaxa;

        System.out.println("-------------------------------------");
        System.out.printf("Subtotal:                    R$ %6.2f\n", subtotal);
        System.out.printf("Taxa de Serviço (%.1f%%):     R$ %6.2f\n", taxaServico, valorTaxa);
        System.out.println("-------------------------------------");
        System.out.printf("Total a Pagar:               R$ %6.2f\n", totalAPagar);
        System.out.printf("Valor Pago:                  R$ %6.2f\n", valorPago);
        
        if (valorPago >= totalAPagar) {
            System.out.printf("Troco:                       R$ %6.2f\n", (valorPago - totalAPagar));
        } else {
            System.out.printf("Valor Faltante:              R$ %6.2f\n", (totalAPagar - valorPago));
        }
        System.out.println("=====================================");
    }
}
