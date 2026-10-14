package estudo_de_caso;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Livro> livros = new ArrayList<>();
    private List<Revista> revistas = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarRevista(Revista revista) {
        revistas.add(revista);
    }

    public Double totalCarrinho(){
        Double total = 0.0;
        for(Livro l : livros){
            total += l.getValor();

            for(Revista r : revistas){
                total += r.getValor();
            }
        }
        return total;
    }

    public void exibirCarrinho(){

        livros.forEach(l -> System.out.println(l.toString()));
        revistas.forEach(r -> System.out.println(r.toString()));
    }
}