import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Digite o número para gerar a tabuada: ");
        int tabuada = n.nextInt();

        for (int i = 1; i <= 10; i++){
            int resultado = tabuada * i;
            System.out.printf("%d x %d = %d\n", tabuada, i, resultado);
        }
    }
}
