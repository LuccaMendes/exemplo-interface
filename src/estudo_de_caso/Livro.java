package estudo_de_caso;

public class Livro {

    private String titulo;
    private String autor;
    private Double valor;

    public Livro() {
    }

    public Livro(String titulo, String autor, Double valor) {
        this.titulo = titulo;
        this.autor = autor;
        this.valor = valor;
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

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Livro" +
                "\n Titulo: " + titulo +
                "\n Autor: " + autor +
                "\n Valor: " + valor ;
    }
}
