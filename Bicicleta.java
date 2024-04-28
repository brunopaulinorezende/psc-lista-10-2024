public class Bicicleta {

    private String marca;
    private String modelo;
    private String cor;
    private String tipo;

    public Bicicleta(String marca, String modelo, String cor, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.tipo = tipo;
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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void pedalar() {
        System.out.println("Pedalando...");
    }

    public void frear() {
        System.out.println("Freando...");
    }

    public void transportar() {
        System.out.println("Transportando...");
    }
}
