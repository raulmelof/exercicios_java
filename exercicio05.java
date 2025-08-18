public class exercicio05 {
    public static void main(String[] args) {
        Carro escortXR3 = new Carro("Ford", "Escort XR3", 1993);

        escortXR3.exibirInfo();
    }
}

class Carro {
    private String marca;
    private String modelo;
    private Integer ano;

    public Carro(String marca, String modelo, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
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

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public void exibirInfo(){
        System.out.printf("\nMarca: " + this.marca + "\nModelo: " + this.modelo + "\nAno: " + this.ano);
    }

}