public class exercicio07 {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Toyota", "Corolla", 4);
        Veiculo moto = new Moto("Honda", "CBR", 1000);

        System.out.println(carro);
        System.out.println(moto);
    }
}

class Veiculo {
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "O seu veículo é um " + getMarca() + " modelo " + getModelo();
    }
}

class Carro extends Veiculo {
    private Integer numeroDePortas;

    public Carro(String marca, String modelo, Integer numeroDePortas) {
        super(marca, modelo);
        this.numeroDePortas = numeroDePortas;
    }

    public Integer getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(Integer numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public String toString() {
        return super.toString() + " O seu carro tem " + getNumeroDePortas() + " portas.";
    }
}

class Moto extends Veiculo {
    private Integer cilindradas;

    public Moto(String marca, String modelo, Integer cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    public Integer getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return super.toString() + " A sua moto tem " + getCilindradas() + " cilindradas.";
    }
}