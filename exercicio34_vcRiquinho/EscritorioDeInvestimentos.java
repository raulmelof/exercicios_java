package exercicio34_vcRiquinho;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EscritorioDeInvestimentos {
    private List<Cliente> clientes = new ArrayList<>();
    private List<ProdutoInvestimento> produtos = new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente " + cliente.getNome() + " adicionado com sucesso.");
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }

    public Optional<Cliente> buscarCliente(String cpfCnpj) {
        return clientes.stream().filter(cliente -> {
            if (cliente instanceof PessoaFisica) {
                return ((PessoaFisica) cliente).getCpf().equals(cpfCnpj);
            } else if (cliente instanceof PessoaJuridica) {
                return ((PessoaJuridica) cliente).getCnpj().equals(cpfCnpj);
            }
            return false;
        }).findFirst();
    }
    
    public boolean removerCliente(String cpfCnpj) {
        return clientes.removeIf(cliente -> {
             if (cliente instanceof PessoaFisica) {
                return ((PessoaFisica) cliente).getCpf().equals(cpfCnpj);
            } else if (cliente instanceof PessoaJuridica) {
                return ((PessoaJuridica) cliente).getCnpj().equals(cpfCnpj);
            }
            return false;
        });
    }

    public void adicionarProduto(ProdutoInvestimento produto) {
        produtos.add(produto);
        System.out.println("Produto " + produto.getNome() + " adicionado com sucesso.");
    }
    
    public List<ProdutoInvestimento> listarProdutos() {
        return produtos;
    }
}
