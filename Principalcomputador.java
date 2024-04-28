public class Principalcomputador {
    public static void main(String[] args) {
        Computador computador = new Computador("Dell", "Inspiron 15", "Intel Core i5", 8);

        System.out.println("Marca: " + computador.getMarca());
        System.out.println("Modelo: " + computador.getModelo());
        System.out.println("Processador: " + computador.getProcessador());
        System.out.println("Memória RAM: " + computador.getMemoriaRAM() + " GB");
    }
}
