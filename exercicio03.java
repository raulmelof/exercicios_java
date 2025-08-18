import java.util.Random;
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Random naleatorio = new Random();
        Scanner n = new Scanner(System.in);

        int random = naleatorio.nextInt(100) + 1;

        System.out.print("Adivinhe o número que estou pensando: ");
        int adivinhado = n.nextInt();

        int contador = 0;

        while(adivinhado != random){
            System.out.print("\nNão, não! Número errado! Tente outra vez!");

            int diferenca = adivinhado - random;

            if(diferenca > 50 && adivinhado < random){
                System.out.print("Extremamente baixo: \n");
            }else
            if(diferenca > 50 && adivinhado > random){
                System.out.print("Extremamente alto: \n");
            }else
            if(diferenca > 20 && adivinhado < random){
                System.out.print("Muito baixo: \n");
            }else
            if(diferenca > 20 && adivinhado > random){
                System.out.print("Muito alto: \n");
            }else
            if(diferenca > 10 && adivinhado < random){
                System.out.print("Baixo: \n");
            }else
            if(diferenca > 10 && adivinhado > random){
                System.out.print("Alto: \n");
            }else
            if(diferenca < 10){
                System.out.print("Ta chegando perto: \n");
            }

            adivinhado = n.nextInt();

            contador++;
        }

        System.out.printf("\nIsso, isso! Adivinhou meu número! O seu número de tentativas foi: %d", contador);
    }
}
