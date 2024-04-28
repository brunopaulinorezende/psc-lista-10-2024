public class Caneta {
    private String corTinta;
    private String tipoPonta;
    private String marca;

    public Caneta(String corTinta, String tipoPonta, String marca) {
        this.corTinta = corTinta;
        this.tipoPonta = tipoPonta;
        this.marca = marca;
    }

    public String getCorTinta() {
        return corTinta;
    }

    public void setCorTinta(String corTinta) {
        this.corTinta = corTinta;
    }

    public String getTipoPonta() {
        return tipoPonta;
    }

    public void setTipoPonta(String tipoPonta) {
        this.tipoPonta = tipoPonta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
