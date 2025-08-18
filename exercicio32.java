public class exercicio32 {
    public static void main(String[] args) {
        Configuracao config = new Configuracao();

        try {
            var field = Configuracao.class.getDeclaredField("urlConexao");
            field.setAccessible(true);

            field.set(config, "db.producao.com:5432");

            String novoValor = (String) field.get(config);
            System.out.println("Novo valor de urlConexao: " + novoValor);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.err.println("Ocorreu um erro ao acessar o atributo via reflection: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

class Configuracao {
    private String urlConexao = "localhost:5432";
}