public class Principal {
    public static void main(String[] args) {

        Livro livro = new Livro("A cabana", "Sergio Mello", 1178, "Suspense");

        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Número de páginas: " + livro.getNumpaginas());
        System.out.println("Gênero: " + livro.getGenero());
    }
}
