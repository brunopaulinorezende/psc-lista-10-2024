public class Principalcachorro {
    public static void main(String[] args) {
    
        Cachorro cachorro = new Cachorro("Labrador", "Amarelo", 3, 25.5);

        System.out.println("Raça: " + cachorro.getRaca());
        System.out.println("Cor: " + cachorro.getCor());
        System.out.println("Idade: " + cachorro.getIdade() + " anos");
        System.out.println("Peso: " + cachorro.getPeso() + " kg");
    }
}
