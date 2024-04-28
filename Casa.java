public class Casa {
    private int numeroQuartos;
    private double areaConstruida;
    private String localizacao;
    private int numeroBanheiros;

    public Casa(int numeroQuartos, double areaConstruida, String localizacao, int numeroBanheiros) {
        this.numeroQuartos = numeroQuartos;
        this.areaConstruida = areaConstruida;
        this.localizacao = localizacao;
        this.numeroBanheiros = numeroBanheiros;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public double getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(double areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getNumeroBanheiros() {
        return numeroBanheiros;
    }

    public void setNumeroBanheiros(int numeroBanheiros) {
        this.numeroBanheiros = numeroBanheiros;
    }

    public void morar() {
        System.out.println("Mora na casa.");
    }

    public void limpar() {
        System.out.println("Limpando a casa.");
    }

    public void decorar() {
        System.out.println("Decorando a casa.");
    }
}
