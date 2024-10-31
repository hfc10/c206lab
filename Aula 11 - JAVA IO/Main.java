
public class Main {
    public static void main(String[] args) {


        Jogo jogo1 = new Jogo(1, "God of War", 200);
        Jogo jogo2 = new Jogo(2, "God of War 2", 250);

        Arquivo arquivo = new Arquivo();

        arquivo.escrever(jogo1);
        arquivo.escrever(jogo2);

        System.out.println("Jogo de 250 reais");
        arquivo.lerJogo(250);

        System.out.println("Todos os jogos");
        arquivo.lerJogos();

        jogo1.mostraInfos();
        jogo2.mostraInfos();

        


    }
}