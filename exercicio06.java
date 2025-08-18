
import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = r.nextDouble();
        Circulo c = new Circulo(raio);
        System.out.println("Área do círculo: " + c.calcularArea());
    }
}

class Circulo{
    private double raio;

    public Circulo(double raio) {
        this.setRaio(raio);
    }
    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("O raio deve ser maior que zero.");
        }
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}