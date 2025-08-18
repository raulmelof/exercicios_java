import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner nota1 = new Scanner(System.in);
        Scanner nota2 = new Scanner(System.in);
        Scanner nota3 = new Scanner(System.in);

        System.out.print("Digite as notas: ");
        float n1 = nota1.nextFloat();
        float n2 = nota2.nextFloat();
        float n3 = nota3.nextFloat();

        float media = (n1 + n2 + n3) / 3;

        System.out.printf("\nA média do aluno é: %.2f", media);

        if (media<=7) {
            System.out.printf("\nVocê está reprovado!");
            if (media >= 5 && media < 7) {
                System.out.printf("\nApto para a recuperação!");
            }else{
                System.out.printf("\nInapto para a recuperação!");
            }
        }else{
            System.out.printf("\nVocê está aprovado!");
        }
    }
}
