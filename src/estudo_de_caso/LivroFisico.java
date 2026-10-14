package estudo_de_caso;

public class LivroFisico extends Livro{

    public LivroFisico(String titulo, String autor, Double valor) {
        super(titulo, autor, valor);
    }

    @Override
    public Double getValor() {
        return super.getValor() * 1.05;
    }
}
