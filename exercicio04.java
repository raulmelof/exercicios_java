public class exercicio04 {
    public static void main(String[] args) {
        int[] numeros = {2, 5, 7, 1, 4, 3, 8 ,9, 0, 6};

        int total = 0;

        for (int numero : numeros){
            if (numero%2 != 0){
                total += numero;
            }
        }

        System.out.printf("\nA soma dos números ímpares é: %d", total);
    }
}
