public class Garrafadeagua {
    private double capacidadeLitros;
    private String material;
    private String marca;

    public Garrafadeagua(double capacidadeLitros, String material, String marca) {
        this.capacidadeLitros = capacidadeLitros;
        this.material = material;
        this.marca = marca;
    }

    public double getCapacidadeLitros() {
        return capacidadeLitros;
    }

    public void setCapacidadeLitros(double capacidadeLitros) {
        this.capacidadeLitros = capacidadeLitros;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void beber() {
        System.out.println("Bebendo água da garrafa.");
    }

    public void encher() {
        System.out.println("Enchendo a garrafa de água.");
    }

    public void transportar() {
        System.out.println("Transportando a garrafa de água.");
    }
}