public class Livro {
    public String titulo;
    public String autor;
    public int numpaginas;
    public String genero;

    public Livro(String titulo, String autor, int numpaginas, String genero) {

        this.titulo = titulo;
        this.autor = autor;
        this.numpaginas = numpaginas;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumpaginas() {
        return numpaginas;
    }

    public void setNumpaginas(int numerodepaginas) {
        this.numpaginas = numerodepaginas;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
}
public void ler() {
    System.out.println("Lendo o livro: " + titulo);
}

public void folhear(int pagina) {
    if (pagina >= 1 && pagina <= numpaginas) {
        System.out.println("Folheando para a página " + pagina + " do livro: " + titulo);
    } else {
        System.out.println("Página inválida!");
    }
}

public void anotar(String nota) {
    System.out.println("Anotando no livro: " + nota);
}
}
