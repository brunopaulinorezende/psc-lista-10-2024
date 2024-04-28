public class Principalchaveiro {
    public static void main(String[] args) {
        Chaveiro chaveiro = new Chaveiro("metal", "retangular", "prateado");

        System.out.println("Características do Chaveiro:");
        System.out.println("Material: " + chaveiro.getMaterial());
        System.out.println("Forma: " + chaveiro.getForma());
        System.out.println("Cor: " + chaveiro.getCor());

        System.out.println("\nAções:");
        chaveiro.abrirFechaduras();
        chaveiro.organizarChaves();
        chaveiro.transportar();
    }
}
