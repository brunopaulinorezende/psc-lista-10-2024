public class Principalbicicleta  {
    public static void main(String[] args) {
  
        Bicicleta minhaBicicleta = new Bicicleta("Caloi", "Explorer", "Preto", "Bicicleta de Montanha");

        System.out.println("Características da Bicicleta:");
        System.out.println("Marca: " + minhaBicicleta.getMarca());
        System.out.println("Modelo: " + minhaBicicleta.getModelo());
        System.out.println("Cor: " + minhaBicicleta.getCor());
        System.out.println("Tipo: " + minhaBicicleta.getTipo());

        System.out.println("\nRealizando ações:");
        minhaBicicleta.pedalar();
        minhaBicicleta.frear();
        minhaBicicleta.transportar();
    }
}

