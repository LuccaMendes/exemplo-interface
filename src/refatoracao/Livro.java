package refatoracao;

public class Livro implements Produto{

    private String titulo;
    private String autor;
    protected double valor;

    public Livro(){
    }

    public Livro(String titulo, String autor, double valor) {
        this.titulo = titulo;
        this.autor = autor;
        this.valor = valor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    @Override
    public String toString() {
        return "Livro" +
                "\n Titulo: " + titulo +
                "\n Autor: " + autor +
                "\n Valor: " + valor ;
    }

    @Override
    public String titulo() {
        return "";
    }

    @Override
    public double valor() {
        return 0;
    }
}
