public class Principalcasa {
    public static void main(String[] args) {
  
        Casa minhaCasa = new Casa(3, 150.5, "Rua Principal", 2);

        System.out.println("Características da Casa:");
        System.out.println("Número de quartos: " + minhaCasa.getNumeroQuartos());
        System.out.println("Área construída: " + minhaCasa.getAreaConstruida() + " metros quadrados");
        System.out.println("Localização: " + minhaCasa.getLocalizacao());
        System.out.println("Número de banheiros: " + minhaCasa.getNumeroBanheiros());

        System.out.println("\nRealizando ações:");
        minhaCasa.morar();
        minhaCasa.limpar();
        minhaCasa.decorar();
    }
}
