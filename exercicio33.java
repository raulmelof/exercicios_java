import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Teste {
}

public class exercicio33 {
    public static void main(String[] args) {
        MinhaClasseDeTeste obj = new MinhaClasseDeTeste();
        ExecutorDeTestes.executarTestes(obj);
    }
}

class MinhaClasseDeTeste {
    @Teste
    public void testeSoma() {
        System.out.println("Executando testeSoma: SUCESSO");
    }

    public void metodoComum() {
        System.out.println("Este não é um teste.");
    }

    @Teste
    public void testeLogin() {
        System.out.println("Executando testeLogin: SUCESSO");
    }
}

class ExecutorDeTestes {
    public static void executarTestes(Object obj) {
        Method[] metodos = obj.getClass().getDeclaredMethods();
        for (Method metodo : metodos) {
            if (metodo.isAnnotationPresent(Teste.class)) {
                try {
                    metodo.invoke(obj);
                } catch (Exception e) {
                    System.out.println("Erro ao executar " + metodo.getName() + ": " + e.getMessage());
                }
            }
        }
    }
}