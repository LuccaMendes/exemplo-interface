package estudo_de_caso;

public class App {
    static void main() {

        Livro LivroFisico =
                new LivroFisico("Clean code","Robert C. Martin", 250.0);

        Livro ebook =
                new Ebook("Engenharia de Software", "Ian Sommerville", 300.0);

        Livro minilivro =
                new MiniLivro("UML", "Ralph Clark", 220.0);

        Revista revista =
                new Revista("SBC", "Moderna", 400.0);

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarLivro(LivroFisico);
        carrinhoDeCompras.adicionarLivro(ebook);
        carrinhoDeCompras.adicionarLivro(minilivro);
        carrinhoDeCompras.adicionarRevista(revista);

        carrinhoDeCompras.exibirCarrinho();
        System.out.println("Total R$: " +carrinhoDeCompras.totalCarrinho());
    }
}