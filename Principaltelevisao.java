public class Principaltelevisao {
    public static void main(String[] args) {
        Televisao televisao = new Televisao("Sony", 55, "4K");

        System.out.println("Características da Televisão:");
        System.out.println("Marca: " + televisao.getMarca());
        System.out.println("Tamanho da Tela: " + televisao.getTamanhoTelaPolegadas() + " polegadas");
        System.out.println("Resolução: " + televisao.getResolucao());

        System.out.println("\nAções:");
        televisao.assistir();
        televisao.mudarCanal();
        televisao.ajustarVolume();
    }
}
