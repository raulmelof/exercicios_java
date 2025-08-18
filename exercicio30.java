import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class exercicio30 {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Ana", 8.5));
        alunos.add(new Aluno("Bruno", 6.0));
        alunos.add(new Aluno("Carla", 4.5));
        alunos.add(new Aluno("Daniel", 7.2));
        alunos.add(new Aluno("Eva", 5.8));
        alunos.add(new Aluno("Felipe", 3.9));

        Map<String, List<Aluno>> agrupados = agruparPorFaixa(alunos);

        for (String faixa : agrupados.keySet()) {
            System.out.println(faixa + ": " + agrupados.get(faixa));
        }
    }

    public static Map<String, List<Aluno>> agruparPorFaixa(List<Aluno> alunos) {
        Map<String, List<Aluno>> map = new HashMap<>();
        map.put("Aprovados", new ArrayList<>());
        map.put("Recuperação", new ArrayList<>());
        map.put("Reprovados", new ArrayList<>());

        for (Aluno aluno : alunos) {
            if (aluno.nota >= 7) {
                map.get("Aprovados").add(aluno);
            } else if (aluno.nota >= 5) {
                map.get("Recuperação").add(aluno);
            } else {
                map.get("Reprovados").add(aluno);
            }
        }
        return map;
    }
}

class Aluno {
    String nome;
    double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nome + " (" + nota + ")";
    }
}