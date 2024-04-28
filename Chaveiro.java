public class Chaveiro {
    private String material;
    private String forma;
    private String cor;

    public Chaveiro(String material, String forma, String cor) {
        this.material = material;
        this.forma = forma;
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void abrirFechaduras() {
        System.out.println("Abrindo fechaduras com o chaveiro.");
    }

    public void organizarChaves() {
        System.out.println("Organizando as chaves no chaveiro.");
    }

    public void transportar() {
        System.out.println("Transportando o chaveiro.");
    }
}
