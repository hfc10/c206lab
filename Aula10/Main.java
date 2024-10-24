public class Main {

    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        try {
            Livro livro1 = new Livro("", "Autor 1", 50.0);
            inventario.adicionarLivro(livro1);
        } catch (ExcecaoLivroInvalido e) {
            System.out.println("Erro ao adicionar livro 1: " + e.getMessage());
        }

        try {
            Livro livro2 = new Livro("Livro 2", "Autor 2", -10.0);
            inventario.adicionarLivro(livro2);
        } catch (ExcecaoLivroInvalido e) {
            System.out.println("Erro ao adicionar livro 2: " + e.getMessage());
        }

        try {
            Livro livro3 = new Livro("Livro 3", "Autor 3", 100.0);
            inventario.adicionarLivro(livro3);
        } catch (ExcecaoLivroInvalido e) {
            System.out.println("Erro ao adicionar livro 3: " + e.getMessage());
        }

        System.out.println("\n Livros no inventário:");
        inventario.exibirLivros();

    }
}