import java.util.LinkedList;

public class exercicio29 {
    public static void main(String[] args) {
        Navegador navegador = new Navegador();
        navegador.visitar("google.com");
        navegador.visitar("github.com");
        navegador.visitar("stackoverflow.com");

        System.out.println("Página atual: " + navegador.getPaginaAtual());
        navegador.voltar();
        System.out.println("Página atual: " + navegador.getPaginaAtual());
        navegador.voltar();
        System.out.println("Página atual: " + navegador.getPaginaAtual());
        navegador.avancar();
        System.out.println("Página atual: " + navegador.getPaginaAtual());
    }
}

class Navegador {
    private LinkedList<String> lista = new LinkedList<>();
    private int indiceAtual = -1;

    public void visitar(String url) {
        while (lista.size() > indiceAtual + 1) {
            lista.removeLast();
        }
        lista.add(url);
        indiceAtual = lista.size() - 1;
    }

    public void voltar() {
        if (indiceAtual > 0) {
            indiceAtual--;
        } else {
            System.out.println("Não há página anterior.");
        }
    }

    public void avancar() {
        if (indiceAtual < lista.size() - 1) {
            indiceAtual++;
        } else {
            System.out.println("Não há próxima página.");
        }
    }

    public String getPaginaAtual() {
        if (indiceAtual >= 0 && indiceAtual < lista.size()) {
            return lista.get(indiceAtual);
        }
        return "Nenhuma página visitada.";
    }
}