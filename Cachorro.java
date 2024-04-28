public class Cachorro {
    private String raca;
    private String cor;
    private int idade;
    private double peso;

    public Cachorro(String raca, String cor, int idade, double peso) {
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
        this.peso = peso;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void latir() {
        System.out.println("Au au!");
    }

    public void correr() {
        System.out.println("Correndo...");
    }

    public void brincar() {
        System.out.println("Brincando...");
    }

    public void comer() {
        System.out.println("Comendo...");
    }
}
