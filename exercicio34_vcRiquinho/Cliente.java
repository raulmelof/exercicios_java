package exercicio34_vcRiquinho;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
    private String nome;
    private String email;
    private List<Conta> contas;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public abstract String getTipo();
}