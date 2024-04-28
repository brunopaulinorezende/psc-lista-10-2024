public class Principalgarrafa {
    public static void main(String[] args) {
        Garrafadeagua garrafa = new Garrafadeagua(1.5, "plástico", "MarcaX");

        System.out.println("Características da Garrafa de Água:");
        System.out.println("Capacidade: " + garrafa.getCapacidadeLitros() + " litros");
        System.out.println("Material: " + garrafa.getMaterial());
        System.out.println("Marca: " + garrafa.getMarca());

        System.out.println("\nAções:");
        garrafa.encher();
        garrafa.beber();
        garrafa.transportar();
    }
}
