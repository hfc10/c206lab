import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List <Livro> Livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) throws ExcecaoLivroInvalido {

        if (livro.getTitulo().isEmpty()) {
            throw new ExcecaoLivroInvalido("O título do livro não pode ser vazio.");
        }
        if (livro.getPreco() < 0) {
            throw new ExcecaoLivroInvalido("O preço do livro não pode ser menor que zero.");
        }

        Livros.add(livro);

    }

    public void exibirLivros() {
        for (int i = 0; i < Livros.size(); i++) {
            System.out.println(Livros.get(i));
        }
    }
}
