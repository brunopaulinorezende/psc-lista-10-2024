public class Principalcaneta {
    public static void main(String[] args) {

        Caneta caneta = new Caneta("Azul", "Fina", "Bic");

        System.out.println("Cor da tinta: " + caneta.getCorTinta());
        System.out.println("Tipo de ponta: " + caneta.getTipoPonta());
        System.out.println("Marca: " + caneta.getMarca());
    }
}
