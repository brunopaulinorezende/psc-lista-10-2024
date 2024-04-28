public class Principalguardachuva {
    public static void main(String[] args) {
        GuardaChuva guardaChuva = new GuardaChuva("Grande", "Azul", "Poliéster");

        System.out.println("Características do Guarda-Chuva:");
        System.out.println("Tamanho: " + guardaChuva.getTamanho());
        System.out.println("Cor: " + guardaChuva.getCor());
        System.out.println("Material: " + guardaChuva.getMaterial());

        System.out.println("\nAções:");
        guardaChuva.protegerDaChuva();
        guardaChuva.abrir();
        guardaChuva.fechar();
    }
}
