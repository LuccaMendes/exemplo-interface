package estudo_de_caso;

public class Revista {

    private String titulo;
    private String editora;
    private Double valor;

    public Revista() {
    }

    public Revista(String titulo, String editora, Double valor) {
        this.titulo = titulo;
        this.editora = editora;
        this.valor = valor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Revista" +
                "\n Titulo: " + titulo +
                "\n Editora: " + editora +
                "\n Valor: " + valor ;
    }
}
