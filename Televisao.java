public class Televisao {
    private String marca;
    private double tamanhoTelaPolegadas;
    private String resolucao;

    public Televisao(String marca, double tamanhoTelaPolegadas, String resolucao) {
        this.marca = marca;
        this.tamanhoTelaPolegadas = tamanhoTelaPolegadas;
        this.resolucao = resolucao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanhoTelaPolegadas() {
        return tamanhoTelaPolegadas;
    }

    public void setTamanhoTelaPolegadas(double tamanhoTelaPolegadas) {
        this.tamanhoTelaPolegadas = tamanhoTelaPolegadas;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public void assistir() {
        System.out.println("Assistindo televisão.");
    }

    public void mudarCanal() {
        System.out.println("Mudando de canal.");
    }

    public void ajustarVolume() {
        System.out.println("Ajustando o volume da televisão.");
    }
}
